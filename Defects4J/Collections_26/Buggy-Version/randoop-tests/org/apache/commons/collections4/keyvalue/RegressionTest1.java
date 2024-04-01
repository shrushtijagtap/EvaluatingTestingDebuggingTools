package org.apache.commons.collections4.keyvalue;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test501");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int3 = strComparableMultiKey2.size();
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableMultiKey2.getKey(0);
        java.lang.Class<?> wildcardClass6 = strComparableMultiKey2.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey9 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int10 = strComparableMultiKey9.size();
        java.lang.Class<?> wildcardClass11 = strComparableMultiKey9.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey14 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int15 = strComparableMultiKey14.size();
        java.lang.Class<?> wildcardClass16 = strComparableMultiKey14.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey19 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int20 = strComparableMultiKey19.size();
        java.lang.Class<?> wildcardClass21 = strComparableMultiKey19.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.GenericDeclaration> genericDeclarationMultiKey22 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.GenericDeclaration>((java.lang.reflect.GenericDeclaration) wildcardClass6, (java.lang.reflect.GenericDeclaration) wildcardClass11, (java.lang.reflect.GenericDeclaration) wildcardClass16, (java.lang.reflect.GenericDeclaration) wildcardClass21);
        java.lang.Class[] classArray24 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray25 = (java.lang.Class<?>[]) classArray24;
        wildcardClassArray25[0] = wildcardClass21;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Class<?>> wildcardClassMultiKey28 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Class<?>>(wildcardClassArray25);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.AnnotatedElement> annotatedElementMultiKey29 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.AnnotatedElement>((java.lang.reflect.AnnotatedElement[]) wildcardClassArray25);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.GenericDeclaration> genericDeclarationMultiKey31 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.GenericDeclaration>((java.lang.reflect.GenericDeclaration[]) wildcardClassArray25, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Class<?>> wildcardClassMultiKey32 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Class<?>>(wildcardClassArray25);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.GenericDeclaration> genericDeclarationMultiKey34 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.GenericDeclaration>((java.lang.reflect.GenericDeclaration[]) wildcardClassArray25, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertEquals("'" + strComparable5 + "' != '" + "" + "'", strComparable5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(classArray24);
        org.junit.Assert.assertNotNull(wildcardClassArray25);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test502");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]], , hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]], , hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey7 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int8 = strComparableMultiKey7.size();
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableMultiKey7.getKey((int) (short) 1);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey13 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int14 = strComparableMultiKey13.size();
        int int15 = strComparableMultiKey13.size();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey18 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int19 = strComparableMultiKey18.size();
        int int20 = strComparableMultiKey18.size();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey23 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int24 = strComparableMultiKey23.size();
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>> strComparableMultiKeyMultiKey25 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>>(strComparableMultiKey18, strComparableMultiKey23);
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>> strComparableMultiKeyMultiKey26 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>>(strComparableMultiKey7, strComparableMultiKey13, strComparableMultiKey18);
        java.lang.Comparable<java.lang.String> strComparable28 = strComparableMultiKey13.getKey((int) (byte) 1);
        java.lang.String[] strArray33 = new java.lang.String[] { "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey34 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray33);
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>> strComparableMultiKeyMultiKey35 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>>(strComparableMultiKey13, strComparableMultiKey34);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey38 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int39 = strComparableMultiKey38.size();
        java.lang.Comparable<java.lang.String> strComparable41 = strComparableMultiKey38.getKey((int) (short) 1);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey44 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int45 = strComparableMultiKey44.size();
        int int46 = strComparableMultiKey44.size();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey49 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int50 = strComparableMultiKey49.size();
        int int51 = strComparableMultiKey49.size();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey54 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int55 = strComparableMultiKey54.size();
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>> strComparableMultiKeyMultiKey56 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>>(strComparableMultiKey49, strComparableMultiKey54);
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>> strComparableMultiKeyMultiKey57 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>>(strComparableMultiKey38, strComparableMultiKey44, strComparableMultiKey49);
        java.lang.Comparable<java.lang.String> strComparable59 = strComparableMultiKey44.getKey((int) (byte) 1);
        java.lang.String[] strArray64 = new java.lang.String[] { "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey65 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray64);
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>> strComparableMultiKeyMultiKey66 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>>(strComparableMultiKey44, strComparableMultiKey65);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey69 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int70 = strComparableMultiKey69.size();
        int int71 = strComparableMultiKey69.size();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey74 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int75 = strComparableMultiKey74.size();
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>> strComparableMultiKeyMultiKey76 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>>(strComparableMultiKey69, strComparableMultiKey74);
        java.lang.Comparable<java.lang.String>[] strComparableArray77 = null; // flaky: strComparableMultiKey69.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey78 = null; // flaky: new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparableArray77);
        boolean boolean79 = strComparableMultiKey44.equals((java.lang.Object) strComparableArray77);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey80 = null; // flaky: new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparableArray77);
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>> strComparableMultiKeyMultiKey81 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>>(strComparableMultiKey4, strComparableMultiKey34, strComparableMultiKey80);
        java.lang.Class<?> wildcardClass82 = strComparableMultiKey4.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertEquals("'" + strComparable10 + "' != '" + "hi!" + "'", strComparable10, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertEquals("'" + strComparable28 + "' != '" + "hi!" + "'", strComparable28, "hi!");
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2 + "'", int39 == 2);
        org.junit.Assert.assertEquals("'" + strComparable41 + "' != '" + "hi!" + "'", strComparable41, "hi!");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2 + "'", int45 == 2);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 2 + "'", int46 == 2);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 2 + "'", int50 == 2);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 2 + "'", int51 == 2);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 2 + "'", int55 == 2);
        org.junit.Assert.assertEquals("'" + strComparable59 + "' != '" + "hi!" + "'", strComparable59, "hi!");
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 2 + "'", int70 == 2);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 2 + "'", int71 == 2);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 2 + "'", int75 == 2);
// flaky:         org.junit.Assert.assertNotNull(strComparableArray77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(wildcardClass82);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test503");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!, MultiKey[, hi!], null, ]", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!, MultiKey[, hi!], null, ]");
        int int4 = strComparableMultiKey3.size();
        java.lang.Comparable<java.lang.String>[] strComparableArray5 = null; // flaky: strComparableMultiKey3.getKeys();
        java.lang.Comparable<java.lang.String> strComparable9 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey11 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]", strComparable9, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String>[] strComparableArray12 = null; // flaky: strComparableMultiKey11.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey13 = null; // flaky: new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparableArray12);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey16 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int17 = strComparableMultiKey16.size();
        int int18 = strComparableMultiKey16.size();
        int int19 = strComparableMultiKey16.size();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey23 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]]", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>> strComparableMultiKeyMultiKey24 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>>(strComparableMultiKey16, strComparableMultiKey23);
        java.lang.Comparable<java.lang.String>[] strComparableArray25 = null; // flaky: strComparableMultiKey23.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>[]> strComparableArrayMultiKey26 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>[]>(strComparableArray5, strComparableArray12, strComparableArray25);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey28 = null; // flaky: new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparableArray5, true);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey29 = null; // flaky: new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparableArray5);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey30 = null; // flaky: new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparableArray5);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey31 = null; // flaky: new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparableArray5);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
// flaky:         org.junit.Assert.assertNotNull(strComparableArray5);
// flaky:         org.junit.Assert.assertNotNull(strComparableArray12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
// flaky:         org.junit.Assert.assertNotNull(strComparableArray25);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test504");
        java.lang.Comparable<java.lang.String> strComparable2 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[, hi!, MultiKey[, hi!], null, ]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], hi!, null], MultiKey[null, null, MultiKey[, hi!], MultiKey[, hi!, MultiKey[, hi!], null, ], MultiKey[, hi!, MultiKey[, hi!], null, ]], MultiKey[hi!, MultiKey[, hi!, MultiKey[, hi!], null, ], hi!, hi!], MultiKey[, , MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], hi!, ], ], MultiKey[MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]], MultiKey[, hi!, MultiKey[, hi!], null, ]]]", strComparable2, (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!, MultiKey[, hi!], null, ]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]], MultiKey[, hi!, MultiKey[, hi!], null, ]], MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]], null, null]");
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test505");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]", strComparable3, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String>[] strComparableArray6 = null; // flaky: strComparableMultiKey5.getKeys();
        java.lang.String str7 = strComparableMultiKey5.toString();
        java.lang.String str8 = strComparableMultiKey5.toString();
        int int9 = strComparableMultiKey5.size();
        java.lang.Class<?> wildcardClass10 = strComparableMultiKey5.getClass();
// flaky:         org.junit.Assert.assertNotNull(strComparableArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "MultiKey[, hi!, MultiKey[, hi!], null, ]" + "'", str7, "MultiKey[, hi!, MultiKey[, hi!], null, ]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MultiKey[, hi!, MultiKey[, hi!], null, ]" + "'", str8, "MultiKey[, hi!, MultiKey[, hi!], null, ]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test506");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[null, MultiKey[, hi!], , MultiKey[, hi!]]", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "MultiKey[null, MultiKey[, hi!], hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[null, MultiKey[, hi!], , MultiKey[, hi!]]");
        int int5 = strComparableMultiKey4.size();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test507");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int3 = strComparableMultiKey2.size();
        int int4 = strComparableMultiKey2.size();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey7 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int8 = strComparableMultiKey7.size();
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>> strComparableMultiKeyMultiKey9 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>>(strComparableMultiKey2, strComparableMultiKey7);
        boolean boolean11 = strComparableMultiKey2.equals((java.lang.Object) ' ');
        int int12 = strComparableMultiKey2.size();
        java.lang.Comparable<java.lang.String>[] strComparableArray13 = null; // flaky: strComparableMultiKey2.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey15 = null; // flaky: new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparableArray13, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey18 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]], , hi!]");
        boolean boolean19 = false; // flaky: strComparableMultiKey15.equals((java.lang.Object) "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
// flaky:         org.junit.Assert.assertNotNull(strComparableArray13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test508");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int3 = strComparableMultiKey2.size();
        int int4 = strComparableMultiKey2.size();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey7 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean8 = strComparableMultiKey2.equals((java.lang.Object) strComparableMultiKey7);
        int int9 = strComparableMultiKey7.size();
        java.lang.String str10 = strComparableMultiKey7.toString();
        java.lang.Class<?> wildcardClass11 = strComparableMultiKey7.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "MultiKey[, hi!]" + "'", str10, "MultiKey[, hi!]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test509");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[, hi!], MultiKey[, hi!, MultiKey[, hi!], null, ], MultiKey[, hi!]]", (java.lang.Comparable<java.lang.String>) "MultiKey[hi!, MultiKey[, hi!, MultiKey[, hi!], null, ], hi!, hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[, MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], hi!, ]]");
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test510");
        java.lang.String[] strArray4 = new java.lang.String[] { "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray4);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence[]) strArray4);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey7 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray4);
        org.apache.commons.collections4.keyvalue.MultiKey<java.io.Serializable> serializableMultiKey8 = new org.apache.commons.collections4.keyvalue.MultiKey<java.io.Serializable>((java.io.Serializable[]) strArray4);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String> strMultiKey10 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String>(strArray4, true);
        org.apache.commons.collections4.keyvalue.MultiKey<java.io.Serializable> serializableMultiKey11 = new org.apache.commons.collections4.keyvalue.MultiKey<java.io.Serializable>((java.io.Serializable[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test511");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[, hi!, MultiKey[, hi!], null, ]", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!, MultiKey[, hi!], null, ]", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!, MultiKey[, hi!], null, ]", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]");
        java.lang.String[] strArray10 = new java.lang.String[] { "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey11 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray10);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey12 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence[]) strArray10);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey13 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray10);
        boolean boolean14 = strComparableMultiKey5.equals((java.lang.Object) strComparableMultiKey13);
        java.lang.Class<?> wildcardClass15 = strComparableMultiKey13.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey20 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]");
        java.lang.String[] strArray25 = new java.lang.String[] { "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey26 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray25);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey27 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray25);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey29 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray25, false);
        int int30 = strComparableMultiKey29.size();
        java.lang.Comparable<java.lang.String>[] strComparableArray31 = strComparableMultiKey29.getKeys();
        boolean boolean32 = strComparableMultiKey20.equals((java.lang.Object) strComparableMultiKey29);
        java.lang.Class<?> wildcardClass33 = strComparableMultiKey20.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey37 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[, hi!, MultiKey[, hi!], null, ]", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], hi!, null]");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey40 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int41 = strComparableMultiKey40.size();
        java.lang.Comparable<java.lang.String> strComparable43 = strComparableMultiKey40.getKey(0);
        java.lang.Class<?> wildcardClass44 = strComparableMultiKey40.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey47 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int48 = strComparableMultiKey47.size();
        java.lang.Class<?> wildcardClass49 = strComparableMultiKey47.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey52 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int53 = strComparableMultiKey52.size();
        java.lang.Class<?> wildcardClass54 = strComparableMultiKey52.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey57 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int58 = strComparableMultiKey57.size();
        java.lang.Class<?> wildcardClass59 = strComparableMultiKey57.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.GenericDeclaration> genericDeclarationMultiKey60 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.GenericDeclaration>((java.lang.reflect.GenericDeclaration) wildcardClass44, (java.lang.reflect.GenericDeclaration) wildcardClass49, (java.lang.reflect.GenericDeclaration) wildcardClass54, (java.lang.reflect.GenericDeclaration) wildcardClass59);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey63 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int64 = strComparableMultiKey63.size();
        java.lang.Comparable<java.lang.String> strComparable66 = strComparableMultiKey63.getKey(0);
        java.lang.Class<?> wildcardClass67 = strComparableMultiKey63.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey70 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int71 = strComparableMultiKey70.size();
        java.lang.Class<?> wildcardClass72 = strComparableMultiKey70.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey75 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int76 = strComparableMultiKey75.size();
        java.lang.Class<?> wildcardClass77 = strComparableMultiKey75.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey80 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int81 = strComparableMultiKey80.size();
        java.lang.Class<?> wildcardClass82 = strComparableMultiKey80.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.GenericDeclaration> genericDeclarationMultiKey83 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.GenericDeclaration>((java.lang.reflect.GenericDeclaration) wildcardClass67, (java.lang.reflect.GenericDeclaration) wildcardClass72, (java.lang.reflect.GenericDeclaration) wildcardClass77, (java.lang.reflect.GenericDeclaration) wildcardClass82);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey86 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int87 = strComparableMultiKey86.size();
        java.lang.Class<?> wildcardClass88 = strComparableMultiKey86.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey91 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int92 = strComparableMultiKey91.size();
        java.lang.Comparable<java.lang.String> strComparable94 = strComparableMultiKey91.getKey(0);
        java.lang.Class<?> wildcardClass95 = strComparableMultiKey91.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.GenericDeclaration> genericDeclarationMultiKey96 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.GenericDeclaration>((java.lang.reflect.GenericDeclaration) wildcardClass49, (java.lang.reflect.GenericDeclaration) wildcardClass67, (java.lang.reflect.GenericDeclaration) wildcardClass88, (java.lang.reflect.GenericDeclaration) wildcardClass95);
        boolean boolean97 = strComparableMultiKey37.equals((java.lang.Object) wildcardClass67);
        java.lang.reflect.GenericDeclaration genericDeclaration98 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.GenericDeclaration> genericDeclarationMultiKey99 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.GenericDeclaration>((java.lang.reflect.GenericDeclaration) wildcardClass15, (java.lang.reflect.GenericDeclaration) wildcardClass33, (java.lang.reflect.GenericDeclaration) wildcardClass67, genericDeclaration98);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4 + "'", int30 == 4);
        org.junit.Assert.assertNotNull(strComparableArray31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 2 + "'", int41 == 2);
        org.junit.Assert.assertEquals("'" + strComparable43 + "' != '" + "" + "'", strComparable43, "");
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 2 + "'", int48 == 2);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 2 + "'", int53 == 2);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 2 + "'", int58 == 2);
        org.junit.Assert.assertNotNull(wildcardClass59);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 2 + "'", int64 == 2);
        org.junit.Assert.assertEquals("'" + strComparable66 + "' != '" + "" + "'", strComparable66, "");
        org.junit.Assert.assertNotNull(wildcardClass67);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 2 + "'", int71 == 2);
        org.junit.Assert.assertNotNull(wildcardClass72);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 2 + "'", int76 == 2);
        org.junit.Assert.assertNotNull(wildcardClass77);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 2 + "'", int81 == 2);
        org.junit.Assert.assertNotNull(wildcardClass82);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 2 + "'", int87 == 2);
        org.junit.Assert.assertNotNull(wildcardClass88);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 2 + "'", int92 == 2);
        org.junit.Assert.assertEquals("'" + strComparable94 + "' != '" + "" + "'", strComparable94, "");
        org.junit.Assert.assertNotNull(wildcardClass95);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test512");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int3 = strComparableMultiKey2.size();
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableMultiKey2.getKey((int) (short) 1);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey8 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int9 = strComparableMultiKey8.size();
        int int10 = strComparableMultiKey8.size();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey13 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int14 = strComparableMultiKey13.size();
        int int15 = strComparableMultiKey13.size();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey18 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int19 = strComparableMultiKey18.size();
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>> strComparableMultiKeyMultiKey20 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>>(strComparableMultiKey13, strComparableMultiKey18);
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>> strComparableMultiKeyMultiKey21 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>>(strComparableMultiKey2, strComparableMultiKey8, strComparableMultiKey13);
        java.lang.Comparable<java.lang.String> strComparable23 = strComparableMultiKey8.getKey((int) (byte) 1);
        java.lang.Comparable<java.lang.String> strComparable25 = strComparableMultiKey8.getKey(0);
        java.lang.Comparable<java.lang.String> strComparable27 = strComparableMultiKey8.getKey(0);
        java.lang.Comparable<java.lang.String> strComparable29 = strComparableMultiKey8.getKey(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertEquals("'" + strComparable5 + "' != '" + "hi!" + "'", strComparable5, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertEquals("'" + strComparable23 + "' != '" + "hi!" + "'", strComparable23, "hi!");
        org.junit.Assert.assertEquals("'" + strComparable25 + "' != '" + "" + "'", strComparable25, "");
        org.junit.Assert.assertEquals("'" + strComparable27 + "' != '" + "" + "'", strComparable27, "");
        org.junit.Assert.assertEquals("'" + strComparable29 + "' != '" + "" + "'", strComparable29, "");
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test513");
        java.lang.String[][] strArray0 = new java.lang.String[][] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]> strArrayMultiKey1 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]>(strArray0);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]> strArrayMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]>(strArray0, false);
        java.lang.Class<?> wildcardClass4 = strArray0.getClass();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test514");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int3 = strComparableMultiKey2.size();
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableMultiKey2.getKey(0);
        java.lang.Class<?> wildcardClass6 = strComparableMultiKey2.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey9 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int10 = strComparableMultiKey9.size();
        java.lang.Class<?> wildcardClass11 = strComparableMultiKey9.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey14 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int15 = strComparableMultiKey14.size();
        java.lang.Class<?> wildcardClass16 = strComparableMultiKey14.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey19 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int20 = strComparableMultiKey19.size();
        java.lang.Class<?> wildcardClass21 = strComparableMultiKey19.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.GenericDeclaration> genericDeclarationMultiKey22 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.GenericDeclaration>((java.lang.reflect.GenericDeclaration) wildcardClass6, (java.lang.reflect.GenericDeclaration) wildcardClass11, (java.lang.reflect.GenericDeclaration) wildcardClass16, (java.lang.reflect.GenericDeclaration) wildcardClass21);
        java.lang.Class[] classArray24 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray25 = (java.lang.Class<?>[]) classArray24;
        wildcardClassArray25[0] = wildcardClass21;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Class<?>> wildcardClassMultiKey28 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Class<?>>(wildcardClassArray25);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.AnnotatedElement> annotatedElementMultiKey29 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.AnnotatedElement>((java.lang.reflect.AnnotatedElement[]) wildcardClassArray25);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey32 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int33 = strComparableMultiKey32.size();
        java.lang.Comparable<java.lang.String> strComparable35 = strComparableMultiKey32.getKey(0);
        java.lang.Class<?> wildcardClass36 = strComparableMultiKey32.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey39 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int40 = strComparableMultiKey39.size();
        java.lang.Class<?> wildcardClass41 = strComparableMultiKey39.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey44 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int45 = strComparableMultiKey44.size();
        java.lang.Class<?> wildcardClass46 = strComparableMultiKey44.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey49 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int50 = strComparableMultiKey49.size();
        java.lang.Class<?> wildcardClass51 = strComparableMultiKey49.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.GenericDeclaration> genericDeclarationMultiKey52 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.GenericDeclaration>((java.lang.reflect.GenericDeclaration) wildcardClass36, (java.lang.reflect.GenericDeclaration) wildcardClass41, (java.lang.reflect.GenericDeclaration) wildcardClass46, (java.lang.reflect.GenericDeclaration) wildcardClass51);
        java.lang.Class[] classArray54 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray55 = (java.lang.Class<?>[]) classArray54;
        wildcardClassArray55[0] = wildcardClass51;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Class<?>> wildcardClassMultiKey58 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Class<?>>(wildcardClassArray55);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.AnnotatedElement> annotatedElementMultiKey59 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.AnnotatedElement>((java.lang.reflect.AnnotatedElement[]) wildcardClassArray55);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey62 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int63 = strComparableMultiKey62.size();
        java.lang.Comparable<java.lang.String> strComparable65 = strComparableMultiKey62.getKey(0);
        java.lang.Class<?> wildcardClass66 = strComparableMultiKey62.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey69 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int70 = strComparableMultiKey69.size();
        java.lang.Class<?> wildcardClass71 = strComparableMultiKey69.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey74 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int75 = strComparableMultiKey74.size();
        java.lang.Class<?> wildcardClass76 = strComparableMultiKey74.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey79 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int80 = strComparableMultiKey79.size();
        java.lang.Class<?> wildcardClass81 = strComparableMultiKey79.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.GenericDeclaration> genericDeclarationMultiKey82 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.GenericDeclaration>((java.lang.reflect.GenericDeclaration) wildcardClass66, (java.lang.reflect.GenericDeclaration) wildcardClass71, (java.lang.reflect.GenericDeclaration) wildcardClass76, (java.lang.reflect.GenericDeclaration) wildcardClass81);
        java.lang.Class[] classArray84 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray85 = (java.lang.Class<?>[]) classArray84;
        wildcardClassArray85[0] = wildcardClass81;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Class<?>> wildcardClassMultiKey88 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Class<?>>(wildcardClassArray85);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.AnnotatedElement> annotatedElementMultiKey89 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.AnnotatedElement>((java.lang.reflect.AnnotatedElement[]) wildcardClassArray85);
        java.lang.Class[] classArray91 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray92 = (java.lang.Class<?>[]) classArray91;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Class<?>[]> wildcardClassArrayMultiKey93 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Class<?>[]>(wildcardClassArray25, wildcardClassArray55, wildcardClassArray85, wildcardClassArray92);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Class<?>> wildcardClassMultiKey95 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Class<?>>(wildcardClassArray92, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type> typeMultiKey96 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type>((java.lang.reflect.Type[]) wildcardClassArray92);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertEquals("'" + strComparable5 + "' != '" + "" + "'", strComparable5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(classArray24);
        org.junit.Assert.assertNotNull(wildcardClassArray25);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2 + "'", int33 == 2);
        org.junit.Assert.assertEquals("'" + strComparable35 + "' != '" + "" + "'", strComparable35, "");
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 2 + "'", int40 == 2);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2 + "'", int45 == 2);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 2 + "'", int50 == 2);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNotNull(classArray54);
        org.junit.Assert.assertNotNull(wildcardClassArray55);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 2 + "'", int63 == 2);
        org.junit.Assert.assertEquals("'" + strComparable65 + "' != '" + "" + "'", strComparable65, "");
        org.junit.Assert.assertNotNull(wildcardClass66);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 2 + "'", int70 == 2);
        org.junit.Assert.assertNotNull(wildcardClass71);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 2 + "'", int75 == 2);
        org.junit.Assert.assertNotNull(wildcardClass76);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 2 + "'", int80 == 2);
        org.junit.Assert.assertNotNull(wildcardClass81);
        org.junit.Assert.assertNotNull(classArray84);
        org.junit.Assert.assertNotNull(wildcardClassArray85);
        org.junit.Assert.assertNotNull(classArray91);
        org.junit.Assert.assertNotNull(wildcardClassArray92);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test515");
        java.lang.Comparable<java.lang.String> strComparable2 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]], , hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[, hi!], MultiKey[, hi!, MultiKey[, hi!], null, ], MultiKey[, hi!]], MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], hi!, null], MultiKey[null, MultiKey[, hi!], , MultiKey[, hi!]], hi!]", strComparable2, (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[, , MultiKey[, hi!, MultiKey[, hi!], null, ], ]");
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test516");
        java.lang.Comparable<java.lang.String> strComparable0 = null;
        java.lang.Comparable<java.lang.String> strComparable2 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparable0, (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!, MultiKey[, hi!], null, ]", strComparable2);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test517");
        java.lang.String[] strArray4 = new java.lang.String[] { "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray4);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey7 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray4, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey10 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int11 = strComparableMultiKey10.size();
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableMultiKey10.getKey((int) (short) 1);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey16 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int17 = strComparableMultiKey16.size();
        int int18 = strComparableMultiKey16.size();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey21 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int22 = strComparableMultiKey21.size();
        int int23 = strComparableMultiKey21.size();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey26 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int27 = strComparableMultiKey26.size();
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>> strComparableMultiKeyMultiKey28 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>>(strComparableMultiKey21, strComparableMultiKey26);
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>> strComparableMultiKeyMultiKey29 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>>(strComparableMultiKey10, strComparableMultiKey16, strComparableMultiKey21);
        java.lang.Comparable<java.lang.String> strComparable31 = strComparableMultiKey16.getKey((int) (byte) 1);
        boolean boolean32 = strComparableMultiKey7.equals((java.lang.Object) strComparableMultiKey16);
        java.lang.String str33 = strComparableMultiKey7.toString();
        java.lang.Comparable<java.lang.String> strComparable34 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey38 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparable34, (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]");
        int int39 = strComparableMultiKey38.size();
        int int40 = strComparableMultiKey38.size();
        boolean boolean41 = strComparableMultiKey7.equals((java.lang.Object) strComparableMultiKey38);
        java.lang.Comparable<java.lang.String>[] strComparableArray42 = null; // flaky: strComparableMultiKey38.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey44 = null; // flaky: new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparableArray42, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey45 = null; // flaky: new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparableArray42);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertEquals("'" + strComparable13 + "' != '" + "hi!" + "'", strComparable13, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertEquals("'" + strComparable31 + "' != '" + "hi!" + "'", strComparable31, "hi!");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]]" + "'", str33, "MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]]");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 4 + "'", int39 == 4);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 4 + "'", int40 == 4);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
// flaky:         org.junit.Assert.assertNotNull(strComparableArray42);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test518");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[, , MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], hi!, ], ]", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], hi!, ]");
        int int5 = strComparableMultiKey4.size();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test519");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[, hi!, MultiKey[, hi!], null, ]", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]]", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!, MultiKey[, hi!], null, ]");
        boolean boolean7 = strComparableMultiKey5.equals((java.lang.Object) 10);
        java.lang.String str8 = strComparableMultiKey5.toString();
        int int9 = strComparableMultiKey5.size();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MultiKey[MultiKey[, hi!, MultiKey[, hi!], null, ], hi!, MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]], hi!, MultiKey[, hi!, MultiKey[, hi!], null, ]]" + "'", str8, "MultiKey[MultiKey[, hi!, MultiKey[, hi!], null, ], hi!, MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]], hi!, MultiKey[, hi!, MultiKey[, hi!], null, ]]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test520");
        java.lang.Comparable<java.lang.String> strComparable0 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparable0, (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], hi!, null], MultiKey[null, null, MultiKey[, hi!], MultiKey[, hi!, MultiKey[, hi!], null, ], MultiKey[, hi!, MultiKey[, hi!], null, ]], MultiKey[hi!, MultiKey[, hi!, MultiKey[, hi!], null, ], hi!, hi!], MultiKey[, , MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], hi!, ], ], MultiKey[MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]], MultiKey[, hi!, MultiKey[, hi!], null, ]]]", (java.lang.Comparable<java.lang.String>) "MultiKey[null, MultiKey[, hi!], hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[hi!, ]");
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test521");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]], MultiKey[, hi!, MultiKey[, hi!], null, ]], MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]], null, null]", (java.lang.Comparable<java.lang.String>) "MultiKey[, MultiKey[, hi!], MultiKey[MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]], MultiKey[, hi!, MultiKey[, hi!], null, ]]]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[, hi!], MultiKey[, hi!, MultiKey[, hi!], null, ], MultiKey[, hi!]], MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], hi!, null], MultiKey[null, MultiKey[, hi!], , MultiKey[, hi!]], hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[, , MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], hi!, ], ]", (java.lang.Comparable<java.lang.String>) "MultiKey[hi!, MultiKey[, hi!, MultiKey[, hi!], null, ], MultiKey[, hi!, MultiKey[, hi!], null, ]]");
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test522");
        java.lang.String[] strArray5 = new java.lang.String[] { "MultiKey[, hi!]", "MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]]", "", "hi!", "MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]]" };
        java.lang.String[] strArray10 = new java.lang.String[] { "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey11 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray10);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey12 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence[]) strArray10);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey13 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray10);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey15 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray10, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey17 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray10, true);
        java.lang.String[] strArray22 = new java.lang.String[] { "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey23 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray22);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey24 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence[]) strArray22);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey25 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray22);
        org.apache.commons.collections4.keyvalue.MultiKey<java.io.Serializable> serializableMultiKey26 = new org.apache.commons.collections4.keyvalue.MultiKey<java.io.Serializable>((java.io.Serializable[]) strArray22);
        java.lang.String[] strArray31 = new java.lang.String[] { "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey32 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray31);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey33 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray31);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey35 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray31, false);
        int int36 = strComparableMultiKey35.size();
        java.lang.Comparable<java.lang.String>[] strComparableArray37 = strComparableMultiKey35.getKeys();
        java.lang.String[] strArray42 = new java.lang.String[] { "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey43 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray42);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey44 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence[]) strArray42);
        java.lang.String[] strArray49 = new java.lang.String[] { "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey50 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray49);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey51 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray49);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey53 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray49, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey54 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray49);
        java.lang.String[] strArray59 = new java.lang.String[] { "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey60 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray59);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey61 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence[]) strArray59);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey62 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray59);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey64 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray59, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey66 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray59, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[]> charSequenceArrayMultiKey67 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[]>((java.lang.CharSequence[]) strArray42, (java.lang.CharSequence[]) strArray49, (java.lang.CharSequence[]) strArray59);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>[]> strComparableArrayMultiKey68 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>[]>((java.lang.Comparable<java.lang.String>[]) strArray5, (java.lang.Comparable<java.lang.String>[]) strArray10, (java.lang.Comparable<java.lang.String>[]) strArray22, strComparableArray37, (java.lang.Comparable<java.lang.String>[]) strArray59);
        java.lang.String[] strArray69 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]> strArrayMultiKey70 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]>(strArray59, strArray69);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey72 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence[]) strArray59, true);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 4 + "'", int36 == 4);
        org.junit.Assert.assertNotNull(strComparableArray37);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertNotNull(strArray59);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test523");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], hi!, ]", (java.lang.Comparable<java.lang.String>) "");
        int int5 = strComparableMultiKey4.size();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test524");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]", strComparable3, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String>[] strComparableArray6 = null; // flaky: strComparableMultiKey5.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey9 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int10 = strComparableMultiKey9.size();
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableMultiKey9.getKey((int) (short) 1);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey15 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int16 = strComparableMultiKey15.size();
        int int17 = strComparableMultiKey15.size();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey20 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int21 = strComparableMultiKey20.size();
        int int22 = strComparableMultiKey20.size();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey25 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int26 = strComparableMultiKey25.size();
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>> strComparableMultiKeyMultiKey27 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>>(strComparableMultiKey20, strComparableMultiKey25);
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>> strComparableMultiKeyMultiKey28 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>>(strComparableMultiKey9, strComparableMultiKey15, strComparableMultiKey20);
        int int29 = strComparableMultiKey20.size();
        java.lang.String str30 = strComparableMultiKey20.toString();
        java.lang.String[] strArray35 = new java.lang.String[] { "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey36 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray35);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey37 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence[]) strArray35);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey38 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray35);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey40 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray35, false);
        boolean boolean41 = strComparableMultiKey20.equals((java.lang.Object) false);
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>> strComparableMultiKeyMultiKey42 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>>(strComparableMultiKey5, strComparableMultiKey20);
        int int43 = strComparableMultiKey5.size();
// flaky:         org.junit.Assert.assertNotNull(strComparableArray6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertEquals("'" + strComparable12 + "' != '" + "hi!" + "'", strComparable12, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2 + "'", int29 == 2);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "MultiKey[, hi!]" + "'", str30, "MultiKey[, hi!]");
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 5 + "'", int43 == 5);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test525");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[, , MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], hi!, ], ]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]]");
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test526");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]", strComparable3, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String>[] strComparableArray6 = null; // flaky: strComparableMultiKey5.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey7 = null; // flaky: new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparableArray6);
        int int8 = 0; // flaky: strComparableMultiKey7.size();
        java.lang.Comparable<java.lang.String>[] strComparableArray9 = null; // flaky: strComparableMultiKey7.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey10 = null; // flaky: new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparableArray9);
// flaky:         org.junit.Assert.assertNotNull(strComparableArray6);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
// flaky:         org.junit.Assert.assertNotNull(strComparableArray9);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test527");
        java.lang.Comparable<java.lang.String> strComparable2 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[, hi!, MultiKey[, hi!], null, ], hi!, MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]], hi!, MultiKey[, hi!, MultiKey[, hi!], null, ]]", (java.lang.Comparable<java.lang.String>) "", strComparable2, (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[null, null, MultiKey[, hi!], MultiKey[, hi!, MultiKey[, hi!], null, ], MultiKey[, hi!, MultiKey[, hi!], null, ]], null]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]]");
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test528");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[hi!, MultiKey[, hi!, MultiKey[, hi!], null, ], hi!, hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[null, null, MultiKey[, hi!], MultiKey[, hi!, MultiKey[, hi!], null, ], MultiKey[, hi!, MultiKey[, hi!], null, ]]");
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test529");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], hi!, null]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], hi!, null]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]]", (java.lang.Comparable<java.lang.String>) "MultiKey[null, null, MultiKey[, hi!], MultiKey[, hi!, MultiKey[, hi!], null, ], MultiKey[, hi!, MultiKey[, hi!], null, ]]");
        int int5 = strComparableMultiKey4.size();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test530");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int3 = strComparableMultiKey2.size();
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableMultiKey2.getKey((int) (short) 1);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey8 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int9 = strComparableMultiKey8.size();
        int int10 = strComparableMultiKey8.size();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey13 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int14 = strComparableMultiKey13.size();
        int int15 = strComparableMultiKey13.size();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey18 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int19 = strComparableMultiKey18.size();
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>> strComparableMultiKeyMultiKey20 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>>(strComparableMultiKey13, strComparableMultiKey18);
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>> strComparableMultiKeyMultiKey21 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>>(strComparableMultiKey2, strComparableMultiKey8, strComparableMultiKey13);
        java.lang.Comparable<java.lang.String> strComparable23 = strComparableMultiKey8.getKey((int) (byte) 1);
        java.lang.String[] strArray28 = new java.lang.String[] { "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey29 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray28);
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>> strComparableMultiKeyMultiKey30 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>>(strComparableMultiKey8, strComparableMultiKey29);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey33 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int34 = strComparableMultiKey33.size();
        java.lang.Comparable<java.lang.String> strComparable36 = strComparableMultiKey33.getKey(0);
        java.lang.Class<?> wildcardClass37 = strComparableMultiKey33.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey40 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int41 = strComparableMultiKey40.size();
        java.lang.Class<?> wildcardClass42 = strComparableMultiKey40.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey45 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int46 = strComparableMultiKey45.size();
        java.lang.Class<?> wildcardClass47 = strComparableMultiKey45.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey50 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int51 = strComparableMultiKey50.size();
        java.lang.Class<?> wildcardClass52 = strComparableMultiKey50.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.GenericDeclaration> genericDeclarationMultiKey53 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.GenericDeclaration>((java.lang.reflect.GenericDeclaration) wildcardClass37, (java.lang.reflect.GenericDeclaration) wildcardClass42, (java.lang.reflect.GenericDeclaration) wildcardClass47, (java.lang.reflect.GenericDeclaration) wildcardClass52);
        java.lang.Class[] classArray55 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray56 = (java.lang.Class<?>[]) classArray55;
        wildcardClassArray56[0] = wildcardClass52;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Class<?>> wildcardClassMultiKey59 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Class<?>>(wildcardClassArray56);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.AnnotatedElement> annotatedElementMultiKey60 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.AnnotatedElement>((java.lang.reflect.AnnotatedElement[]) wildcardClassArray56);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.GenericDeclaration> genericDeclarationMultiKey62 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.GenericDeclaration>((java.lang.reflect.GenericDeclaration[]) wildcardClassArray56, false);
        boolean boolean63 = strComparableMultiKey29.equals((java.lang.Object) genericDeclarationMultiKey62);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertEquals("'" + strComparable5 + "' != '" + "hi!" + "'", strComparable5, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertEquals("'" + strComparable23 + "' != '" + "hi!" + "'", strComparable23, "hi!");
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2 + "'", int34 == 2);
        org.junit.Assert.assertEquals("'" + strComparable36 + "' != '" + "" + "'", strComparable36, "");
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 2 + "'", int41 == 2);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 2 + "'", int46 == 2);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 2 + "'", int51 == 2);
        org.junit.Assert.assertNotNull(wildcardClass52);
        org.junit.Assert.assertNotNull(classArray55);
        org.junit.Assert.assertNotNull(wildcardClassArray56);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test531");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]", strComparable3, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String>[] strComparableArray6 = null; // flaky: strComparableMultiKey5.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey8 = null; // flaky: new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparableArray6, false);
// flaky:         org.junit.Assert.assertNotNull(strComparableArray6);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test532");
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[, MultiKey[, hi!], MultiKey[MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]], MultiKey[, hi!, MultiKey[, hi!], null, ]]]", strComparable1, (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], hi!, null], MultiKey[null, null, MultiKey[, hi!], MultiKey[, hi!, MultiKey[, hi!], null, ], MultiKey[, hi!, MultiKey[, hi!], null, ]], MultiKey[hi!, MultiKey[, hi!, MultiKey[, hi!], null, ], hi!, hi!], MultiKey[, , MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], hi!, ], ], MultiKey[MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]], MultiKey[, hi!, MultiKey[, hi!], null, ]]]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[, hi!], , MultiKey[, hi!], null, ], MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], hi!, ]]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], hi!, ]");
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test533");
        java.lang.Comparable<java.lang.String> strComparable0 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparable0, (java.lang.Comparable<java.lang.String>) "MultiKey[null, MultiKey[, hi!], , MultiKey[, hi!]]", (java.lang.Comparable<java.lang.String>) "MultiKey[hi!, MultiKey[, hi!, MultiKey[, hi!], null, ], MultiKey[, hi!, MultiKey[, hi!], null, ]]");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableMultiKey3.getKey(1);
        org.junit.Assert.assertEquals("'" + strComparable5 + "' != '" + "MultiKey[null, MultiKey[, hi!], , MultiKey[, hi!]]" + "'", strComparable5, "MultiKey[null, MultiKey[, hi!], , MultiKey[, hi!]]");
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test534");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[hi!, MultiKey[, hi!, MultiKey[, hi!], null, ], hi!, hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[null, MultiKey[, hi!], , MultiKey[, hi!]]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]], MultiKey[, hi!, MultiKey[, hi!], null, ]], MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]], null, null]", (java.lang.Comparable<java.lang.String>) "MultiKey[, , MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], hi!, ], ]");
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test535");
        java.lang.String[] strArray0 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray5);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey7 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence[]) strArray5);
        java.lang.String[] strArray12 = new java.lang.String[] { "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey13 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray12);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey14 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray12);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey16 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray12, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey17 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray12);
        java.lang.String[] strArray22 = new java.lang.String[] { "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey23 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray22);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey24 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence[]) strArray22);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey25 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray22);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey27 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray22, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey29 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray22, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[]> charSequenceArrayMultiKey30 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[]>((java.lang.CharSequence[]) strArray5, (java.lang.CharSequence[]) strArray12, (java.lang.CharSequence[]) strArray22);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]> strArrayMultiKey31 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]>(strArray0, strArray5);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey32 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray5);
        java.lang.Class<?> wildcardClass33 = strArray5.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test536");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[, MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], hi!, ]]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], hi!, null], , MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], hi!, null]]", (java.lang.Comparable<java.lang.String>) "MultiKey[null, MultiKey[, hi!], hi!]");
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test537");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int3 = strComparableMultiKey2.size();
        int int4 = strComparableMultiKey2.size();
        boolean boolean6 = strComparableMultiKey2.equals((java.lang.Object) (-1));
        int int7 = strComparableMultiKey2.size();
        int int8 = strComparableMultiKey2.size();
        java.lang.Class<?> wildcardClass9 = strComparableMultiKey2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test538");
        java.lang.String[] strArray4 = new java.lang.String[] { "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray4);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence[]) strArray4);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey7 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray4);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey8 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray4);
        int int9 = strComparableMultiKey8.size();
        java.lang.String str10 = strComparableMultiKey8.toString();
        java.lang.String str11 = strComparableMultiKey8.toString();
        java.lang.Comparable<java.lang.String>[] strComparableArray12 = strComparableMultiKey8.getKeys();
        int int13 = strComparableMultiKey8.size();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]]" + "'", str10, "MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]]" + "'", str11, "MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]]");
        org.junit.Assert.assertNotNull(strComparableArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test539");
        java.lang.Comparable<java.lang.String> strComparable0 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparable0, (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]], , hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[hi!, MultiKey[, hi!, MultiKey[, hi!], null, ], hi!, hi!]");
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test540");
        java.lang.String[] strArray4 = new java.lang.String[] { "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray4);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence[]) strArray4);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey7 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray4);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey8 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray4);
        int int9 = strComparableMultiKey8.size();
        java.lang.String str10 = strComparableMultiKey8.toString();
        java.lang.String str11 = strComparableMultiKey8.toString();
        java.lang.String str12 = strComparableMultiKey8.toString();
        java.lang.String str13 = strComparableMultiKey8.toString();
        int int14 = strComparableMultiKey8.size();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]]" + "'", str10, "MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]]" + "'", str11, "MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]]" + "'", str12, "MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]]" + "'", str13, "MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test541");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[, , MultiKey[, hi!, MultiKey[, hi!], null, ], ]", (java.lang.Comparable<java.lang.String>) "MultiKey[null, MultiKey[, hi!], , MultiKey[, hi!]]");
        java.lang.Comparable<java.lang.String>[] strComparableArray3 = null; // flaky: strComparableMultiKey2.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey4 = null; // flaky: new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparableArray3);
// flaky:         org.junit.Assert.assertNotNull(strComparableArray3);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test542");
        java.lang.String[] strArray4 = new java.lang.String[] { "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray4);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey7 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray4, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey10 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int11 = strComparableMultiKey10.size();
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableMultiKey10.getKey((int) (short) 1);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey16 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int17 = strComparableMultiKey16.size();
        int int18 = strComparableMultiKey16.size();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey21 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int22 = strComparableMultiKey21.size();
        int int23 = strComparableMultiKey21.size();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey26 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int27 = strComparableMultiKey26.size();
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>> strComparableMultiKeyMultiKey28 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>>(strComparableMultiKey21, strComparableMultiKey26);
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>> strComparableMultiKeyMultiKey29 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>>(strComparableMultiKey10, strComparableMultiKey16, strComparableMultiKey21);
        java.lang.Comparable<java.lang.String> strComparable31 = strComparableMultiKey16.getKey((int) (byte) 1);
        boolean boolean32 = strComparableMultiKey7.equals((java.lang.Object) strComparableMultiKey16);
        java.lang.String str33 = strComparableMultiKey7.toString();
        java.lang.String[] strArray38 = new java.lang.String[] { "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey39 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray38);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey40 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray38);
        java.lang.Comparable<java.lang.String> strComparable42 = strComparableMultiKey40.getKey((int) (short) 0);
        int int43 = strComparableMultiKey40.size();
        boolean boolean44 = strComparableMultiKey7.equals((java.lang.Object) strComparableMultiKey40);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey47 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int48 = strComparableMultiKey47.size();
        int int49 = strComparableMultiKey47.size();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey52 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean53 = strComparableMultiKey47.equals((java.lang.Object) strComparableMultiKey52);
        int int54 = strComparableMultiKey52.size();
        boolean boolean55 = strComparableMultiKey40.equals((java.lang.Object) int54);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertEquals("'" + strComparable13 + "' != '" + "hi!" + "'", strComparable13, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertEquals("'" + strComparable31 + "' != '" + "hi!" + "'", strComparable31, "hi!");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]]" + "'", str33, "MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]]");
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertEquals("'" + strComparable42 + "' != '" + "MultiKey[, hi!]" + "'", strComparable42, "MultiKey[, hi!]");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 4 + "'", int43 == 4);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 2 + "'", int48 == 2);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 2 + "'", int49 == 2);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 2 + "'", int54 == 2);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test543");
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[, hi!, MultiKey[, hi!], null, ]", strComparable1, (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], hi!, null], MultiKey[null, null, MultiKey[, hi!], MultiKey[, hi!, MultiKey[, hi!], null, ], MultiKey[, hi!, MultiKey[, hi!], null, ]], MultiKey[hi!, MultiKey[, hi!, MultiKey[, hi!], null, ], hi!, hi!], MultiKey[, , MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], hi!, ], ], MultiKey[MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]], MultiKey[, hi!, MultiKey[, hi!], null, ]]]", (java.lang.Comparable<java.lang.String>) "MultiKey[hi!, MultiKey[, hi!, MultiKey[, hi!], null, ], MultiKey[, hi!, MultiKey[, hi!], null, ]]", (java.lang.Comparable<java.lang.String>) "MultiKey[, MultiKey[, hi!], MultiKey[MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]], MultiKey[, hi!, MultiKey[, hi!], null, ]]]");
        int int6 = strComparableMultiKey5.size();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test544");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int3 = strComparableMultiKey2.size();
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableMultiKey2.getKey(0);
        java.lang.Class<?> wildcardClass6 = strComparableMultiKey2.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey9 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int10 = strComparableMultiKey9.size();
        java.lang.Class<?> wildcardClass11 = strComparableMultiKey9.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey14 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int15 = strComparableMultiKey14.size();
        java.lang.Class<?> wildcardClass16 = strComparableMultiKey14.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey19 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int20 = strComparableMultiKey19.size();
        java.lang.Class<?> wildcardClass21 = strComparableMultiKey19.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.GenericDeclaration> genericDeclarationMultiKey22 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.GenericDeclaration>((java.lang.reflect.GenericDeclaration) wildcardClass6, (java.lang.reflect.GenericDeclaration) wildcardClass11, (java.lang.reflect.GenericDeclaration) wildcardClass16, (java.lang.reflect.GenericDeclaration) wildcardClass21);
        java.lang.Class[] classArray24 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray25 = (java.lang.Class<?>[]) classArray24;
        wildcardClassArray25[0] = wildcardClass21;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Class<?>> wildcardClassMultiKey28 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Class<?>>(wildcardClassArray25);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.AnnotatedElement> annotatedElementMultiKey29 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.AnnotatedElement>((java.lang.reflect.AnnotatedElement[]) wildcardClassArray25);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey32 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int33 = strComparableMultiKey32.size();
        java.lang.Comparable<java.lang.String> strComparable35 = strComparableMultiKey32.getKey(0);
        java.lang.Class<?> wildcardClass36 = strComparableMultiKey32.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey39 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int40 = strComparableMultiKey39.size();
        java.lang.Class<?> wildcardClass41 = strComparableMultiKey39.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey44 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int45 = strComparableMultiKey44.size();
        java.lang.Class<?> wildcardClass46 = strComparableMultiKey44.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey49 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int50 = strComparableMultiKey49.size();
        java.lang.Class<?> wildcardClass51 = strComparableMultiKey49.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.GenericDeclaration> genericDeclarationMultiKey52 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.GenericDeclaration>((java.lang.reflect.GenericDeclaration) wildcardClass36, (java.lang.reflect.GenericDeclaration) wildcardClass41, (java.lang.reflect.GenericDeclaration) wildcardClass46, (java.lang.reflect.GenericDeclaration) wildcardClass51);
        java.lang.Class[] classArray54 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray55 = (java.lang.Class<?>[]) classArray54;
        wildcardClassArray55[0] = wildcardClass51;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Class<?>> wildcardClassMultiKey58 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Class<?>>(wildcardClassArray55);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.AnnotatedElement> annotatedElementMultiKey59 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.AnnotatedElement>((java.lang.reflect.AnnotatedElement[]) wildcardClassArray55);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.GenericDeclaration> genericDeclarationMultiKey61 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.GenericDeclaration>((java.lang.reflect.GenericDeclaration[]) wildcardClassArray55, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[]> typeArrayMultiKey62 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[]>((java.lang.reflect.Type[]) wildcardClassArray25, (java.lang.reflect.Type[]) wildcardClassArray55);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.AnnotatedElement> annotatedElementMultiKey63 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.AnnotatedElement>((java.lang.reflect.AnnotatedElement[]) wildcardClassArray25);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertEquals("'" + strComparable5 + "' != '" + "" + "'", strComparable5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(classArray24);
        org.junit.Assert.assertNotNull(wildcardClassArray25);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2 + "'", int33 == 2);
        org.junit.Assert.assertEquals("'" + strComparable35 + "' != '" + "" + "'", strComparable35, "");
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 2 + "'", int40 == 2);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2 + "'", int45 == 2);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 2 + "'", int50 == 2);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNotNull(classArray54);
        org.junit.Assert.assertNotNull(wildcardClassArray55);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test545");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]");
        boolean boolean6 = strComparableMultiKey4.equals((java.lang.Object) 0.0f);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey12 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[, hi!, MultiKey[, hi!], null, ]", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!, MultiKey[, hi!], null, ]", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!, MultiKey[, hi!], null, ]", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey17 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!, MultiKey[, hi!], null, ]", (java.lang.Comparable<java.lang.String>) "");
        int int18 = strComparableMultiKey17.size();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey23 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]");
        java.lang.String[] strArray28 = new java.lang.String[] { "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey29 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray28);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey30 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray28);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey32 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray28, false);
        int int33 = strComparableMultiKey32.size();
        java.lang.Comparable<java.lang.String>[] strComparableArray34 = strComparableMultiKey32.getKeys();
        boolean boolean35 = strComparableMultiKey23.equals((java.lang.Object) strComparableMultiKey32);
        org.apache.commons.collections4.keyvalue.MultiKey[] multiKeyArray37 = new org.apache.commons.collections4.keyvalue.MultiKey[4];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>[] strComparableMultiKeyArray38 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>[]) multiKeyArray37;
        strComparableMultiKeyArray38[0] = strComparableMultiKey4;
        strComparableMultiKeyArray38[1] = strComparableMultiKey12;
        strComparableMultiKeyArray38[2] = strComparableMultiKey17;
        strComparableMultiKeyArray38[3] = strComparableMultiKey32;
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>> strComparableMultiKeyMultiKey47 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>>(strComparableMultiKeyArray38);
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>> strComparableMultiKeyMultiKey48 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>>(strComparableMultiKeyArray38);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey53 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]");
        boolean boolean55 = strComparableMultiKey53.equals((java.lang.Object) 0.0f);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey61 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[, hi!, MultiKey[, hi!], null, ]", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!, MultiKey[, hi!], null, ]", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!, MultiKey[, hi!], null, ]", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey66 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!, MultiKey[, hi!], null, ]", (java.lang.Comparable<java.lang.String>) "");
        int int67 = strComparableMultiKey66.size();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey72 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]");
        java.lang.String[] strArray77 = new java.lang.String[] { "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey78 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray77);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey79 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray77);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey81 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray77, false);
        int int82 = strComparableMultiKey81.size();
        java.lang.Comparable<java.lang.String>[] strComparableArray83 = strComparableMultiKey81.getKeys();
        boolean boolean84 = strComparableMultiKey72.equals((java.lang.Object) strComparableMultiKey81);
        org.apache.commons.collections4.keyvalue.MultiKey[] multiKeyArray86 = new org.apache.commons.collections4.keyvalue.MultiKey[4];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>[] strComparableMultiKeyArray87 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>[]) multiKeyArray86;
        strComparableMultiKeyArray87[0] = strComparableMultiKey53;
        strComparableMultiKeyArray87[1] = strComparableMultiKey61;
        strComparableMultiKeyArray87[2] = strComparableMultiKey66;
        strComparableMultiKeyArray87[3] = strComparableMultiKey81;
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>> strComparableMultiKeyMultiKey96 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>>(strComparableMultiKeyArray87);
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>> strComparableMultiKeyMultiKey97 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>>(strComparableMultiKeyArray87);
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>[]> comparableMultiKeyArrayMultiKey98 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>[]>(strComparableMultiKeyArray38, strComparableMultiKeyArray87);
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>> strComparableMultiKeyMultiKey99 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>>(strComparableMultiKeyArray87);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 4 + "'", int33 == 4);
        org.junit.Assert.assertNotNull(strComparableArray34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(multiKeyArray37);
        org.junit.Assert.assertNotNull(strComparableMultiKeyArray38);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 4 + "'", int67 == 4);
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 4 + "'", int82 == 4);
        org.junit.Assert.assertNotNull(strComparableArray83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertNotNull(multiKeyArray86);
        org.junit.Assert.assertNotNull(strComparableMultiKeyArray87);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test546");
        java.lang.Comparable<java.lang.String> strComparable0 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparable0, (java.lang.Comparable<java.lang.String>) "MultiKey[hi!, MultiKey[, hi!, MultiKey[, hi!], null, ], hi!, hi!]");
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test547");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "MultiKey[MultiKey[, hi!], , MultiKey[, hi!], null, ]");
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test548");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int3 = strComparableMultiKey2.size();
        int int4 = strComparableMultiKey2.size();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey7 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int8 = strComparableMultiKey7.size();
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>> strComparableMultiKeyMultiKey9 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>>(strComparableMultiKey2, strComparableMultiKey7);
        java.lang.Comparable<java.lang.String>[] strComparableArray10 = null; // flaky: strComparableMultiKey2.getKeys();
        java.lang.String[] strArray15 = new java.lang.String[] { "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey16 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray15);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey17 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence[]) strArray15);
        org.apache.commons.collections4.keyvalue.MultiKey<java.io.Serializable> serializableMultiKey18 = new org.apache.commons.collections4.keyvalue.MultiKey<java.io.Serializable>((java.io.Serializable[]) strArray15);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey19 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray15);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey21 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray15, false);
        int int22 = strComparableMultiKey21.size();
        boolean boolean23 = strComparableMultiKey2.equals((java.lang.Object) strComparableMultiKey21);
        java.lang.Comparable<java.lang.String>[] strComparableArray24 = strComparableMultiKey21.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey26 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparableArray24, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
// flaky:         org.junit.Assert.assertNotNull(strComparableArray10);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(strComparableArray24);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test549");
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[, hi!, MultiKey[, hi!], null, ]", strComparable1, (java.lang.Comparable<java.lang.String>) "MultiKey[hi!, MultiKey[, hi!, MultiKey[, hi!], null, ], MultiKey[, hi!, MultiKey[, hi!], null, ]]");
        java.lang.String str4 = strComparableMultiKey3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MultiKey[MultiKey[, hi!, MultiKey[, hi!], null, ], null, MultiKey[hi!, MultiKey[, hi!, MultiKey[, hi!], null, ], MultiKey[, hi!, MultiKey[, hi!], null, ]]]" + "'", str4, "MultiKey[MultiKey[, hi!, MultiKey[, hi!], null, ], null, MultiKey[hi!, MultiKey[, hi!, MultiKey[, hi!], null, ], MultiKey[, hi!, MultiKey[, hi!], null, ]]]");
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test550");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int3 = strComparableMultiKey2.size();
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableMultiKey2.getKey((int) (short) 1);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey8 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int9 = strComparableMultiKey8.size();
        int int10 = strComparableMultiKey8.size();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey13 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int14 = strComparableMultiKey13.size();
        int int15 = strComparableMultiKey13.size();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey18 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int19 = strComparableMultiKey18.size();
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>> strComparableMultiKeyMultiKey20 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>>(strComparableMultiKey13, strComparableMultiKey18);
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>> strComparableMultiKeyMultiKey21 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>>(strComparableMultiKey2, strComparableMultiKey8, strComparableMultiKey13);
        int int22 = strComparableMultiKey13.size();
        java.lang.String str23 = strComparableMultiKey13.toString();
        java.lang.String str24 = strComparableMultiKey13.toString();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey29 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!, MultiKey[, hi!], null, ]", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean30 = strComparableMultiKey13.equals((java.lang.Object) "hi!");
        int int31 = strComparableMultiKey13.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable33 = strComparableMultiKey13.getKey((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertEquals("'" + strComparable5 + "' != '" + "hi!" + "'", strComparable5, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "MultiKey[, hi!]" + "'", str23, "MultiKey[, hi!]");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "MultiKey[, hi!]" + "'", str24, "MultiKey[, hi!]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test551");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int3 = strComparableMultiKey2.size();
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableMultiKey2.getKey(0);
        java.lang.Comparable<java.lang.String>[] strComparableArray6 = null; // flaky: strComparableMultiKey2.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey8 = null; // flaky: new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparableArray6, true);
        java.lang.Comparable<java.lang.String>[] strComparableArray9 = null; // flaky: strComparableMultiKey8.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey11 = null; // flaky: new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparableArray9, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertEquals("'" + strComparable5 + "' != '" + "" + "'", strComparable5, "");
// flaky:         org.junit.Assert.assertNotNull(strComparableArray6);
// flaky:         org.junit.Assert.assertNotNull(strComparableArray9);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test552");
        java.lang.Comparable<java.lang.String> strComparable0 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparable0, (java.lang.Comparable<java.lang.String>) "MultiKey[null, MultiKey[, hi!], , MultiKey[, hi!]]", (java.lang.Comparable<java.lang.String>) "MultiKey[null, MultiKey[, hi!], hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]], , hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[, MultiKey[, hi!], MultiKey[MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]], MultiKey[, hi!, MultiKey[, hi!], null, ]]]");
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test553");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]", strComparable3, (java.lang.Comparable<java.lang.String>) "");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey8 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int9 = strComparableMultiKey8.size();
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableMultiKey8.getKey((int) (short) 1);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey14 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int15 = strComparableMultiKey14.size();
        int int16 = strComparableMultiKey14.size();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey19 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int20 = strComparableMultiKey19.size();
        int int21 = strComparableMultiKey19.size();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey24 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int25 = strComparableMultiKey24.size();
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>> strComparableMultiKeyMultiKey26 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>>(strComparableMultiKey19, strComparableMultiKey24);
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>> strComparableMultiKeyMultiKey27 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>>(strComparableMultiKey8, strComparableMultiKey14, strComparableMultiKey19);
        java.lang.Comparable<java.lang.String> strComparable29 = strComparableMultiKey14.getKey((int) (byte) 1);
        java.lang.Comparable<java.lang.String> strComparable31 = strComparableMultiKey14.getKey(0);
        boolean boolean32 = strComparableMultiKey5.equals((java.lang.Object) strComparableMultiKey14);
        java.lang.Comparable<java.lang.String>[] strComparableArray33 = null; // flaky: strComparableMultiKey5.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey34 = null; // flaky: new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparableArray33);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey37 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int38 = strComparableMultiKey37.size();
        int int39 = strComparableMultiKey37.size();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey42 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int43 = strComparableMultiKey42.size();
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>> strComparableMultiKeyMultiKey44 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>>(strComparableMultiKey37, strComparableMultiKey42);
        boolean boolean46 = strComparableMultiKey37.equals((java.lang.Object) ' ');
        int int47 = strComparableMultiKey37.size();
        java.lang.Comparable<java.lang.String>[] strComparableArray48 = null; // flaky: strComparableMultiKey37.getKeys();
        boolean boolean49 = false; // flaky: strComparableMultiKey34.equals((java.lang.Object) strComparableMultiKey37);
        java.lang.Class<?> wildcardClass50 = null; // flaky: strComparableMultiKey34.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertEquals("'" + strComparable11 + "' != '" + "hi!" + "'", strComparable11, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertEquals("'" + strComparable29 + "' != '" + "hi!" + "'", strComparable29, "hi!");
        org.junit.Assert.assertEquals("'" + strComparable31 + "' != '" + "" + "'", strComparable31, "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
// flaky:         org.junit.Assert.assertNotNull(strComparableArray33);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2 + "'", int38 == 2);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2 + "'", int39 == 2);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2 + "'", int43 == 2);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 2 + "'", int47 == 2);
// flaky:         org.junit.Assert.assertNotNull(strComparableArray48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
// flaky:         org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test554");
        java.lang.String[] strArray5 = new java.lang.String[] { "MultiKey[, hi!, MultiKey[, hi!], null, ]", "MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]]", "MultiKey[MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]], , hi!]", "MultiKey[, , MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], hi!, ], ]", "MultiKey[MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]], , hi!]" };
        java.lang.String[][] strArray6 = new java.lang.String[][] { strArray5 };
        java.lang.String[] strArray12 = new java.lang.String[] { "MultiKey[, hi!, MultiKey[, hi!], null, ]", "MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]]", "MultiKey[MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]], , hi!]", "MultiKey[, , MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], hi!, ], ]", "MultiKey[MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]], , hi!]" };
        java.lang.String[][] strArray13 = new java.lang.String[][] { strArray12 };
        java.lang.String[] strArray19 = new java.lang.String[] { "MultiKey[, hi!, MultiKey[, hi!], null, ]", "MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]]", "MultiKey[MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]], , hi!]", "MultiKey[, , MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], hi!, ], ]", "MultiKey[MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]], , hi!]" };
        java.lang.String[][] strArray20 = new java.lang.String[][] { strArray19 };
        java.lang.String[] strArray26 = new java.lang.String[] { "MultiKey[, hi!, MultiKey[, hi!], null, ]", "MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]]", "MultiKey[MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]], , hi!]", "MultiKey[, , MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], hi!, ], ]", "MultiKey[MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]], , hi!]" };
        java.lang.String[][] strArray27 = new java.lang.String[][] { strArray26 };
        java.lang.String[] strArray33 = new java.lang.String[] { "MultiKey[, hi!, MultiKey[, hi!], null, ]", "MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]]", "MultiKey[MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]], , hi!]", "MultiKey[, , MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], hi!, ], ]", "MultiKey[MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]], , hi!]" };
        java.lang.String[][] strArray34 = new java.lang.String[][] { strArray33 };
        java.lang.String[] strArray40 = new java.lang.String[] { "MultiKey[, hi!, MultiKey[, hi!], null, ]", "MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]]", "MultiKey[MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]], , hi!]", "MultiKey[, , MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], hi!, ], ]", "MultiKey[MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]], , hi!]" };
        java.lang.String[][] strArray41 = new java.lang.String[][] { strArray40 };
        java.lang.String[][][] strArray42 = new java.lang.String[][][] { strArray6, strArray13, strArray20, strArray27, strArray34, strArray41 };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[][]> strArrayMultiKey43 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[][]>(strArray42);
        java.lang.Class<?> wildcardClass44 = strArray42.getClass();
        java.lang.reflect.GenericDeclaration genericDeclaration45 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey51 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[, hi!, MultiKey[, hi!], null, ], hi!, MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]], hi!, MultiKey[, hi!, MultiKey[, hi!], null, ]]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], hi!, ]", (java.lang.Comparable<java.lang.String>) "MultiKey[, , MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], hi!, ], ]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]], , hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!, MultiKey[, hi!], null, ]");
        java.lang.Class<?> wildcardClass52 = strComparableMultiKey51.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.GenericDeclaration> genericDeclarationMultiKey53 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.GenericDeclaration>((java.lang.reflect.GenericDeclaration) wildcardClass44, genericDeclaration45, (java.lang.reflect.GenericDeclaration) wildcardClass52);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test555");
        java.lang.Comparable<java.lang.String> strComparable0 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparable0, (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]]");
        java.lang.Comparable<java.lang.String>[] strComparableArray3 = null; // flaky: strComparableMultiKey2.getKeys();
// flaky:         org.junit.Assert.assertNotNull(strComparableArray3);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test556");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int3 = strComparableMultiKey2.size();
        int int4 = strComparableMultiKey2.size();
        int int5 = strComparableMultiKey2.size();
        java.lang.String str6 = strComparableMultiKey2.toString();
        java.lang.String str7 = strComparableMultiKey2.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiKey[, hi!]" + "'", str6, "MultiKey[, hi!]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "MultiKey[, hi!]" + "'", str7, "MultiKey[, hi!]");
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test557");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int3 = strComparableMultiKey2.size();
        int int4 = strComparableMultiKey2.size();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey7 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int8 = strComparableMultiKey7.size();
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>> strComparableMultiKeyMultiKey9 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>>(strComparableMultiKey2, strComparableMultiKey7);
        java.lang.Comparable<java.lang.String>[] strComparableArray10 = null; // flaky: strComparableMultiKey2.getKeys();
        java.lang.String[] strArray15 = new java.lang.String[] { "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey16 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray15);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey17 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence[]) strArray15);
        org.apache.commons.collections4.keyvalue.MultiKey<java.io.Serializable> serializableMultiKey18 = new org.apache.commons.collections4.keyvalue.MultiKey<java.io.Serializable>((java.io.Serializable[]) strArray15);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey19 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray15);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey21 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray15, false);
        int int22 = strComparableMultiKey21.size();
        boolean boolean23 = strComparableMultiKey2.equals((java.lang.Object) strComparableMultiKey21);
        java.lang.Comparable<java.lang.String>[] strComparableArray24 = null; // flaky: strComparableMultiKey2.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey26 = null; // flaky: new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparableArray24, true);
        java.lang.Comparable<java.lang.String>[] strComparableArray27 = null; // flaky: strComparableMultiKey26.getKeys();
        java.lang.Comparable<java.lang.String>[] strComparableArray28 = null; // flaky: strComparableMultiKey26.getKeys();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
// flaky:         org.junit.Assert.assertNotNull(strComparableArray10);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
// flaky:         org.junit.Assert.assertNotNull(strComparableArray24);
// flaky:         org.junit.Assert.assertNotNull(strComparableArray27);
// flaky:         org.junit.Assert.assertNotNull(strComparableArray28);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test558");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]");
        java.lang.String[] strArray7 = new java.lang.String[] { "MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]]", "MultiKey[, hi!, MultiKey[, hi!], null, ]" };
        java.lang.String[] strArray10 = new java.lang.String[] { "MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]]", "MultiKey[, hi!, MultiKey[, hi!], null, ]" };
        java.lang.String[] strArray13 = new java.lang.String[] { "MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]]", "MultiKey[, hi!, MultiKey[, hi!], null, ]" };
        java.lang.String[] strArray16 = new java.lang.String[] { "MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]]", "MultiKey[, hi!, MultiKey[, hi!], null, ]" };
        java.lang.String[][] strArray17 = new java.lang.String[][] { strArray7, strArray10, strArray13, strArray16 };
        java.lang.String[] strArray20 = new java.lang.String[] { "MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]]", "MultiKey[, hi!, MultiKey[, hi!], null, ]" };
        java.lang.String[] strArray23 = new java.lang.String[] { "MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]]", "MultiKey[, hi!, MultiKey[, hi!], null, ]" };
        java.lang.String[] strArray26 = new java.lang.String[] { "MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]]", "MultiKey[, hi!, MultiKey[, hi!], null, ]" };
        java.lang.String[] strArray29 = new java.lang.String[] { "MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]]", "MultiKey[, hi!, MultiKey[, hi!], null, ]" };
        java.lang.String[][] strArray30 = new java.lang.String[][] { strArray20, strArray23, strArray26, strArray29 };
        java.lang.String[] strArray33 = new java.lang.String[] { "MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]]", "MultiKey[, hi!, MultiKey[, hi!], null, ]" };
        java.lang.String[] strArray36 = new java.lang.String[] { "MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]]", "MultiKey[, hi!, MultiKey[, hi!], null, ]" };
        java.lang.String[] strArray39 = new java.lang.String[] { "MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]]", "MultiKey[, hi!, MultiKey[, hi!], null, ]" };
        java.lang.String[] strArray42 = new java.lang.String[] { "MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]]", "MultiKey[, hi!, MultiKey[, hi!], null, ]" };
        java.lang.String[][] strArray43 = new java.lang.String[][] { strArray33, strArray36, strArray39, strArray42 };
        java.lang.String[][][] strArray44 = new java.lang.String[][][] { strArray17, strArray30, strArray43 };
        java.lang.String[][][][] strArray45 = new java.lang.String[][][][] { strArray44 };
        java.lang.String[] strArray47 = new java.lang.String[] { "MultiKey[hi!, MultiKey[, hi!, MultiKey[, hi!], null, ], hi!, hi!]" };
        java.lang.String[][] strArray48 = new java.lang.String[][] { strArray47 };
        java.lang.String[] strArray50 = new java.lang.String[] { "MultiKey[hi!, MultiKey[, hi!, MultiKey[, hi!], null, ], hi!, hi!]" };
        java.lang.String[][] strArray51 = new java.lang.String[][] { strArray50 };
        java.lang.String[] strArray53 = new java.lang.String[] { "MultiKey[hi!, MultiKey[, hi!, MultiKey[, hi!], null, ], hi!, hi!]" };
        java.lang.String[][] strArray54 = new java.lang.String[][] { strArray53 };
        java.lang.String[] strArray56 = new java.lang.String[] { "MultiKey[hi!, MultiKey[, hi!, MultiKey[, hi!], null, ], hi!, hi!]" };
        java.lang.String[][] strArray57 = new java.lang.String[][] { strArray56 };
        java.lang.String[] strArray59 = new java.lang.String[] { "MultiKey[hi!, MultiKey[, hi!, MultiKey[, hi!], null, ], hi!, hi!]" };
        java.lang.String[][] strArray60 = new java.lang.String[][] { strArray59 };
        java.lang.String[][][] strArray61 = new java.lang.String[][][] { strArray48, strArray51, strArray54, strArray57, strArray60 };
        java.lang.String[][][][] strArray62 = new java.lang.String[][][][] { strArray61 };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[][][]> strArrayMultiKey63 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[][][]>(strArray62);
        java.lang.String[][][] strArray64 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray65 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray66 = new java.lang.String[][][] {};
        java.lang.String[][][][] strArray67 = new java.lang.String[][][][] { strArray64, strArray65, strArray66 };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[][][][]> strArrayMultiKey68 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[][][][]>(strArray45, strArray62, strArray67);
        boolean boolean69 = strComparableMultiKey4.equals((java.lang.Object) strArray62);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[][][]> strArrayMultiKey70 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[][][]>(strArray62);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test559");
        java.lang.CharSequence[] charSequenceArray0 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray5);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey7 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence[]) strArray5);
        java.lang.String[] strArray12 = new java.lang.String[] { "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey13 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray12);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey14 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray12);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey16 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray12, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey17 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray12);
        java.lang.String[] strArray22 = new java.lang.String[] { "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey23 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray22);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey24 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence[]) strArray22);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey25 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray22);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey27 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray22, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey29 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray22, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[]> charSequenceArrayMultiKey30 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[]>((java.lang.CharSequence[]) strArray5, (java.lang.CharSequence[]) strArray12, (java.lang.CharSequence[]) strArray22);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey31 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray5);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey33 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray5, false);
        java.lang.CharSequence[] charSequenceArray38 = new java.lang.CharSequence[] { "MultiKey[, hi!]", "", "", "MultiKey[, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey40 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray38, true);
        java.lang.CharSequence[] charSequenceArray45 = new java.lang.CharSequence[] { "MultiKey[, hi!]", "", "", "MultiKey[, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey47 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray45, true);
        java.lang.String[] strArray52 = new java.lang.String[] { "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey53 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray52);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey54 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence[]) strArray52);
        org.apache.commons.collections4.keyvalue.MultiKey<java.io.Serializable> serializableMultiKey55 = new org.apache.commons.collections4.keyvalue.MultiKey<java.io.Serializable>((java.io.Serializable[]) strArray52);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey56 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray52);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey58 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray52, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Object> objMultiKey60 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Object>((java.lang.Object) strArray52, (java.lang.Object) 'a');
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[]> charSequenceArrayMultiKey61 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[]>(charSequenceArray0, (java.lang.CharSequence[]) strArray5, charSequenceArray38, charSequenceArray45, (java.lang.CharSequence[]) strArray52);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey63 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray5, true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable65 = strComparableMultiKey63.getKey((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(charSequenceArray38);
        org.junit.Assert.assertNotNull(charSequenceArray45);
        org.junit.Assert.assertNotNull(strArray52);
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test560");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[, hi!, MultiKey[, hi!], null, ], hi!, MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]], hi!, MultiKey[, hi!, MultiKey[, hi!], null, ]]", (java.lang.Comparable<java.lang.String>) "MultiKey[null, MultiKey[, hi!], hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], hi!, null], MultiKey[null, null, MultiKey[, hi!], MultiKey[, hi!, MultiKey[, hi!], null, ], MultiKey[, hi!, MultiKey[, hi!], null, ]], MultiKey[hi!, MultiKey[, hi!, MultiKey[, hi!], null, ], hi!, hi!], MultiKey[, , MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], hi!, ], ], MultiKey[MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]], MultiKey[, hi!, MultiKey[, hi!], null, ]]]");
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test561");
        java.lang.String[] strArray4 = new java.lang.String[] { "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray4);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence[]) strArray4);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey7 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray4);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey9 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray4, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey11 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray4, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey13 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray4, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.io.Serializable> serializableMultiKey15 = new org.apache.commons.collections4.keyvalue.MultiKey<java.io.Serializable>((java.io.Serializable[]) strArray4, false);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test562");
        java.lang.reflect.Type[] typeArray0 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int4 = strComparableMultiKey3.size();
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableMultiKey3.getKey(0);
        java.lang.Class<?> wildcardClass7 = strComparableMultiKey3.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey10 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int11 = strComparableMultiKey10.size();
        java.lang.Class<?> wildcardClass12 = strComparableMultiKey10.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey15 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int16 = strComparableMultiKey15.size();
        java.lang.Class<?> wildcardClass17 = strComparableMultiKey15.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey20 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int21 = strComparableMultiKey20.size();
        java.lang.Class<?> wildcardClass22 = strComparableMultiKey20.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.GenericDeclaration> genericDeclarationMultiKey23 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.GenericDeclaration>((java.lang.reflect.GenericDeclaration) wildcardClass7, (java.lang.reflect.GenericDeclaration) wildcardClass12, (java.lang.reflect.GenericDeclaration) wildcardClass17, (java.lang.reflect.GenericDeclaration) wildcardClass22);
        java.lang.Class[] classArray25 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray26 = (java.lang.Class<?>[]) classArray25;
        wildcardClassArray26[0] = wildcardClass22;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Class<?>> wildcardClassMultiKey29 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Class<?>>(wildcardClassArray26);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.AnnotatedElement> annotatedElementMultiKey30 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.AnnotatedElement>((java.lang.reflect.AnnotatedElement[]) wildcardClassArray26);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey33 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int34 = strComparableMultiKey33.size();
        java.lang.Comparable<java.lang.String> strComparable36 = strComparableMultiKey33.getKey(0);
        java.lang.Class<?> wildcardClass37 = strComparableMultiKey33.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey40 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int41 = strComparableMultiKey40.size();
        java.lang.Class<?> wildcardClass42 = strComparableMultiKey40.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey45 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int46 = strComparableMultiKey45.size();
        java.lang.Class<?> wildcardClass47 = strComparableMultiKey45.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey50 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int51 = strComparableMultiKey50.size();
        java.lang.Class<?> wildcardClass52 = strComparableMultiKey50.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.GenericDeclaration> genericDeclarationMultiKey53 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.GenericDeclaration>((java.lang.reflect.GenericDeclaration) wildcardClass37, (java.lang.reflect.GenericDeclaration) wildcardClass42, (java.lang.reflect.GenericDeclaration) wildcardClass47, (java.lang.reflect.GenericDeclaration) wildcardClass52);
        java.lang.Class[] classArray55 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray56 = (java.lang.Class<?>[]) classArray55;
        wildcardClassArray56[0] = wildcardClass52;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Class<?>> wildcardClassMultiKey59 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Class<?>>(wildcardClassArray56);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.AnnotatedElement> annotatedElementMultiKey60 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.AnnotatedElement>((java.lang.reflect.AnnotatedElement[]) wildcardClassArray56);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey63 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int64 = strComparableMultiKey63.size();
        java.lang.Comparable<java.lang.String> strComparable66 = strComparableMultiKey63.getKey(0);
        java.lang.Class<?> wildcardClass67 = strComparableMultiKey63.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey70 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int71 = strComparableMultiKey70.size();
        java.lang.Class<?> wildcardClass72 = strComparableMultiKey70.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey75 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int76 = strComparableMultiKey75.size();
        java.lang.Class<?> wildcardClass77 = strComparableMultiKey75.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey80 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int81 = strComparableMultiKey80.size();
        java.lang.Class<?> wildcardClass82 = strComparableMultiKey80.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.GenericDeclaration> genericDeclarationMultiKey83 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.GenericDeclaration>((java.lang.reflect.GenericDeclaration) wildcardClass67, (java.lang.reflect.GenericDeclaration) wildcardClass72, (java.lang.reflect.GenericDeclaration) wildcardClass77, (java.lang.reflect.GenericDeclaration) wildcardClass82);
        java.lang.Class[] classArray85 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray86 = (java.lang.Class<?>[]) classArray85;
        wildcardClassArray86[0] = wildcardClass82;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Class<?>> wildcardClassMultiKey89 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Class<?>>(wildcardClassArray86);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.AnnotatedElement> annotatedElementMultiKey90 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.AnnotatedElement>((java.lang.reflect.AnnotatedElement[]) wildcardClassArray86);
        java.lang.Class[] classArray92 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray93 = (java.lang.Class<?>[]) classArray92;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Class<?>[]> wildcardClassArrayMultiKey94 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Class<?>[]>(wildcardClassArray26, wildcardClassArray56, wildcardClassArray86, wildcardClassArray93);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Class<?>> wildcardClassMultiKey96 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Class<?>>(wildcardClassArray56, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[]> typeArrayMultiKey97 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[]>(typeArray0, (java.lang.reflect.Type[]) wildcardClassArray56);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertEquals("'" + strComparable6 + "' != '" + "" + "'", strComparable6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(classArray25);
        org.junit.Assert.assertNotNull(wildcardClassArray26);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2 + "'", int34 == 2);
        org.junit.Assert.assertEquals("'" + strComparable36 + "' != '" + "" + "'", strComparable36, "");
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 2 + "'", int41 == 2);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 2 + "'", int46 == 2);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 2 + "'", int51 == 2);
        org.junit.Assert.assertNotNull(wildcardClass52);
        org.junit.Assert.assertNotNull(classArray55);
        org.junit.Assert.assertNotNull(wildcardClassArray56);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 2 + "'", int64 == 2);
        org.junit.Assert.assertEquals("'" + strComparable66 + "' != '" + "" + "'", strComparable66, "");
        org.junit.Assert.assertNotNull(wildcardClass67);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 2 + "'", int71 == 2);
        org.junit.Assert.assertNotNull(wildcardClass72);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 2 + "'", int76 == 2);
        org.junit.Assert.assertNotNull(wildcardClass77);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 2 + "'", int81 == 2);
        org.junit.Assert.assertNotNull(wildcardClass82);
        org.junit.Assert.assertNotNull(classArray85);
        org.junit.Assert.assertNotNull(wildcardClassArray86);
        org.junit.Assert.assertNotNull(classArray92);
        org.junit.Assert.assertNotNull(wildcardClassArray93);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test563");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], hi!, null]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]], MultiKey[, hi!, MultiKey[, hi!], null, ]]", (java.lang.Comparable<java.lang.String>) "MultiKey[null, MultiKey[, hi!], , MultiKey[, hi!]]");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]]", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!, MultiKey[, hi!], null, ]");
        java.lang.String str7 = strComparableMultiKey6.toString();
        java.lang.String str8 = strComparableMultiKey6.toString();
        java.lang.String str9 = strComparableMultiKey6.toString();
        java.lang.Class<?> wildcardClass10 = strComparableMultiKey6.getClass();
        boolean boolean11 = strComparableMultiKey3.equals((java.lang.Object) strComparableMultiKey6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "MultiKey[MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]], MultiKey[, hi!, MultiKey[, hi!], null, ]]" + "'", str7, "MultiKey[MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]], MultiKey[, hi!, MultiKey[, hi!], null, ]]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MultiKey[MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]], MultiKey[, hi!, MultiKey[, hi!], null, ]]" + "'", str8, "MultiKey[MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]], MultiKey[, hi!, MultiKey[, hi!], null, ]]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "MultiKey[MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]], MultiKey[, hi!, MultiKey[, hi!], null, ]]" + "'", str9, "MultiKey[MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]], MultiKey[, hi!, MultiKey[, hi!], null, ]]");
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test564");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[, hi!], MultiKey[, hi!, MultiKey[, hi!], null, ], MultiKey[, hi!]]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]]", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[, hi!], , MultiKey[, hi!], null, ], MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], hi!, ]]");
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test565");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]", (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable7 = strComparableMultiKey5.getKey((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test566");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], hi!, null], , MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], hi!, null]]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[null, MultiKey[, hi!], hi!], MultiKey[, , MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], hi!, ], ]]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[, hi!], , MultiKey[, hi!], null, ]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[, hi!], MultiKey[, hi!, MultiKey[, hi!], null, ], MultiKey[, hi!]], MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], hi!, null], MultiKey[null, MultiKey[, hi!], , MultiKey[, hi!]], hi!]");
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test567");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable5 = strComparableMultiKey3.getKey((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test568");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String> strMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String>("MultiKey[, MultiKey[, hi!], MultiKey[MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]], MultiKey[, hi!, MultiKey[, hi!], null, ]]]", "MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], hi!, null]");
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test569");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!, MultiKey[, hi!], null, ]", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str5 = strComparableMultiKey4.toString();
        java.lang.String str6 = strComparableMultiKey4.toString();
        java.lang.Comparable<java.lang.String>[] strComparableArray7 = null; // flaky: strComparableMultiKey4.getKeys();
        java.lang.String[][] strArray8 = new java.lang.String[][] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]> strArrayMultiKey9 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]>(strArray8);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]> strArrayMultiKey11 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]>(strArray8, false);
        java.lang.String[] strArray16 = new java.lang.String[] { "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey17 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray16);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey18 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence[]) strArray16);
        java.lang.String[] strArray23 = new java.lang.String[] { "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey24 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray23);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey25 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray23);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey27 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray23, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey28 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray23);
        java.lang.String[] strArray33 = new java.lang.String[] { "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey34 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray33);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey35 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence[]) strArray33);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey36 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray33);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey38 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray33, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey40 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray33, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[]> charSequenceArrayMultiKey41 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[]>((java.lang.CharSequence[]) strArray16, (java.lang.CharSequence[]) strArray23, (java.lang.CharSequence[]) strArray33);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey42 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray16);
        java.lang.String[] strArray47 = new java.lang.String[] { "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey48 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray47);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey49 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence[]) strArray47);
        java.lang.String[] strArray54 = new java.lang.String[] { "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey55 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray54);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey56 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray54);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey58 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray54, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey59 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray54);
        java.lang.String[] strArray64 = new java.lang.String[] { "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey65 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray64);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey66 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence[]) strArray64);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey67 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray64);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey69 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray64, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey71 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray64, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[]> charSequenceArrayMultiKey72 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[]>((java.lang.CharSequence[]) strArray47, (java.lang.CharSequence[]) strArray54, (java.lang.CharSequence[]) strArray64);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey73 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray64);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey75 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray64, true);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey76 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray64);
        org.apache.commons.collections4.keyvalue.MultiKey<java.io.Serializable> serializableMultiKey77 = new org.apache.commons.collections4.keyvalue.MultiKey<java.io.Serializable>((java.io.Serializable[]) strArray64);
        org.apache.commons.collections4.keyvalue.MultiKey<java.io.Serializable> serializableMultiKey78 = new org.apache.commons.collections4.keyvalue.MultiKey<java.io.Serializable>((java.io.Serializable) strComparableMultiKey4, (java.io.Serializable) false, (java.io.Serializable) strArray16, (java.io.Serializable) serializableMultiKey77);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey80 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray16, false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MultiKey[hi!, MultiKey[, hi!, MultiKey[, hi!], null, ], hi!, hi!]" + "'", str5, "MultiKey[hi!, MultiKey[, hi!, MultiKey[, hi!], null, ], hi!, hi!]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiKey[hi!, MultiKey[, hi!, MultiKey[, hi!], null, ], hi!, hi!]" + "'", str6, "MultiKey[hi!, MultiKey[, hi!, MultiKey[, hi!], null, ], hi!, hi!]");
// flaky:         org.junit.Assert.assertNotNull(strComparableArray7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertNotNull(strArray64);
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test570");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[, hi!], , MultiKey[, hi!], null, ], MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], hi!, ]]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[, hi!, MultiKey[, hi!], null, ], hi!, MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]], hi!, MultiKey[, hi!, MultiKey[, hi!], null, ]]", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[, hi!, MultiKey[, hi!], null, ], null, MultiKey[hi!, MultiKey[, hi!, MultiKey[, hi!], null, ], MultiKey[, hi!, MultiKey[, hi!], null, ]]]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[, hi!, MultiKey[, hi!], null, ], null, MultiKey[hi!, MultiKey[, hi!, MultiKey[, hi!], null, ], MultiKey[, hi!, MultiKey[, hi!], null, ]]]");
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test571");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int3 = strComparableMultiKey2.size();
        int int4 = strComparableMultiKey2.size();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey7 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int8 = strComparableMultiKey7.size();
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>> strComparableMultiKeyMultiKey9 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>>(strComparableMultiKey2, strComparableMultiKey7);
        java.lang.Comparable<java.lang.String>[] strComparableArray10 = null; // flaky: strComparableMultiKey2.getKeys();
        java.lang.String[] strArray15 = new java.lang.String[] { "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey16 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray15);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey17 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence[]) strArray15);
        org.apache.commons.collections4.keyvalue.MultiKey<java.io.Serializable> serializableMultiKey18 = new org.apache.commons.collections4.keyvalue.MultiKey<java.io.Serializable>((java.io.Serializable[]) strArray15);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey19 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray15);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey21 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray15, false);
        int int22 = strComparableMultiKey21.size();
        boolean boolean23 = strComparableMultiKey2.equals((java.lang.Object) strComparableMultiKey21);
        java.lang.Comparable<java.lang.String>[] strComparableArray24 = null; // flaky: strComparableMultiKey2.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey26 = null; // flaky: new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparableArray24, true);
        java.lang.Comparable<java.lang.String>[] strComparableArray27 = null; // flaky: strComparableMultiKey26.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey30 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[, hi!], , MultiKey[, hi!], null, ]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], hi!, ]");
        boolean boolean31 = false; // flaky: strComparableMultiKey26.equals((java.lang.Object) "MultiKey[MultiKey[, hi!], , MultiKey[, hi!], null, ]");
        java.lang.String str32 = null; // flaky: strComparableMultiKey26.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
// flaky:         org.junit.Assert.assertNotNull(strComparableArray10);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
// flaky:         org.junit.Assert.assertNotNull(strComparableArray24);
// flaky:         org.junit.Assert.assertNotNull(strComparableArray27);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "MultiKey[, hi!]" + "'", str32, "MultiKey[, hi!]");
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test572");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[, , MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], hi!, ], ]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], hi!, ]");
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test573");
        java.lang.Comparable<java.lang.String> strComparable2 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[, hi!], , MultiKey[, hi!], null, ]", (java.lang.Comparable<java.lang.String>) "MultiKey[hi!, ]", strComparable2, (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[, hi!], MultiKey[, hi!, MultiKey[, hi!], null, ], MultiKey[, hi!]]", (java.lang.Comparable<java.lang.String>) "MultiKey[null, MultiKey[, hi!], hi!]");
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test574");
        java.lang.String[] strArray4 = new java.lang.String[] { "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray4);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence[]) strArray4);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey7 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray4);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey8 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray4);
        int int9 = strComparableMultiKey8.size();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey12 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int13 = strComparableMultiKey12.size();
        int int14 = strComparableMultiKey12.size();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey17 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int18 = strComparableMultiKey17.size();
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>> strComparableMultiKeyMultiKey19 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>>(strComparableMultiKey12, strComparableMultiKey17);
        boolean boolean21 = strComparableMultiKey12.equals((java.lang.Object) ' ');
        int int22 = strComparableMultiKey12.size();
        java.lang.Comparable<java.lang.String>[] strComparableArray23 = null; // flaky: strComparableMultiKey12.getKeys();
        int int24 = strComparableMultiKey12.size();
        boolean boolean25 = strComparableMultiKey8.equals((java.lang.Object) strComparableMultiKey12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable27 = strComparableMultiKey8.getKey((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
// flaky:         org.junit.Assert.assertNotNull(strComparableArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test575");
        java.lang.String[] strArray4 = new java.lang.String[] { "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray4);
        int int6 = strComparableMultiKey5.size();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test576");
        java.lang.Comparable<java.lang.String> strComparable0 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparable0, (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]");
        int int5 = strComparableMultiKey4.size();
        int int6 = strComparableMultiKey4.size();
        java.lang.String str7 = strComparableMultiKey4.toString();
        java.lang.Comparable<java.lang.String>[] strComparableArray8 = null; // flaky: strComparableMultiKey4.getKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable10 = strComparableMultiKey4.getKey((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "MultiKey[null, MultiKey[, hi!], , MultiKey[, hi!]]" + "'", str7, "MultiKey[null, MultiKey[, hi!], , MultiKey[, hi!]]");
// flaky:         org.junit.Assert.assertNotNull(strComparableArray8);
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test577");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "MultiKey[, MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], hi!, ]]");
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test578");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]");
        boolean boolean6 = strComparableMultiKey4.equals((java.lang.Object) 0.0f);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey12 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[, hi!, MultiKey[, hi!], null, ]", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!, MultiKey[, hi!], null, ]", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!, MultiKey[, hi!], null, ]", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey17 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!, MultiKey[, hi!], null, ]", (java.lang.Comparable<java.lang.String>) "");
        int int18 = strComparableMultiKey17.size();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey23 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]");
        java.lang.String[] strArray28 = new java.lang.String[] { "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey29 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray28);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey30 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray28);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey32 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray28, false);
        int int33 = strComparableMultiKey32.size();
        java.lang.Comparable<java.lang.String>[] strComparableArray34 = strComparableMultiKey32.getKeys();
        boolean boolean35 = strComparableMultiKey23.equals((java.lang.Object) strComparableMultiKey32);
        org.apache.commons.collections4.keyvalue.MultiKey[] multiKeyArray37 = new org.apache.commons.collections4.keyvalue.MultiKey[4];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>[] strComparableMultiKeyArray38 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>[]) multiKeyArray37;
        strComparableMultiKeyArray38[0] = strComparableMultiKey4;
        strComparableMultiKeyArray38[1] = strComparableMultiKey12;
        strComparableMultiKeyArray38[2] = strComparableMultiKey17;
        strComparableMultiKeyArray38[3] = strComparableMultiKey32;
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>> strComparableMultiKeyMultiKey47 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>>(strComparableMultiKeyArray38);
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>> strComparableMultiKeyMultiKey48 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>>(strComparableMultiKeyArray38);
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>> strComparableMultiKeyMultiKey50 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>>(strComparableMultiKeyArray38, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 4 + "'", int33 == 4);
        org.junit.Assert.assertNotNull(strComparableArray34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(multiKeyArray37);
        org.junit.Assert.assertNotNull(strComparableMultiKeyArray38);
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test579");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int3 = strComparableMultiKey2.size();
        int int4 = strComparableMultiKey2.size();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey7 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int8 = strComparableMultiKey7.size();
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>> strComparableMultiKeyMultiKey9 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>>(strComparableMultiKey2, strComparableMultiKey7);
        java.lang.Comparable<java.lang.String>[] strComparableArray10 = null; // flaky: strComparableMultiKey2.getKeys();
        java.lang.Class<?> wildcardClass11 = strComparableMultiKey2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
// flaky:         org.junit.Assert.assertNotNull(strComparableArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test580");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], hi!, null], , MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], hi!, null]]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]]", (java.lang.Comparable<java.lang.String>) "MultiKey[hi!, ]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[, hi!], , MultiKey[, hi!], null, ]");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable6 = strComparableMultiKey4.getKey((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test581");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int3 = strComparableMultiKey2.size();
        int int4 = strComparableMultiKey2.size();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey7 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int8 = strComparableMultiKey7.size();
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>> strComparableMultiKeyMultiKey9 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>>(strComparableMultiKey2, strComparableMultiKey7);
        boolean boolean11 = strComparableMultiKey2.equals((java.lang.Object) ' ');
        int int12 = strComparableMultiKey2.size();
        java.lang.Comparable<java.lang.String>[] strComparableArray13 = null; // flaky: strComparableMultiKey2.getKeys();
        java.lang.Comparable<java.lang.String>[] strComparableArray14 = null; // flaky: strComparableMultiKey2.getKeys();
        int int15 = strComparableMultiKey2.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
// flaky:         org.junit.Assert.assertNotNull(strComparableArray13);
// flaky:         org.junit.Assert.assertNotNull(strComparableArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test582");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[, MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], hi!, ]]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[, hi!, MultiKey[, hi!], null, ], hi!, MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]], hi!, MultiKey[, hi!, MultiKey[, hi!], null, ]]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], hi!, null], MultiKey[null, null, MultiKey[, hi!], MultiKey[, hi!, MultiKey[, hi!], null, ], MultiKey[, hi!, MultiKey[, hi!], null, ]], MultiKey[hi!, MultiKey[, hi!, MultiKey[, hi!], null, ], hi!, hi!], MultiKey[, , MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], hi!, ], ], MultiKey[MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]], MultiKey[, hi!, MultiKey[, hi!], null, ]]]", (java.lang.Comparable<java.lang.String>) "MultiKey[hi!, ]");
        int int6 = strComparableMultiKey5.size();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test583");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]]", (java.lang.Comparable<java.lang.String>) "MultiKey[, , MultiKey[, hi!, MultiKey[, hi!], null, ], ]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]], MultiKey[, hi!, MultiKey[, hi!], null, ]]");
        java.lang.String str4 = strComparableMultiKey3.toString();
        java.lang.Class<?> wildcardClass5 = strComparableMultiKey3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MultiKey[MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]], MultiKey[, , MultiKey[, hi!, MultiKey[, hi!], null, ], ], MultiKey[MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]], MultiKey[, hi!, MultiKey[, hi!], null, ]]]" + "'", str4, "MultiKey[MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]], MultiKey[, , MultiKey[, hi!, MultiKey[, hi!], null, ], ], MultiKey[MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]], MultiKey[, hi!, MultiKey[, hi!], null, ]]]");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test584");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!, MultiKey[, hi!], null, ]", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!, MultiKey[, hi!], null, ]");
        int int4 = strComparableMultiKey3.size();
        java.lang.Comparable<java.lang.String>[] strComparableArray5 = null; // flaky: strComparableMultiKey3.getKeys();
        java.lang.Object obj6 = null;
        boolean boolean7 = strComparableMultiKey3.equals(obj6);
        java.lang.Object obj8 = null;
        boolean boolean9 = strComparableMultiKey3.equals(obj8);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
// flaky:         org.junit.Assert.assertNotNull(strComparableArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test585");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int3 = strComparableMultiKey2.size();
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableMultiKey2.getKey((int) (short) 1);
        java.lang.Comparable<java.lang.String>[] strComparableArray6 = null; // flaky: strComparableMultiKey2.getKeys();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertEquals("'" + strComparable5 + "' != '" + "hi!" + "'", strComparable5, "hi!");
// flaky:         org.junit.Assert.assertNotNull(strComparableArray6);
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test586");
        java.lang.Comparable<java.lang.String> strComparable0 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparable0, (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean5 = strComparableMultiKey3.equals((java.lang.Object) "MultiKey[, MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], hi!, ]]");
        java.lang.String str6 = strComparableMultiKey3.toString();
        int int7 = strComparableMultiKey3.size();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiKey[null, MultiKey[, hi!], hi!]" + "'", str6, "MultiKey[null, MultiKey[, hi!], hi!]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test587");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int3 = strComparableMultiKey2.size();
        int int4 = strComparableMultiKey2.size();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey7 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int8 = strComparableMultiKey7.size();
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>> strComparableMultiKeyMultiKey9 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>>(strComparableMultiKey2, strComparableMultiKey7);
        java.lang.Comparable<java.lang.String>[] strComparableArray10 = null; // flaky: strComparableMultiKey2.getKeys();
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableMultiKey2.getKey((int) (short) 0);
        java.lang.String str13 = strComparableMultiKey2.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
// flaky:         org.junit.Assert.assertNotNull(strComparableArray10);
        org.junit.Assert.assertEquals("'" + strComparable12 + "' != '" + "" + "'", strComparable12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "MultiKey[, hi!]" + "'", str13, "MultiKey[, hi!]");
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test588");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[hi!, MultiKey[, hi!, MultiKey[, hi!], null, ], MultiKey[, hi!, MultiKey[, hi!], null, ]]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], hi!, null], , MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], hi!, null]]");
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test589");
        java.lang.Comparable<java.lang.String> strComparable4 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], hi!, null], MultiKey[null, null, MultiKey[, hi!], MultiKey[, hi!, MultiKey[, hi!], null, ], MultiKey[, hi!, MultiKey[, hi!], null, ]], MultiKey[hi!, MultiKey[, hi!, MultiKey[, hi!], null, ], hi!, hi!], MultiKey[, , MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], hi!, ], ], MultiKey[MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]], MultiKey[, hi!, MultiKey[, hi!], null, ]]]", (java.lang.Comparable<java.lang.String>) "MultiKey[null, MultiKey[, hi!], , MultiKey[, hi!]]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], hi!, null]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[, hi!], , MultiKey[, hi!], null, ]", strComparable4);
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test590");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int3 = strComparableMultiKey2.size();
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableMultiKey2.getKey(0);
        java.lang.Class<?> wildcardClass6 = strComparableMultiKey2.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey9 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int10 = strComparableMultiKey9.size();
        java.lang.Class<?> wildcardClass11 = strComparableMultiKey9.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey14 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int15 = strComparableMultiKey14.size();
        java.lang.Class<?> wildcardClass16 = strComparableMultiKey14.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey19 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int20 = strComparableMultiKey19.size();
        java.lang.Class<?> wildcardClass21 = strComparableMultiKey19.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.GenericDeclaration> genericDeclarationMultiKey22 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.GenericDeclaration>((java.lang.reflect.GenericDeclaration) wildcardClass6, (java.lang.reflect.GenericDeclaration) wildcardClass11, (java.lang.reflect.GenericDeclaration) wildcardClass16, (java.lang.reflect.GenericDeclaration) wildcardClass21);
        java.lang.Class[] classArray24 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray25 = (java.lang.Class<?>[]) classArray24;
        wildcardClassArray25[0] = wildcardClass21;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Class<?>> wildcardClassMultiKey28 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Class<?>>(wildcardClassArray25);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.AnnotatedElement> annotatedElementMultiKey29 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.AnnotatedElement>((java.lang.reflect.AnnotatedElement[]) wildcardClassArray25);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey32 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int33 = strComparableMultiKey32.size();
        java.lang.Comparable<java.lang.String> strComparable35 = strComparableMultiKey32.getKey(0);
        java.lang.Class<?> wildcardClass36 = strComparableMultiKey32.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey39 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int40 = strComparableMultiKey39.size();
        java.lang.Class<?> wildcardClass41 = strComparableMultiKey39.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey44 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int45 = strComparableMultiKey44.size();
        java.lang.Class<?> wildcardClass46 = strComparableMultiKey44.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey49 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int50 = strComparableMultiKey49.size();
        java.lang.Class<?> wildcardClass51 = strComparableMultiKey49.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.GenericDeclaration> genericDeclarationMultiKey52 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.GenericDeclaration>((java.lang.reflect.GenericDeclaration) wildcardClass36, (java.lang.reflect.GenericDeclaration) wildcardClass41, (java.lang.reflect.GenericDeclaration) wildcardClass46, (java.lang.reflect.GenericDeclaration) wildcardClass51);
        java.lang.Class[] classArray54 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray55 = (java.lang.Class<?>[]) classArray54;
        wildcardClassArray55[0] = wildcardClass51;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Class<?>> wildcardClassMultiKey58 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Class<?>>(wildcardClassArray55);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.AnnotatedElement> annotatedElementMultiKey59 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.AnnotatedElement>((java.lang.reflect.AnnotatedElement[]) wildcardClassArray55);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey62 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int63 = strComparableMultiKey62.size();
        java.lang.Comparable<java.lang.String> strComparable65 = strComparableMultiKey62.getKey(0);
        java.lang.Class<?> wildcardClass66 = strComparableMultiKey62.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey69 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int70 = strComparableMultiKey69.size();
        java.lang.Class<?> wildcardClass71 = strComparableMultiKey69.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey74 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int75 = strComparableMultiKey74.size();
        java.lang.Class<?> wildcardClass76 = strComparableMultiKey74.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey79 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int80 = strComparableMultiKey79.size();
        java.lang.Class<?> wildcardClass81 = strComparableMultiKey79.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.GenericDeclaration> genericDeclarationMultiKey82 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.GenericDeclaration>((java.lang.reflect.GenericDeclaration) wildcardClass66, (java.lang.reflect.GenericDeclaration) wildcardClass71, (java.lang.reflect.GenericDeclaration) wildcardClass76, (java.lang.reflect.GenericDeclaration) wildcardClass81);
        java.lang.Class[] classArray84 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray85 = (java.lang.Class<?>[]) classArray84;
        wildcardClassArray85[0] = wildcardClass81;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Class<?>> wildcardClassMultiKey88 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Class<?>>(wildcardClassArray85);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.AnnotatedElement> annotatedElementMultiKey89 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.AnnotatedElement>((java.lang.reflect.AnnotatedElement[]) wildcardClassArray85);
        java.lang.Class[] classArray91 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray92 = (java.lang.Class<?>[]) classArray91;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Class<?>[]> wildcardClassArrayMultiKey93 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Class<?>[]>(wildcardClassArray25, wildcardClassArray55, wildcardClassArray85, wildcardClassArray92);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type> typeMultiKey95 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type>((java.lang.reflect.Type[]) wildcardClassArray55, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertEquals("'" + strComparable5 + "' != '" + "" + "'", strComparable5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(classArray24);
        org.junit.Assert.assertNotNull(wildcardClassArray25);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2 + "'", int33 == 2);
        org.junit.Assert.assertEquals("'" + strComparable35 + "' != '" + "" + "'", strComparable35, "");
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 2 + "'", int40 == 2);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2 + "'", int45 == 2);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 2 + "'", int50 == 2);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNotNull(classArray54);
        org.junit.Assert.assertNotNull(wildcardClassArray55);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 2 + "'", int63 == 2);
        org.junit.Assert.assertEquals("'" + strComparable65 + "' != '" + "" + "'", strComparable65, "");
        org.junit.Assert.assertNotNull(wildcardClass66);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 2 + "'", int70 == 2);
        org.junit.Assert.assertNotNull(wildcardClass71);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 2 + "'", int75 == 2);
        org.junit.Assert.assertNotNull(wildcardClass76);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 2 + "'", int80 == 2);
        org.junit.Assert.assertNotNull(wildcardClass81);
        org.junit.Assert.assertNotNull(classArray84);
        org.junit.Assert.assertNotNull(wildcardClassArray85);
        org.junit.Assert.assertNotNull(classArray91);
        org.junit.Assert.assertNotNull(wildcardClassArray92);
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test591");
        java.lang.reflect.Type[][][][] typeArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[][][]> typeArrayMultiKey1 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[][][]>(typeArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The array of keys must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test592");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int3 = strComparableMultiKey2.size();
        int int4 = strComparableMultiKey2.size();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey7 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int8 = strComparableMultiKey7.size();
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>> strComparableMultiKeyMultiKey9 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>>(strComparableMultiKey2, strComparableMultiKey7);
        java.lang.Comparable<java.lang.String>[] strComparableArray10 = null; // flaky: strComparableMultiKey2.getKeys();
        java.lang.String[] strArray15 = new java.lang.String[] { "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey16 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray15);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey17 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence[]) strArray15);
        org.apache.commons.collections4.keyvalue.MultiKey<java.io.Serializable> serializableMultiKey18 = new org.apache.commons.collections4.keyvalue.MultiKey<java.io.Serializable>((java.io.Serializable[]) strArray15);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey19 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray15);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey21 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray15, false);
        int int22 = strComparableMultiKey21.size();
        boolean boolean23 = strComparableMultiKey2.equals((java.lang.Object) strComparableMultiKey21);
        java.lang.String[] strArray28 = new java.lang.String[] { "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey29 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray28);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey30 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence[]) strArray28);
        org.apache.commons.collections4.keyvalue.MultiKey<java.io.Serializable> serializableMultiKey31 = new org.apache.commons.collections4.keyvalue.MultiKey<java.io.Serializable>((java.io.Serializable[]) strArray28);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey32 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray28);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey34 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray28, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Object> objMultiKey36 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Object>((java.lang.Object) strArray28, (java.lang.Object) 'a');
        boolean boolean37 = strComparableMultiKey2.equals((java.lang.Object) objMultiKey36);
        java.lang.Class<?> wildcardClass38 = strComparableMultiKey2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
// flaky:         org.junit.Assert.assertNotNull(strComparableArray10);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test593");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[, hi!], , MultiKey[, hi!], null, ], MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], hi!, ]]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[null, MultiKey[, hi!], hi!], MultiKey[, , MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], hi!, ], ]]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[null, MultiKey[, hi!], hi!], MultiKey[, , MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], hi!, ], ]]", (java.lang.Comparable<java.lang.String>) "MultiKey[hi!, ]", (java.lang.Comparable<java.lang.String>) "hi!");
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test594");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int3 = strComparableMultiKey2.size();
        int int4 = strComparableMultiKey2.size();
        boolean boolean6 = strComparableMultiKey2.equals((java.lang.Object) (-1));
        java.lang.CharSequence[] charSequenceArray11 = new java.lang.CharSequence[] { "MultiKey[, hi!]", "", "", "MultiKey[, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey13 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray11, true);
        boolean boolean14 = strComparableMultiKey2.equals((java.lang.Object) true);
        java.lang.Comparable<java.lang.String>[] strComparableArray15 = null; // flaky: strComparableMultiKey2.getKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable17 = strComparableMultiKey2.getKey(2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(charSequenceArray11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
// flaky:         org.junit.Assert.assertNotNull(strComparableArray15);
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test595");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[hi!, ]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], hi!, null]", (java.lang.Comparable<java.lang.String>) "MultiKey[, , MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], hi!, ], ]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]], MultiKey[, hi!, MultiKey[, hi!], null, ]]", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Object obj6 = null;
        boolean boolean7 = strComparableMultiKey5.equals(obj6);
        int int8 = strComparableMultiKey5.size();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test596");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int3 = strComparableMultiKey2.size();
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableMultiKey2.getKey(0);
        java.lang.Class<?> wildcardClass6 = strComparableMultiKey2.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey9 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int10 = strComparableMultiKey9.size();
        java.lang.Class<?> wildcardClass11 = strComparableMultiKey9.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey14 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int15 = strComparableMultiKey14.size();
        java.lang.Class<?> wildcardClass16 = strComparableMultiKey14.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey19 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int20 = strComparableMultiKey19.size();
        java.lang.Class<?> wildcardClass21 = strComparableMultiKey19.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.GenericDeclaration> genericDeclarationMultiKey22 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.GenericDeclaration>((java.lang.reflect.GenericDeclaration) wildcardClass6, (java.lang.reflect.GenericDeclaration) wildcardClass11, (java.lang.reflect.GenericDeclaration) wildcardClass16, (java.lang.reflect.GenericDeclaration) wildcardClass21);
        java.lang.Class[] classArray24 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray25 = (java.lang.Class<?>[]) classArray24;
        wildcardClassArray25[0] = wildcardClass21;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Class<?>> wildcardClassMultiKey28 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Class<?>>(wildcardClassArray25);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.AnnotatedElement> annotatedElementMultiKey29 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.AnnotatedElement>((java.lang.reflect.AnnotatedElement[]) wildcardClassArray25);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey32 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int33 = strComparableMultiKey32.size();
        java.lang.Comparable<java.lang.String> strComparable35 = strComparableMultiKey32.getKey(0);
        java.lang.Class<?> wildcardClass36 = strComparableMultiKey32.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey39 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int40 = strComparableMultiKey39.size();
        java.lang.Class<?> wildcardClass41 = strComparableMultiKey39.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey44 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int45 = strComparableMultiKey44.size();
        java.lang.Class<?> wildcardClass46 = strComparableMultiKey44.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey49 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int50 = strComparableMultiKey49.size();
        java.lang.Class<?> wildcardClass51 = strComparableMultiKey49.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.GenericDeclaration> genericDeclarationMultiKey52 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.GenericDeclaration>((java.lang.reflect.GenericDeclaration) wildcardClass36, (java.lang.reflect.GenericDeclaration) wildcardClass41, (java.lang.reflect.GenericDeclaration) wildcardClass46, (java.lang.reflect.GenericDeclaration) wildcardClass51);
        java.lang.Class[] classArray54 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray55 = (java.lang.Class<?>[]) classArray54;
        wildcardClassArray55[0] = wildcardClass51;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Class<?>> wildcardClassMultiKey58 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Class<?>>(wildcardClassArray55);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.AnnotatedElement> annotatedElementMultiKey59 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.AnnotatedElement>((java.lang.reflect.AnnotatedElement[]) wildcardClassArray55);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey62 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int63 = strComparableMultiKey62.size();
        java.lang.Comparable<java.lang.String> strComparable65 = strComparableMultiKey62.getKey(0);
        java.lang.Class<?> wildcardClass66 = strComparableMultiKey62.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey69 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int70 = strComparableMultiKey69.size();
        java.lang.Class<?> wildcardClass71 = strComparableMultiKey69.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey74 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int75 = strComparableMultiKey74.size();
        java.lang.Class<?> wildcardClass76 = strComparableMultiKey74.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey79 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int80 = strComparableMultiKey79.size();
        java.lang.Class<?> wildcardClass81 = strComparableMultiKey79.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.GenericDeclaration> genericDeclarationMultiKey82 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.GenericDeclaration>((java.lang.reflect.GenericDeclaration) wildcardClass66, (java.lang.reflect.GenericDeclaration) wildcardClass71, (java.lang.reflect.GenericDeclaration) wildcardClass76, (java.lang.reflect.GenericDeclaration) wildcardClass81);
        java.lang.Class[] classArray84 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray85 = (java.lang.Class<?>[]) classArray84;
        wildcardClassArray85[0] = wildcardClass81;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Class<?>> wildcardClassMultiKey88 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Class<?>>(wildcardClassArray85);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.AnnotatedElement> annotatedElementMultiKey89 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.AnnotatedElement>((java.lang.reflect.AnnotatedElement[]) wildcardClassArray85);
        java.lang.Class[] classArray91 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray92 = (java.lang.Class<?>[]) classArray91;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Class<?>[]> wildcardClassArrayMultiKey93 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Class<?>[]>(wildcardClassArray25, wildcardClassArray55, wildcardClassArray85, wildcardClassArray92);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Class<?>> wildcardClassMultiKey95 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Class<?>>(wildcardClassArray92, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.GenericDeclaration> genericDeclarationMultiKey96 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.GenericDeclaration>((java.lang.reflect.GenericDeclaration[]) wildcardClassArray92);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertEquals("'" + strComparable5 + "' != '" + "" + "'", strComparable5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(classArray24);
        org.junit.Assert.assertNotNull(wildcardClassArray25);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2 + "'", int33 == 2);
        org.junit.Assert.assertEquals("'" + strComparable35 + "' != '" + "" + "'", strComparable35, "");
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 2 + "'", int40 == 2);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2 + "'", int45 == 2);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 2 + "'", int50 == 2);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNotNull(classArray54);
        org.junit.Assert.assertNotNull(wildcardClassArray55);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 2 + "'", int63 == 2);
        org.junit.Assert.assertEquals("'" + strComparable65 + "' != '" + "" + "'", strComparable65, "");
        org.junit.Assert.assertNotNull(wildcardClass66);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 2 + "'", int70 == 2);
        org.junit.Assert.assertNotNull(wildcardClass71);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 2 + "'", int75 == 2);
        org.junit.Assert.assertNotNull(wildcardClass76);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 2 + "'", int80 == 2);
        org.junit.Assert.assertNotNull(wildcardClass81);
        org.junit.Assert.assertNotNull(classArray84);
        org.junit.Assert.assertNotNull(wildcardClassArray85);
        org.junit.Assert.assertNotNull(classArray91);
        org.junit.Assert.assertNotNull(wildcardClassArray92);
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test597");
        java.lang.CharSequence[][] charSequenceArray0 = null;
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "hi!" };
        java.lang.CharSequence[][] charSequenceArray3 = new java.lang.CharSequence[][] { charSequenceArray2 };
        java.lang.String[][] strArray4 = new java.lang.String[][] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]> strArrayMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]>(strArray4);
        java.lang.String[][] strArray6 = new java.lang.String[][] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]> strArrayMultiKey7 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]>(strArray6);
        java.lang.CharSequence[] charSequenceArray8 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[] charSequenceArray9 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[] charSequenceArray10 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[] charSequenceArray11 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[] charSequenceArray12 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[][] charSequenceArray13 = new java.lang.CharSequence[][] { charSequenceArray8, charSequenceArray9, charSequenceArray10, charSequenceArray11, charSequenceArray12 };
        java.lang.String[][] strArray14 = new java.lang.String[][] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]> strArrayMultiKey15 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]>(strArray14);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[][]> charSequenceArrayMultiKey16 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[][]>(charSequenceArray3, (java.lang.CharSequence[][]) strArray4, (java.lang.CharSequence[][]) strArray6, charSequenceArray13, (java.lang.CharSequence[][]) strArray14);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>[]> strComparableArrayMultiKey17 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>[]>((java.lang.Comparable<java.lang.String>[][]) strArray14);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[]> charSequenceArrayMultiKey19 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[]>((java.lang.CharSequence[][]) strArray14, true);
        java.lang.CharSequence[] charSequenceArray21 = new java.lang.CharSequence[] { "hi!" };
        java.lang.CharSequence[][] charSequenceArray22 = new java.lang.CharSequence[][] { charSequenceArray21 };
        java.lang.String[][] strArray23 = new java.lang.String[][] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]> strArrayMultiKey24 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]>(strArray23);
        java.lang.String[][] strArray25 = new java.lang.String[][] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]> strArrayMultiKey26 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]>(strArray25);
        java.lang.CharSequence[] charSequenceArray27 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[] charSequenceArray28 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[] charSequenceArray29 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[] charSequenceArray30 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[] charSequenceArray31 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[][] charSequenceArray32 = new java.lang.CharSequence[][] { charSequenceArray27, charSequenceArray28, charSequenceArray29, charSequenceArray30, charSequenceArray31 };
        java.lang.String[][] strArray33 = new java.lang.String[][] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]> strArrayMultiKey34 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]>(strArray33);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[][]> charSequenceArrayMultiKey35 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[][]>(charSequenceArray22, (java.lang.CharSequence[][]) strArray23, (java.lang.CharSequence[][]) strArray25, charSequenceArray32, (java.lang.CharSequence[][]) strArray33);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>[]> strComparableArrayMultiKey37 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>[]>((java.lang.Comparable<java.lang.String>[][]) strArray23, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[][]> charSequenceArrayMultiKey38 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[][]>(charSequenceArray0, (java.lang.CharSequence[][]) strArray14, (java.lang.CharSequence[][]) strArray23);
        java.lang.Class<?> wildcardClass39 = strArray23.getClass();
        org.junit.Assert.assertNotNull(charSequenceArray2);
        org.junit.Assert.assertNotNull(charSequenceArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(charSequenceArray8);
        org.junit.Assert.assertNotNull(charSequenceArray9);
        org.junit.Assert.assertNotNull(charSequenceArray10);
        org.junit.Assert.assertNotNull(charSequenceArray11);
        org.junit.Assert.assertNotNull(charSequenceArray12);
        org.junit.Assert.assertNotNull(charSequenceArray13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(charSequenceArray21);
        org.junit.Assert.assertNotNull(charSequenceArray22);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(charSequenceArray27);
        org.junit.Assert.assertNotNull(charSequenceArray28);
        org.junit.Assert.assertNotNull(charSequenceArray29);
        org.junit.Assert.assertNotNull(charSequenceArray30);
        org.junit.Assert.assertNotNull(charSequenceArray31);
        org.junit.Assert.assertNotNull(charSequenceArray32);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test598");
        java.lang.Comparable<java.lang.String> strComparable2 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[, hi!, MultiKey[, hi!], null, ], hi!, MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]], hi!, MultiKey[, hi!, MultiKey[, hi!], null, ]]", strComparable2);
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test599");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int3 = strComparableMultiKey2.size();
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableMultiKey2.getKey((int) (short) 1);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey8 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int9 = strComparableMultiKey8.size();
        int int10 = strComparableMultiKey8.size();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey13 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int14 = strComparableMultiKey13.size();
        int int15 = strComparableMultiKey13.size();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey18 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int19 = strComparableMultiKey18.size();
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>> strComparableMultiKeyMultiKey20 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>>(strComparableMultiKey13, strComparableMultiKey18);
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>> strComparableMultiKeyMultiKey21 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>>(strComparableMultiKey2, strComparableMultiKey8, strComparableMultiKey13);
        int int22 = strComparableMultiKey13.size();
        java.lang.String str23 = strComparableMultiKey13.toString();
        java.lang.String str24 = strComparableMultiKey13.toString();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey29 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!, MultiKey[, hi!], null, ]", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean30 = strComparableMultiKey13.equals((java.lang.Object) "hi!");
        int int31 = strComparableMultiKey13.size();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String> strMultiKey34 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String>("MultiKey[, , MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], hi!, ], ]", "MultiKey[null, MultiKey[, hi!], hi!]");
        boolean boolean35 = strComparableMultiKey13.equals((java.lang.Object) "MultiKey[, , MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], hi!, ], ]");
        int int36 = strComparableMultiKey13.size();
        java.lang.Comparable<java.lang.String> strComparable38 = strComparableMultiKey13.getKey(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertEquals("'" + strComparable5 + "' != '" + "hi!" + "'", strComparable5, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "MultiKey[, hi!]" + "'", str23, "MultiKey[, hi!]");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "MultiKey[, hi!]" + "'", str24, "MultiKey[, hi!]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2 + "'", int36 == 2);
        org.junit.Assert.assertEquals("'" + strComparable38 + "' != '" + "" + "'", strComparable38, "");
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test600");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int3 = strComparableMultiKey2.size();
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableMultiKey2.getKey(0);
        java.lang.Comparable<java.lang.String>[] strComparableArray6 = null; // flaky: strComparableMultiKey2.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey8 = null; // flaky: new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparableArray6, true);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey9 = null; // flaky: new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparableArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable11 = null; // flaky: strComparableMultiKey9.getKey(2);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertEquals("'" + strComparable5 + "' != '" + "" + "'", strComparable5, "");
// flaky:         org.junit.Assert.assertNotNull(strComparableArray6);
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test601");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], hi!, null], MultiKey[null, null, MultiKey[, hi!], MultiKey[, hi!, MultiKey[, hi!], null, ], MultiKey[, hi!, MultiKey[, hi!], null, ]], MultiKey[hi!, MultiKey[, hi!, MultiKey[, hi!], null, ], hi!, hi!], MultiKey[, , MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], hi!, ], ], MultiKey[MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]], MultiKey[, hi!, MultiKey[, hi!], null, ]]]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], hi!, null], , MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], hi!, null]]", (java.lang.Comparable<java.lang.String>) "MultiKey[null, MultiKey[, hi!], , MultiKey[, hi!]]");
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test602");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], hi!, null]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]], MultiKey[, hi!, MultiKey[, hi!], null, ]]", (java.lang.Comparable<java.lang.String>) "MultiKey[null, MultiKey[, hi!], , MultiKey[, hi!]]");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMultiKey6.size();
        int int8 = strComparableMultiKey6.size();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey11 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int12 = strComparableMultiKey11.size();
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>> strComparableMultiKeyMultiKey13 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>>(strComparableMultiKey6, strComparableMultiKey11);
        boolean boolean14 = strComparableMultiKey3.equals((java.lang.Object) strComparableMultiKey11);
        int int15 = strComparableMultiKey3.size();
        java.lang.Comparable<java.lang.String>[] strComparableArray16 = null; // flaky: strComparableMultiKey3.getKeys();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
// flaky:         org.junit.Assert.assertNotNull(strComparableArray16);
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test603");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[null, null, MultiKey[, hi!], MultiKey[, hi!, MultiKey[, hi!], null, ], MultiKey[, hi!, MultiKey[, hi!], null, ]]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]], MultiKey[, , MultiKey[, hi!, MultiKey[, hi!], null, ], ], MultiKey[MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]], MultiKey[, hi!, MultiKey[, hi!], null, ]]]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]]");
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test604");
        java.lang.String[] strArray4 = new java.lang.String[] { "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray4);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence[]) strArray4);
        java.lang.String[] strArray11 = new java.lang.String[] { "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey12 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray11);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey13 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray11);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey15 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray11, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey16 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray11);
        java.lang.String[] strArray21 = new java.lang.String[] { "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey22 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray21);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey23 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence[]) strArray21);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey24 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray21);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey26 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray21, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey28 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray21, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[]> charSequenceArrayMultiKey29 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[]>((java.lang.CharSequence[]) strArray4, (java.lang.CharSequence[]) strArray11, (java.lang.CharSequence[]) strArray21);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey30 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray4);
        java.lang.String str31 = strComparableMultiKey30.toString();
        java.lang.Class<?> wildcardClass32 = strComparableMultiKey30.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]]" + "'", str31, "MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]]");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test605");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]", strComparable3, (java.lang.Comparable<java.lang.String>) "");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey8 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int9 = strComparableMultiKey8.size();
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableMultiKey8.getKey((int) (short) 1);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey14 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int15 = strComparableMultiKey14.size();
        int int16 = strComparableMultiKey14.size();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey19 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int20 = strComparableMultiKey19.size();
        int int21 = strComparableMultiKey19.size();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey24 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int25 = strComparableMultiKey24.size();
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>> strComparableMultiKeyMultiKey26 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>>(strComparableMultiKey19, strComparableMultiKey24);
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>> strComparableMultiKeyMultiKey27 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>>(strComparableMultiKey8, strComparableMultiKey14, strComparableMultiKey19);
        java.lang.Comparable<java.lang.String> strComparable29 = strComparableMultiKey14.getKey((int) (byte) 1);
        java.lang.Comparable<java.lang.String> strComparable31 = strComparableMultiKey14.getKey(0);
        boolean boolean32 = strComparableMultiKey5.equals((java.lang.Object) strComparableMultiKey14);
        java.lang.Comparable<java.lang.String>[] strComparableArray33 = null; // flaky: strComparableMultiKey5.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey34 = null; // flaky: new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparableArray33);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey37 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int38 = strComparableMultiKey37.size();
        int int39 = strComparableMultiKey37.size();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey42 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int43 = strComparableMultiKey42.size();
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>> strComparableMultiKeyMultiKey44 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>>(strComparableMultiKey37, strComparableMultiKey42);
        boolean boolean46 = strComparableMultiKey37.equals((java.lang.Object) ' ');
        int int47 = strComparableMultiKey37.size();
        java.lang.Comparable<java.lang.String>[] strComparableArray48 = null; // flaky: strComparableMultiKey37.getKeys();
        boolean boolean49 = false; // flaky: strComparableMultiKey34.equals((java.lang.Object) strComparableMultiKey37);
        java.lang.Class<?> wildcardClass50 = strComparableMultiKey37.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertEquals("'" + strComparable11 + "' != '" + "hi!" + "'", strComparable11, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertEquals("'" + strComparable29 + "' != '" + "hi!" + "'", strComparable29, "hi!");
        org.junit.Assert.assertEquals("'" + strComparable31 + "' != '" + "" + "'", strComparable31, "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
// flaky:         org.junit.Assert.assertNotNull(strComparableArray33);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2 + "'", int38 == 2);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2 + "'", int39 == 2);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2 + "'", int43 == 2);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 2 + "'", int47 == 2);
// flaky:         org.junit.Assert.assertNotNull(strComparableArray48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test606");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int3 = strComparableMultiKey2.size();
        int int4 = strComparableMultiKey2.size();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey7 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int8 = strComparableMultiKey7.size();
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>> strComparableMultiKeyMultiKey9 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>>(strComparableMultiKey2, strComparableMultiKey7);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey12 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int13 = strComparableMultiKey12.size();
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>> strComparableMultiKeyMultiKey14 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>>(strComparableMultiKey2, strComparableMultiKey12);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey17 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int18 = strComparableMultiKey17.size();
        java.lang.Comparable<java.lang.String> strComparable20 = strComparableMultiKey17.getKey((int) (short) 1);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey23 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int24 = strComparableMultiKey23.size();
        int int25 = strComparableMultiKey23.size();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey28 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int29 = strComparableMultiKey28.size();
        int int30 = strComparableMultiKey28.size();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey33 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int34 = strComparableMultiKey33.size();
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>> strComparableMultiKeyMultiKey35 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>>(strComparableMultiKey28, strComparableMultiKey33);
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>> strComparableMultiKeyMultiKey36 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>>(strComparableMultiKey17, strComparableMultiKey23, strComparableMultiKey28);
        boolean boolean37 = strComparableMultiKey2.equals((java.lang.Object) strComparableMultiKey28);
        java.lang.Comparable<java.lang.String>[] strComparableArray38 = null; // flaky: strComparableMultiKey28.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey40 = null; // flaky: new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparableArray38, false);
        java.lang.String str41 = null; // flaky: strComparableMultiKey40.toString();
        java.lang.String str42 = null; // flaky: strComparableMultiKey40.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertEquals("'" + strComparable20 + "' != '" + "hi!" + "'", strComparable20, "hi!");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2 + "'", int29 == 2);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2 + "'", int34 == 2);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
// flaky:         org.junit.Assert.assertNotNull(strComparableArray38);
// flaky:         org.junit.Assert.assertEquals("'" + str41 + "' != '" + "MultiKey[, hi!]" + "'", str41, "MultiKey[, hi!]");
// flaky:         org.junit.Assert.assertEquals("'" + str42 + "' != '" + "MultiKey[, hi!]" + "'", str42, "MultiKey[, hi!]");
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test607");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]", strComparable3, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String>[] strComparableArray6 = null; // flaky: strComparableMultiKey5.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey9 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int10 = strComparableMultiKey9.size();
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableMultiKey9.getKey((int) (short) 1);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey15 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int16 = strComparableMultiKey15.size();
        int int17 = strComparableMultiKey15.size();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey20 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int21 = strComparableMultiKey20.size();
        int int22 = strComparableMultiKey20.size();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey25 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int26 = strComparableMultiKey25.size();
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>> strComparableMultiKeyMultiKey27 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>>(strComparableMultiKey20, strComparableMultiKey25);
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>> strComparableMultiKeyMultiKey28 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>>(strComparableMultiKey9, strComparableMultiKey15, strComparableMultiKey20);
        int int29 = strComparableMultiKey20.size();
        java.lang.String str30 = strComparableMultiKey20.toString();
        java.lang.String[] strArray35 = new java.lang.String[] { "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey36 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray35);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey37 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence[]) strArray35);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey38 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray35);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey40 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray35, false);
        boolean boolean41 = strComparableMultiKey20.equals((java.lang.Object) false);
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>> strComparableMultiKeyMultiKey42 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>>(strComparableMultiKey5, strComparableMultiKey20);
        java.lang.Comparable<java.lang.String>[] strComparableArray43 = null; // flaky: strComparableMultiKey20.getKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable45 = strComparableMultiKey20.getKey(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(strComparableArray6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertEquals("'" + strComparable12 + "' != '" + "hi!" + "'", strComparable12, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2 + "'", int29 == 2);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "MultiKey[, hi!]" + "'", str30, "MultiKey[, hi!]");
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
// flaky:         org.junit.Assert.assertNotNull(strComparableArray43);
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test608");
        java.lang.String[] strArray4 = new java.lang.String[] { "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray4);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence[]) strArray4);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey8 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray4, true);
        java.lang.Comparable<java.lang.String>[] strComparableArray9 = strComparableMultiKey8.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey10 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparableArray9);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strComparableArray9);
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test609");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], hi!, ]", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!, MultiKey[, hi!], null, ]");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableMultiKey3.getKey((int) (byte) 1);
        org.junit.Assert.assertEquals("'" + strComparable5 + "' != '" + "MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], hi!, ]" + "'", strComparable5, "MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], hi!, ]");
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test610");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[hi!, ]", (java.lang.Comparable<java.lang.String>) "MultiKey[null, MultiKey[, hi!], hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[, hi!], , MultiKey[, hi!], null, ], MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], hi!, ]]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], hi!, ]", (java.lang.Comparable<java.lang.String>) "MultiKey[, , MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], hi!, ], ]");
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test611");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int3 = strComparableMultiKey2.size();
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableMultiKey2.getKey((int) (short) 1);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey8 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int9 = strComparableMultiKey8.size();
        int int10 = strComparableMultiKey8.size();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey13 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int14 = strComparableMultiKey13.size();
        int int15 = strComparableMultiKey13.size();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey18 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int19 = strComparableMultiKey18.size();
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>> strComparableMultiKeyMultiKey20 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>>(strComparableMultiKey13, strComparableMultiKey18);
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>> strComparableMultiKeyMultiKey21 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>>(strComparableMultiKey2, strComparableMultiKey8, strComparableMultiKey13);
        int int22 = strComparableMultiKey13.size();
        java.lang.String str23 = strComparableMultiKey13.toString();
        java.lang.String str24 = strComparableMultiKey13.toString();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey29 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!, MultiKey[, hi!], null, ]", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean30 = strComparableMultiKey13.equals((java.lang.Object) "hi!");
        int int31 = strComparableMultiKey13.size();
        java.lang.String[] strArray36 = new java.lang.String[] { "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey37 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray36);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey38 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence[]) strArray36);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey39 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray36);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey41 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray36, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey43 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray36, false);
        boolean boolean44 = strComparableMultiKey13.equals((java.lang.Object) false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertEquals("'" + strComparable5 + "' != '" + "hi!" + "'", strComparable5, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "MultiKey[, hi!]" + "'", str23, "MultiKey[, hi!]");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "MultiKey[, hi!]" + "'", str24, "MultiKey[, hi!]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test612");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "MultiKey[hi!, ]", (java.lang.Comparable<java.lang.String>) "MultiKey[hi!, ]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]], , hi!]");
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test613");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String> strMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String>("MultiKey[hi!, ]", "MultiKey[, , MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], hi!, ], ]");
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test614");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[null, null, MultiKey[, hi!], MultiKey[, hi!, MultiKey[, hi!], null, ], MultiKey[, hi!, MultiKey[, hi!], null, ]]", (java.lang.Comparable<java.lang.String>) "MultiKey[, MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], hi!, ]]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]], MultiKey[, , MultiKey[, hi!, MultiKey[, hi!], null, ], ], MultiKey[MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]], MultiKey[, hi!, MultiKey[, hi!], null, ]]]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], hi!, null]", (java.lang.Comparable<java.lang.String>) "MultiKey[null, MultiKey[, hi!], , MultiKey[, hi!]]");
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test615");
        java.lang.String[] strArray4 = new java.lang.String[] { "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray4);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence[]) strArray4);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey7 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray4);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey9 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray4, false);
        java.lang.String[] strArray14 = new java.lang.String[] { "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey15 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray14);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey16 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence[]) strArray14);
        java.lang.String[] strArray21 = new java.lang.String[] { "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey22 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray21);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey23 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray21);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey25 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray21, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey26 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray21);
        java.lang.String[] strArray31 = new java.lang.String[] { "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey32 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray31);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey33 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence[]) strArray31);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey34 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray31);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey36 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray31, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey38 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray31, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[]> charSequenceArrayMultiKey39 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[]>((java.lang.CharSequence[]) strArray14, (java.lang.CharSequence[]) strArray21, (java.lang.CharSequence[]) strArray31);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey40 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray31);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey42 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray31, true);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey43 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray31);
        org.apache.commons.collections4.keyvalue.MultiKey<java.io.Serializable> serializableMultiKey44 = new org.apache.commons.collections4.keyvalue.MultiKey<java.io.Serializable>((java.io.Serializable[]) strArray31);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey45 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray31);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]> strArrayMultiKey46 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]>(strArray4, strArray31);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray31);
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test616");
        java.lang.Comparable<java.lang.String> strComparable0 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparable0, (java.lang.Comparable<java.lang.String>) "MultiKey[hi!, ]", (java.lang.Comparable<java.lang.String>) "");
        java.lang.String str4 = strComparableMultiKey3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MultiKey[null, MultiKey[hi!, ], ]" + "'", str4, "MultiKey[null, MultiKey[hi!, ], ]");
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test617");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[, hi!], MultiKey[, hi!, MultiKey[, hi!], null, ], MultiKey[, hi!]]", (java.lang.Comparable<java.lang.String>) "MultiKey[null, null, MultiKey[, hi!], MultiKey[, hi!, MultiKey[, hi!], null, ], MultiKey[, hi!, MultiKey[, hi!], null, ]]", (java.lang.Comparable<java.lang.String>) "MultiKey[, , MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], hi!, ], ]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[, hi!], MultiKey[, hi!, MultiKey[, hi!], null, ], MultiKey[, hi!]]");
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test618");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!, MultiKey[, hi!], null, ]", (java.lang.Comparable<java.lang.String>) "");
        int int5 = strComparableMultiKey4.size();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey8 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int9 = strComparableMultiKey8.size();
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableMultiKey8.getKey(0);
        java.lang.Comparable<java.lang.String>[] strComparableArray12 = null; // flaky: strComparableMultiKey8.getKeys();
        java.lang.String[] strArray17 = new java.lang.String[] { "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey18 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray17);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey19 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray17);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey21 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray17, false);
        int int22 = strComparableMultiKey21.size();
        java.lang.Comparable<java.lang.String>[] strComparableArray23 = strComparableMultiKey21.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Object> objMultiKey24 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Object>((java.lang.Object) strComparableMultiKey4, (java.lang.Object) strComparableMultiKey8, (java.lang.Object) strComparableArray23);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey27 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[, hi!, MultiKey[, hi!], null, ]", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey28 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey29 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>> strComparableMultiKeyMultiKey30 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>>(strComparableMultiKey4, strComparableMultiKey27, strComparableMultiKey28, strComparableMultiKey29);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String> strMultiKey36 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String>("MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]]", "", "MultiKey[MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]], MultiKey[, hi!, MultiKey[, hi!], null, ]]", "MultiKey[MultiKey[, hi!, MultiKey[, hi!], null, ], hi!, MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]], hi!, MultiKey[, hi!, MultiKey[, hi!], null, ]]", "MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], hi!, ]");
        boolean boolean37 = strComparableMultiKey27.equals((java.lang.Object) "");
        java.lang.Comparable<java.lang.String>[] strComparableArray38 = null; // flaky: strComparableMultiKey27.getKeys();
        java.lang.String str39 = strComparableMultiKey27.toString();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertEquals("'" + strComparable11 + "' != '" + "" + "'", strComparable11, "");
// flaky:         org.junit.Assert.assertNotNull(strComparableArray12);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertNotNull(strComparableArray23);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
// flaky:         org.junit.Assert.assertNotNull(strComparableArray38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "MultiKey[MultiKey[, hi!, MultiKey[, hi!], null, ], MultiKey[, hi!]]" + "'", str39, "MultiKey[MultiKey[, hi!, MultiKey[, hi!], null, ], MultiKey[, hi!]]");
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test619");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int3 = strComparableMultiKey2.size();
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableMultiKey2.getKey((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable7 = strComparableMultiKey2.getKey((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertEquals("'" + strComparable5 + "' != '" + "hi!" + "'", strComparable5, "hi!");
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test620");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int3 = strComparableMultiKey2.size();
        int int4 = strComparableMultiKey2.size();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey7 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int8 = strComparableMultiKey7.size();
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>> strComparableMultiKeyMultiKey9 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>>(strComparableMultiKey2, strComparableMultiKey7);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey12 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int13 = strComparableMultiKey12.size();
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>> strComparableMultiKeyMultiKey14 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>>(strComparableMultiKey2, strComparableMultiKey12);
        java.lang.Comparable<java.lang.String>[] strComparableArray15 = null; // flaky: strComparableMultiKey2.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey17 = null; // flaky: new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparableArray15, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
// flaky:         org.junit.Assert.assertNotNull(strComparableArray15);
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test621");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[, hi!], MultiKey[, hi!, MultiKey[, hi!], null, ], MultiKey[, hi!]]", (java.lang.Comparable<java.lang.String>) "MultiKey[null, MultiKey[, hi!], hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[, hi!], MultiKey[, hi!, MultiKey[, hi!], null, ], MultiKey[, hi!]], MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], hi!, null], MultiKey[null, MultiKey[, hi!], , MultiKey[, hi!]], hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[, MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], hi!, ]]");
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test622");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!, MultiKey[, hi!], null, ]", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str5 = strComparableMultiKey4.toString();
        java.lang.String str6 = strComparableMultiKey4.toString();
        java.lang.Comparable<java.lang.String>[] strComparableArray7 = null; // flaky: strComparableMultiKey4.getKeys();
        java.lang.String str8 = strComparableMultiKey4.toString();
        int int9 = strComparableMultiKey4.size();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MultiKey[hi!, MultiKey[, hi!, MultiKey[, hi!], null, ], hi!, hi!]" + "'", str5, "MultiKey[hi!, MultiKey[, hi!, MultiKey[, hi!], null, ], hi!, hi!]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiKey[hi!, MultiKey[, hi!, MultiKey[, hi!], null, ], hi!, hi!]" + "'", str6, "MultiKey[hi!, MultiKey[, hi!, MultiKey[, hi!], null, ], hi!, hi!]");
// flaky:         org.junit.Assert.assertNotNull(strComparableArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MultiKey[hi!, MultiKey[, hi!, MultiKey[, hi!], null, ], hi!, hi!]" + "'", str8, "MultiKey[hi!, MultiKey[, hi!, MultiKey[, hi!], null, ], hi!, hi!]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test623");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[, MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], hi!, ]]", (java.lang.Comparable<java.lang.String>) "MultiKey[, , MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], hi!, ], ]");
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test624");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[null, MultiKey[, hi!], hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]], MultiKey[, hi!, MultiKey[, hi!], null, ]]", (java.lang.Comparable<java.lang.String>) "MultiKey[hi!, MultiKey[, hi!, MultiKey[, hi!], null, ], hi!, hi!]");
        java.lang.Comparable<java.lang.String> strComparable6 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey8 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[, hi!, MultiKey[, hi!], null, ]", strComparable6, (java.lang.Comparable<java.lang.String>) "MultiKey[hi!, MultiKey[, hi!, MultiKey[, hi!], null, ], MultiKey[, hi!, MultiKey[, hi!], null, ]]");
        boolean boolean9 = strComparableMultiKey4.equals((java.lang.Object) "MultiKey[, hi!, MultiKey[, hi!], null, ]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test625");
        java.lang.String[] strArray2 = new java.lang.String[] { "MultiKey[, hi!, MultiKey[, hi!], null, ]", "MultiKey[, hi!]" };
        java.lang.String[] strArray5 = new java.lang.String[] { "MultiKey[, hi!, MultiKey[, hi!], null, ]", "MultiKey[, hi!]" };
        java.lang.String[] strArray8 = new java.lang.String[] { "MultiKey[, hi!, MultiKey[, hi!], null, ]", "MultiKey[, hi!]" };
        java.lang.String[] strArray11 = new java.lang.String[] { "MultiKey[, hi!, MultiKey[, hi!], null, ]", "MultiKey[, hi!]" };
        java.lang.String[] strArray14 = new java.lang.String[] { "MultiKey[, hi!, MultiKey[, hi!], null, ]", "MultiKey[, hi!]" };
        java.lang.String[] strArray17 = new java.lang.String[] { "MultiKey[, hi!, MultiKey[, hi!], null, ]", "MultiKey[, hi!]" };
        java.lang.Comparable[][] comparableArray19 = new java.lang.Comparable[6][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][] strComparableArray20 = (java.lang.Comparable<java.lang.String>[][]) comparableArray19;
        strComparableArray20[0] = strArray2;
        strComparableArray20[1] = strArray5;
        strComparableArray20[2] = strArray8;
        strComparableArray20[3] = strArray11;
        strComparableArray20[4] = strArray14;
        strComparableArray20[5] = strArray17;
        java.lang.String[] strArray33 = new java.lang.String[] {};
        java.lang.String[] strArray34 = new java.lang.String[] {};
        java.lang.String[] strArray35 = new java.lang.String[] {};
        java.lang.String[] strArray36 = new java.lang.String[] {};
        java.lang.String[] strArray37 = new java.lang.String[] {};
        java.lang.String[] strArray38 = new java.lang.String[] {};
        java.lang.Comparable[][] comparableArray40 = new java.lang.Comparable[6][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][] strComparableArray41 = (java.lang.Comparable<java.lang.String>[][]) comparableArray40;
        strComparableArray41[0] = strArray33;
        strComparableArray41[1] = strArray34;
        strComparableArray41[2] = strArray35;
        strComparableArray41[3] = strArray36;
        strComparableArray41[4] = strArray37;
        strComparableArray41[5] = strArray38;
        java.lang.String[] strArray55 = new java.lang.String[] { "MultiKey[, hi!, MultiKey[, hi!], null, ]" };
        java.lang.String[] strArray57 = new java.lang.String[] { "MultiKey[, hi!, MultiKey[, hi!], null, ]" };
        java.lang.String[] strArray59 = new java.lang.String[] { "MultiKey[, hi!, MultiKey[, hi!], null, ]" };
        java.lang.String[] strArray61 = new java.lang.String[] { "MultiKey[, hi!, MultiKey[, hi!], null, ]" };
        java.lang.Comparable[][] comparableArray63 = new java.lang.Comparable[4][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][] strComparableArray64 = (java.lang.Comparable<java.lang.String>[][]) comparableArray63;
        strComparableArray64[0] = strArray55;
        strComparableArray64[1] = strArray57;
        strComparableArray64[2] = strArray59;
        strComparableArray64[3] = strArray61;
        java.lang.String[][] strArray73 = new java.lang.String[][] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]> strArrayMultiKey74 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]>(strArray73);
        java.lang.String[][] strArray75 = new java.lang.String[][] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]> strArrayMultiKey76 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]>(strArray75);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>[][]> strComparableArrayMultiKey77 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>[][]>(strComparableArray20, strComparableArray41, strComparableArray64, (java.lang.Comparable<java.lang.String>[][]) strArray73, (java.lang.Comparable<java.lang.String>[][]) strArray75);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[]> charSequenceArrayMultiKey78 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[]>((java.lang.CharSequence[][]) strArray73);
        java.lang.CharSequence[][] charSequenceArray79 = null;
        java.lang.CharSequence[] charSequenceArray81 = new java.lang.CharSequence[] { "hi!" };
        java.lang.CharSequence[][] charSequenceArray82 = new java.lang.CharSequence[][] { charSequenceArray81 };
        java.lang.String[][] strArray83 = new java.lang.String[][] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]> strArrayMultiKey84 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]>(strArray83);
        java.lang.String[][] strArray85 = new java.lang.String[][] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]> strArrayMultiKey86 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]>(strArray85);
        java.lang.CharSequence[] charSequenceArray87 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[] charSequenceArray88 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[] charSequenceArray89 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[] charSequenceArray90 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[] charSequenceArray91 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[][] charSequenceArray92 = new java.lang.CharSequence[][] { charSequenceArray87, charSequenceArray88, charSequenceArray89, charSequenceArray90, charSequenceArray91 };
        java.lang.String[][] strArray93 = new java.lang.String[][] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]> strArrayMultiKey94 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]>(strArray93);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[][]> charSequenceArrayMultiKey95 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[][]>(charSequenceArray82, (java.lang.CharSequence[][]) strArray83, (java.lang.CharSequence[][]) strArray85, charSequenceArray92, (java.lang.CharSequence[][]) strArray93);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>[]> strComparableArrayMultiKey96 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>[]>((java.lang.Comparable<java.lang.String>[][]) strArray93);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[]> charSequenceArrayMultiKey98 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[]>((java.lang.CharSequence[][]) strArray93, true);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[][]> charSequenceArrayMultiKey99 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[][]>((java.lang.CharSequence[][]) strArray73, charSequenceArray79, (java.lang.CharSequence[][]) strArray93);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(comparableArray19);
        org.junit.Assert.assertNotNull(strComparableArray20);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(comparableArray40);
        org.junit.Assert.assertNotNull(strComparableArray41);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertNotNull(comparableArray63);
        org.junit.Assert.assertNotNull(strComparableArray64);
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertNotNull(strArray75);
        org.junit.Assert.assertNotNull(charSequenceArray81);
        org.junit.Assert.assertNotNull(charSequenceArray82);
        org.junit.Assert.assertNotNull(strArray83);
        org.junit.Assert.assertNotNull(strArray85);
        org.junit.Assert.assertNotNull(charSequenceArray87);
        org.junit.Assert.assertNotNull(charSequenceArray88);
        org.junit.Assert.assertNotNull(charSequenceArray89);
        org.junit.Assert.assertNotNull(charSequenceArray90);
        org.junit.Assert.assertNotNull(charSequenceArray91);
        org.junit.Assert.assertNotNull(charSequenceArray92);
        org.junit.Assert.assertNotNull(strArray93);
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test626");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[null, MultiKey[, hi!], , MultiKey[, hi!]]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[null, null, MultiKey[, hi!], MultiKey[, hi!, MultiKey[, hi!], null, ], MultiKey[, hi!, MultiKey[, hi!], null, ]], null]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], hi!, null]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]], , hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[hi!, MultiKey[, hi!, MultiKey[, hi!], null, ], hi!, hi!]");
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test627");
        java.lang.String[] strArray4 = new java.lang.String[] { "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray4);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence[]) strArray4);
        java.lang.String[] strArray11 = new java.lang.String[] { "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey12 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray11);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey13 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray11);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey15 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray11, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey16 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray11);
        java.lang.String[] strArray21 = new java.lang.String[] { "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey22 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray21);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey23 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence[]) strArray21);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey24 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray21);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey26 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray21, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey28 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray21, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[]> charSequenceArrayMultiKey29 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[]>((java.lang.CharSequence[]) strArray4, (java.lang.CharSequence[]) strArray11, (java.lang.CharSequence[]) strArray21);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey31 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray21, false);
        java.lang.String str32 = strComparableMultiKey31.toString();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]]" + "'", str32, "MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]]");
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test628");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]]", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int4 = strComparableMultiKey3.size();
        java.lang.String str5 = strComparableMultiKey3.toString();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MultiKey[MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]], , hi!]" + "'", str5, "MultiKey[MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]], , hi!]");
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test629");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]", (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable5 = strComparableMultiKey3.getKey(4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test630");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[hi!, ]", (java.lang.Comparable<java.lang.String>) "MultiKey[null, MultiKey[, hi!], , MultiKey[, hi!]]");
        java.lang.Comparable<java.lang.String> strComparable6 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey8 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]", strComparable6, (java.lang.Comparable<java.lang.String>) "");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey11 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int12 = strComparableMultiKey11.size();
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableMultiKey11.getKey((int) (short) 1);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey17 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int18 = strComparableMultiKey17.size();
        int int19 = strComparableMultiKey17.size();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey22 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int23 = strComparableMultiKey22.size();
        int int24 = strComparableMultiKey22.size();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey27 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int28 = strComparableMultiKey27.size();
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>> strComparableMultiKeyMultiKey29 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>>(strComparableMultiKey22, strComparableMultiKey27);
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>> strComparableMultiKeyMultiKey30 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>>(strComparableMultiKey11, strComparableMultiKey17, strComparableMultiKey22);
        java.lang.Comparable<java.lang.String> strComparable32 = strComparableMultiKey17.getKey((int) (byte) 1);
        java.lang.Comparable<java.lang.String> strComparable34 = strComparableMultiKey17.getKey(0);
        boolean boolean35 = strComparableMultiKey8.equals((java.lang.Object) strComparableMultiKey17);
        int int36 = strComparableMultiKey8.size();
        boolean boolean37 = strComparableMultiKey2.equals((java.lang.Object) strComparableMultiKey8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertEquals("'" + strComparable14 + "' != '" + "hi!" + "'", strComparable14, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2 + "'", int28 == 2);
        org.junit.Assert.assertEquals("'" + strComparable32 + "' != '" + "hi!" + "'", strComparable32, "hi!");
        org.junit.Assert.assertEquals("'" + strComparable34 + "' != '" + "" + "'", strComparable34, "");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 5 + "'", int36 == 5);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test631");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], hi!, ]", (java.lang.Comparable<java.lang.String>) "");
        java.lang.String str5 = strComparableMultiKey4.toString();
        java.lang.Comparable<java.lang.String>[] strComparableArray6 = null; // flaky: strComparableMultiKey4.getKeys();
        int int7 = strComparableMultiKey4.size();
        java.lang.String str8 = strComparableMultiKey4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MultiKey[, , MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], hi!, ], ]" + "'", str5, "MultiKey[, , MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], hi!, ], ]");
// flaky:         org.junit.Assert.assertNotNull(strComparableArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MultiKey[, , MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], hi!, ], ]" + "'", str8, "MultiKey[, , MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], hi!, ], ]");
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test632");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[hi!, MultiKey[, hi!, MultiKey[, hi!], null, ], MultiKey[, hi!, MultiKey[, hi!], null, ]]", (java.lang.Comparable<java.lang.String>) "MultiKey[hi!, MultiKey[, hi!, MultiKey[, hi!], null, ], MultiKey[, hi!, MultiKey[, hi!], null, ]]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], hi!, null]");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable5 = strComparableMultiKey3.getKey((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test633");
        java.lang.CharSequence[] charSequenceArray1 = new java.lang.CharSequence[] { "hi!" };
        java.lang.CharSequence[][] charSequenceArray2 = new java.lang.CharSequence[][] { charSequenceArray1 };
        java.lang.String[][] strArray3 = new java.lang.String[][] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]> strArrayMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]>(strArray3);
        java.lang.String[][] strArray5 = new java.lang.String[][] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]> strArrayMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]>(strArray5);
        java.lang.CharSequence[] charSequenceArray7 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[] charSequenceArray8 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[] charSequenceArray9 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[] charSequenceArray10 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[] charSequenceArray11 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[][] charSequenceArray12 = new java.lang.CharSequence[][] { charSequenceArray7, charSequenceArray8, charSequenceArray9, charSequenceArray10, charSequenceArray11 };
        java.lang.String[][] strArray13 = new java.lang.String[][] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]> strArrayMultiKey14 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]>(strArray13);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[][]> charSequenceArrayMultiKey15 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[][]>(charSequenceArray2, (java.lang.CharSequence[][]) strArray3, (java.lang.CharSequence[][]) strArray5, charSequenceArray12, (java.lang.CharSequence[][]) strArray13);
        java.lang.String[] strArray18 = new java.lang.String[] { "MultiKey[, hi!, MultiKey[, hi!], null, ]", "MultiKey[, hi!]" };
        java.lang.String[] strArray21 = new java.lang.String[] { "MultiKey[, hi!, MultiKey[, hi!], null, ]", "MultiKey[, hi!]" };
        java.lang.String[] strArray24 = new java.lang.String[] { "MultiKey[, hi!, MultiKey[, hi!], null, ]", "MultiKey[, hi!]" };
        java.lang.String[] strArray27 = new java.lang.String[] { "MultiKey[, hi!, MultiKey[, hi!], null, ]", "MultiKey[, hi!]" };
        java.lang.String[] strArray30 = new java.lang.String[] { "MultiKey[, hi!, MultiKey[, hi!], null, ]", "MultiKey[, hi!]" };
        java.lang.String[] strArray33 = new java.lang.String[] { "MultiKey[, hi!, MultiKey[, hi!], null, ]", "MultiKey[, hi!]" };
        java.lang.Comparable[][] comparableArray35 = new java.lang.Comparable[6][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][] strComparableArray36 = (java.lang.Comparable<java.lang.String>[][]) comparableArray35;
        strComparableArray36[0] = strArray18;
        strComparableArray36[1] = strArray21;
        strComparableArray36[2] = strArray24;
        strComparableArray36[3] = strArray27;
        strComparableArray36[4] = strArray30;
        strComparableArray36[5] = strArray33;
        java.lang.String[] strArray49 = new java.lang.String[] {};
        java.lang.String[] strArray50 = new java.lang.String[] {};
        java.lang.String[] strArray51 = new java.lang.String[] {};
        java.lang.String[] strArray52 = new java.lang.String[] {};
        java.lang.String[] strArray53 = new java.lang.String[] {};
        java.lang.String[] strArray54 = new java.lang.String[] {};
        java.lang.Comparable[][] comparableArray56 = new java.lang.Comparable[6][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][] strComparableArray57 = (java.lang.Comparable<java.lang.String>[][]) comparableArray56;
        strComparableArray57[0] = strArray49;
        strComparableArray57[1] = strArray50;
        strComparableArray57[2] = strArray51;
        strComparableArray57[3] = strArray52;
        strComparableArray57[4] = strArray53;
        strComparableArray57[5] = strArray54;
        java.lang.String[] strArray71 = new java.lang.String[] { "MultiKey[, hi!, MultiKey[, hi!], null, ]" };
        java.lang.String[] strArray73 = new java.lang.String[] { "MultiKey[, hi!, MultiKey[, hi!], null, ]" };
        java.lang.String[] strArray75 = new java.lang.String[] { "MultiKey[, hi!, MultiKey[, hi!], null, ]" };
        java.lang.String[] strArray77 = new java.lang.String[] { "MultiKey[, hi!, MultiKey[, hi!], null, ]" };
        java.lang.Comparable[][] comparableArray79 = new java.lang.Comparable[4][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][] strComparableArray80 = (java.lang.Comparable<java.lang.String>[][]) comparableArray79;
        strComparableArray80[0] = strArray71;
        strComparableArray80[1] = strArray73;
        strComparableArray80[2] = strArray75;
        strComparableArray80[3] = strArray77;
        java.lang.String[][] strArray89 = new java.lang.String[][] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]> strArrayMultiKey90 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]>(strArray89);
        java.lang.String[][] strArray91 = new java.lang.String[][] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]> strArrayMultiKey92 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]>(strArray91);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>[][]> strComparableArrayMultiKey93 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>[][]>(strComparableArray36, strComparableArray57, strComparableArray80, (java.lang.Comparable<java.lang.String>[][]) strArray89, (java.lang.Comparable<java.lang.String>[][]) strArray91);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>[][]> strComparableArrayMultiKey94 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>[][]>((java.lang.Comparable<java.lang.String>[][]) strArray3, (java.lang.Comparable<java.lang.String>[][]) strArray89);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>[]> strComparableArrayMultiKey95 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>[]>((java.lang.Comparable<java.lang.String>[][]) strArray89);
        org.junit.Assert.assertNotNull(charSequenceArray1);
        org.junit.Assert.assertNotNull(charSequenceArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(charSequenceArray7);
        org.junit.Assert.assertNotNull(charSequenceArray8);
        org.junit.Assert.assertNotNull(charSequenceArray9);
        org.junit.Assert.assertNotNull(charSequenceArray10);
        org.junit.Assert.assertNotNull(charSequenceArray11);
        org.junit.Assert.assertNotNull(charSequenceArray12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(comparableArray35);
        org.junit.Assert.assertNotNull(strComparableArray36);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertNotNull(comparableArray56);
        org.junit.Assert.assertNotNull(strComparableArray57);
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertNotNull(strArray75);
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertNotNull(comparableArray79);
        org.junit.Assert.assertNotNull(strComparableArray80);
        org.junit.Assert.assertNotNull(strArray89);
        org.junit.Assert.assertNotNull(strArray91);
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test634");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int3 = strComparableMultiKey2.size();
        int int4 = strComparableMultiKey2.size();
        int int5 = strComparableMultiKey2.size();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableMultiKey2.getKey(0);
        java.lang.String str8 = strComparableMultiKey2.toString();
        java.lang.Comparable<java.lang.String>[] strComparableArray9 = null; // flaky: strComparableMultiKey2.getKeys();
        java.lang.Class<?> wildcardClass10 = null; // flaky: strComparableArray9.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertEquals("'" + strComparable7 + "' != '" + "" + "'", strComparable7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MultiKey[, hi!]" + "'", str8, "MultiKey[, hi!]");
// flaky:         org.junit.Assert.assertNotNull(strComparableArray9);
// flaky:         org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test635");
        java.lang.Comparable<java.lang.String> strComparable0 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparable0, (java.lang.Comparable<java.lang.String>) "MultiKey[, MultiKey[, hi!], MultiKey[MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]], MultiKey[, hi!, MultiKey[, hi!], null, ]]]");
        java.lang.Comparable<java.lang.String> strComparable4 = strComparableMultiKey2.getKey((int) (short) 1);
        org.junit.Assert.assertEquals("'" + strComparable4 + "' != '" + "MultiKey[, MultiKey[, hi!], MultiKey[MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]], MultiKey[, hi!, MultiKey[, hi!], null, ]]]" + "'", strComparable4, "MultiKey[, MultiKey[, hi!], MultiKey[MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]], MultiKey[, hi!, MultiKey[, hi!], null, ]]]");
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test636");
        java.lang.String[] strArray4 = new java.lang.String[] { "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray4);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence[]) strArray4);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey7 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray4);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey8 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray4);
        int int9 = strComparableMultiKey8.size();
        java.lang.Comparable<java.lang.String>[] strComparableArray10 = strComparableMultiKey8.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey12 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparableArray10, true);
        java.lang.Class<?> wildcardClass13 = strComparableMultiKey12.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertNotNull(strComparableArray10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test637");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], hi!, null], , MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], hi!, null]]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[, hi!, MultiKey[, hi!], null, ], null, MultiKey[hi!, MultiKey[, hi!, MultiKey[, hi!], null, ], MultiKey[, hi!, MultiKey[, hi!], null, ]]]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[null, null, MultiKey[, hi!], MultiKey[, hi!, MultiKey[, hi!], null, ], MultiKey[, hi!, MultiKey[, hi!], null, ]], null]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]], MultiKey[, hi!, MultiKey[, hi!], null, ]]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[, hi!, MultiKey[, hi!], null, ], hi!, MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]], hi!, MultiKey[, hi!, MultiKey[, hi!], null, ]]");
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test638");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!, MultiKey[, hi!], null, ]", (java.lang.Comparable<java.lang.String>) "");
        int int5 = strComparableMultiKey4.size();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey8 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int9 = strComparableMultiKey8.size();
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableMultiKey8.getKey(0);
        java.lang.Comparable<java.lang.String>[] strComparableArray12 = null; // flaky: strComparableMultiKey8.getKeys();
        java.lang.String[] strArray17 = new java.lang.String[] { "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey18 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray17);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey19 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray17);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey21 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray17, false);
        int int22 = strComparableMultiKey21.size();
        java.lang.Comparable<java.lang.String>[] strComparableArray23 = strComparableMultiKey21.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Object> objMultiKey24 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Object>((java.lang.Object) strComparableMultiKey4, (java.lang.Object) strComparableMultiKey8, (java.lang.Object) strComparableArray23);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey27 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[, hi!, MultiKey[, hi!], null, ]", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey28 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey29 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>> strComparableMultiKeyMultiKey30 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>>(strComparableMultiKey4, strComparableMultiKey27, strComparableMultiKey28, strComparableMultiKey29);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String> strMultiKey36 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String>("MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]]", "", "MultiKey[MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]], MultiKey[, hi!, MultiKey[, hi!], null, ]]", "MultiKey[MultiKey[, hi!, MultiKey[, hi!], null, ], hi!, MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]], hi!, MultiKey[, hi!, MultiKey[, hi!], null, ]]", "MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], hi!, ]");
        boolean boolean37 = strComparableMultiKey27.equals((java.lang.Object) "");
        int int38 = strComparableMultiKey27.size();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertEquals("'" + strComparable11 + "' != '" + "" + "'", strComparable11, "");
// flaky:         org.junit.Assert.assertNotNull(strComparableArray12);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertNotNull(strComparableArray23);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2 + "'", int38 == 2);
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test639");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[hi!, MultiKey[, hi!, MultiKey[, hi!], null, ], hi!, hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[null, MultiKey[, hi!], hi!]");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMultiKey5.size();
        java.lang.Class<?> wildcardClass7 = strComparableMultiKey5.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey10 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int11 = strComparableMultiKey10.size();
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableMultiKey10.getKey(0);
        java.lang.Class<?> wildcardClass14 = strComparableMultiKey10.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey17 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int18 = strComparableMultiKey17.size();
        java.lang.Class<?> wildcardClass19 = strComparableMultiKey17.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey22 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int23 = strComparableMultiKey22.size();
        java.lang.Class<?> wildcardClass24 = strComparableMultiKey22.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey27 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int28 = strComparableMultiKey27.size();
        java.lang.Class<?> wildcardClass29 = strComparableMultiKey27.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.GenericDeclaration> genericDeclarationMultiKey30 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.GenericDeclaration>((java.lang.reflect.GenericDeclaration) wildcardClass14, (java.lang.reflect.GenericDeclaration) wildcardClass19, (java.lang.reflect.GenericDeclaration) wildcardClass24, (java.lang.reflect.GenericDeclaration) wildcardClass29);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey33 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int34 = strComparableMultiKey33.size();
        java.lang.Comparable<java.lang.String> strComparable36 = strComparableMultiKey33.getKey(0);
        java.lang.Class<?> wildcardClass37 = strComparableMultiKey33.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey40 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int41 = strComparableMultiKey40.size();
        java.lang.Class<?> wildcardClass42 = strComparableMultiKey40.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey45 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int46 = strComparableMultiKey45.size();
        java.lang.Class<?> wildcardClass47 = strComparableMultiKey45.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey50 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int51 = strComparableMultiKey50.size();
        java.lang.Class<?> wildcardClass52 = strComparableMultiKey50.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.GenericDeclaration> genericDeclarationMultiKey53 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.GenericDeclaration>((java.lang.reflect.GenericDeclaration) wildcardClass37, (java.lang.reflect.GenericDeclaration) wildcardClass42, (java.lang.reflect.GenericDeclaration) wildcardClass47, (java.lang.reflect.GenericDeclaration) wildcardClass52);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey56 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int57 = strComparableMultiKey56.size();
        java.lang.Class<?> wildcardClass58 = strComparableMultiKey56.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey61 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int62 = strComparableMultiKey61.size();
        java.lang.Comparable<java.lang.String> strComparable64 = strComparableMultiKey61.getKey(0);
        java.lang.Class<?> wildcardClass65 = strComparableMultiKey61.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.GenericDeclaration> genericDeclarationMultiKey66 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.GenericDeclaration>((java.lang.reflect.GenericDeclaration) wildcardClass19, (java.lang.reflect.GenericDeclaration) wildcardClass37, (java.lang.reflect.GenericDeclaration) wildcardClass58, (java.lang.reflect.GenericDeclaration) wildcardClass65);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey69 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int70 = strComparableMultiKey69.size();
        java.lang.Comparable<java.lang.String> strComparable72 = strComparableMultiKey69.getKey(0);
        java.lang.Class<?> wildcardClass73 = strComparableMultiKey69.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey76 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int77 = strComparableMultiKey76.size();
        java.lang.Class<?> wildcardClass78 = strComparableMultiKey76.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey81 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int82 = strComparableMultiKey81.size();
        java.lang.Class<?> wildcardClass83 = strComparableMultiKey81.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey86 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int87 = strComparableMultiKey86.size();
        java.lang.Class<?> wildcardClass88 = strComparableMultiKey86.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.GenericDeclaration> genericDeclarationMultiKey89 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.GenericDeclaration>((java.lang.reflect.GenericDeclaration) wildcardClass73, (java.lang.reflect.GenericDeclaration) wildcardClass78, (java.lang.reflect.GenericDeclaration) wildcardClass83, (java.lang.reflect.GenericDeclaration) wildcardClass88);
        java.lang.reflect.Type[] typeArray90 = new java.lang.reflect.Type[] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type> typeMultiKey92 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type>(typeArray90, false);
        java.lang.Class<?> wildcardClass93 = typeArray90.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.GenericDeclaration> genericDeclarationMultiKey94 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.GenericDeclaration>((java.lang.reflect.GenericDeclaration) wildcardClass7, (java.lang.reflect.GenericDeclaration) wildcardClass19, (java.lang.reflect.GenericDeclaration) wildcardClass88, (java.lang.reflect.GenericDeclaration) wildcardClass93);
        boolean boolean95 = strComparableMultiKey2.equals((java.lang.Object) genericDeclarationMultiKey94);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertEquals("'" + strComparable13 + "' != '" + "" + "'", strComparable13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2 + "'", int28 == 2);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2 + "'", int34 == 2);
        org.junit.Assert.assertEquals("'" + strComparable36 + "' != '" + "" + "'", strComparable36, "");
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 2 + "'", int41 == 2);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 2 + "'", int46 == 2);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 2 + "'", int51 == 2);
        org.junit.Assert.assertNotNull(wildcardClass52);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 2 + "'", int57 == 2);
        org.junit.Assert.assertNotNull(wildcardClass58);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 2 + "'", int62 == 2);
        org.junit.Assert.assertEquals("'" + strComparable64 + "' != '" + "" + "'", strComparable64, "");
        org.junit.Assert.assertNotNull(wildcardClass65);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 2 + "'", int70 == 2);
        org.junit.Assert.assertEquals("'" + strComparable72 + "' != '" + "" + "'", strComparable72, "");
        org.junit.Assert.assertNotNull(wildcardClass73);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 2 + "'", int77 == 2);
        org.junit.Assert.assertNotNull(wildcardClass78);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 2 + "'", int82 == 2);
        org.junit.Assert.assertNotNull(wildcardClass83);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 2 + "'", int87 == 2);
        org.junit.Assert.assertNotNull(wildcardClass88);
        org.junit.Assert.assertNotNull(typeArray90);
        org.junit.Assert.assertNotNull(wildcardClass93);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test640");
        java.lang.String[] strArray4 = new java.lang.String[] { "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray4);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence[]) strArray4);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey7 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray4);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey8 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray4);
        int int9 = strComparableMultiKey8.size();
        java.lang.String str10 = strComparableMultiKey8.toString();
        java.lang.String str11 = strComparableMultiKey8.toString();
        java.lang.String str12 = strComparableMultiKey8.toString();
        java.lang.String[] strArray17 = new java.lang.String[] { "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey18 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray17);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey19 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence[]) strArray17);
        java.lang.String[] strArray24 = new java.lang.String[] { "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey25 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray24);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey26 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray24);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey28 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray24, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey29 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray24);
        java.lang.String[] strArray34 = new java.lang.String[] { "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey35 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray34);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey36 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence[]) strArray34);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey37 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray34);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey39 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray34, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey41 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray34, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[]> charSequenceArrayMultiKey42 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[]>((java.lang.CharSequence[]) strArray17, (java.lang.CharSequence[]) strArray24, (java.lang.CharSequence[]) strArray34);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey43 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray34);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey45 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray34, true);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey46 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray34);
        boolean boolean47 = strComparableMultiKey8.equals((java.lang.Object) strComparableMultiKey46);
        java.lang.Comparable<java.lang.String>[] strComparableArray48 = strComparableMultiKey8.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey50 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparableArray48, true);
        java.lang.Comparable<java.lang.String> strComparable52 = strComparableMultiKey50.getKey((int) (short) 1);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]]" + "'", str10, "MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]]" + "'", str11, "MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]]" + "'", str12, "MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]]");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(strComparableArray48);
        org.junit.Assert.assertEquals("'" + strComparable52 + "' != '" + "MultiKey[, hi!]" + "'", strComparable52, "MultiKey[, hi!]");
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test641");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]", strComparable3, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String>[] strComparableArray6 = null; // flaky: strComparableMultiKey5.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey8 = null; // flaky: new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparableArray6, false);
        java.lang.Comparable<java.lang.String> strComparable10 = null; // flaky: strComparableMultiKey8.getKey(0);
// flaky:         org.junit.Assert.assertNotNull(strComparableArray6);
// flaky:         org.junit.Assert.assertEquals("'" + strComparable10 + "' != '" + "MultiKey[, hi!]" + "'", strComparable10, "MultiKey[, hi!]");
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test642");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]");
        boolean boolean6 = strComparableMultiKey4.equals((java.lang.Object) 0.0f);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey12 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[, hi!, MultiKey[, hi!], null, ]", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!, MultiKey[, hi!], null, ]", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!, MultiKey[, hi!], null, ]", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey17 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!, MultiKey[, hi!], null, ]", (java.lang.Comparable<java.lang.String>) "");
        int int18 = strComparableMultiKey17.size();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey23 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]");
        java.lang.String[] strArray28 = new java.lang.String[] { "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey29 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray28);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey30 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray28);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey32 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray28, false);
        int int33 = strComparableMultiKey32.size();
        java.lang.Comparable<java.lang.String>[] strComparableArray34 = strComparableMultiKey32.getKeys();
        boolean boolean35 = strComparableMultiKey23.equals((java.lang.Object) strComparableMultiKey32);
        org.apache.commons.collections4.keyvalue.MultiKey[] multiKeyArray37 = new org.apache.commons.collections4.keyvalue.MultiKey[4];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>[] strComparableMultiKeyArray38 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>[]) multiKeyArray37;
        strComparableMultiKeyArray38[0] = strComparableMultiKey4;
        strComparableMultiKeyArray38[1] = strComparableMultiKey12;
        strComparableMultiKeyArray38[2] = strComparableMultiKey17;
        strComparableMultiKeyArray38[3] = strComparableMultiKey32;
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>> strComparableMultiKeyMultiKey47 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>>(strComparableMultiKeyArray38);
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>> strComparableMultiKeyMultiKey48 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>>(strComparableMultiKeyArray38);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey53 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]");
        boolean boolean55 = strComparableMultiKey53.equals((java.lang.Object) 0.0f);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey61 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[, hi!, MultiKey[, hi!], null, ]", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!, MultiKey[, hi!], null, ]", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!, MultiKey[, hi!], null, ]", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey66 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!, MultiKey[, hi!], null, ]", (java.lang.Comparable<java.lang.String>) "");
        int int67 = strComparableMultiKey66.size();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey72 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]");
        java.lang.String[] strArray77 = new java.lang.String[] { "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey78 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray77);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey79 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray77);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey81 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray77, false);
        int int82 = strComparableMultiKey81.size();
        java.lang.Comparable<java.lang.String>[] strComparableArray83 = strComparableMultiKey81.getKeys();
        boolean boolean84 = strComparableMultiKey72.equals((java.lang.Object) strComparableMultiKey81);
        org.apache.commons.collections4.keyvalue.MultiKey[] multiKeyArray86 = new org.apache.commons.collections4.keyvalue.MultiKey[4];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>[] strComparableMultiKeyArray87 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>[]) multiKeyArray86;
        strComparableMultiKeyArray87[0] = strComparableMultiKey53;
        strComparableMultiKeyArray87[1] = strComparableMultiKey61;
        strComparableMultiKeyArray87[2] = strComparableMultiKey66;
        strComparableMultiKeyArray87[3] = strComparableMultiKey81;
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>> strComparableMultiKeyMultiKey96 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>>(strComparableMultiKeyArray87);
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>> strComparableMultiKeyMultiKey97 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>>(strComparableMultiKeyArray87);
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>[]> comparableMultiKeyArrayMultiKey98 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>[]>(strComparableMultiKeyArray38, strComparableMultiKeyArray87);
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>> strComparableMultiKeyMultiKey99 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>>(strComparableMultiKeyArray38);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 4 + "'", int33 == 4);
        org.junit.Assert.assertNotNull(strComparableArray34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(multiKeyArray37);
        org.junit.Assert.assertNotNull(strComparableMultiKeyArray38);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 4 + "'", int67 == 4);
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 4 + "'", int82 == 4);
        org.junit.Assert.assertNotNull(strComparableArray83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertNotNull(multiKeyArray86);
        org.junit.Assert.assertNotNull(strComparableMultiKeyArray87);
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test643");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[hi!, MultiKey[, hi!, MultiKey[, hi!], null, ], MultiKey[, hi!, MultiKey[, hi!], null, ]]", (java.lang.Comparable<java.lang.String>) "MultiKey[hi!, MultiKey[, hi!, MultiKey[, hi!], null, ], MultiKey[, hi!, MultiKey[, hi!], null, ]]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], hi!, null]");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable5 = strComparableMultiKey3.getKey(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test644");
        java.lang.reflect.Type[] typeArray0 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray1 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray2 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[][] typeArray3 = new java.lang.reflect.Type[][] { typeArray0, typeArray1, typeArray2 };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[]> typeArrayMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[]>(typeArray3);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[]> typeArrayMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[]>(typeArray3);
        java.lang.reflect.Type[] typeArray6 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray7 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray8 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[][] typeArray9 = new java.lang.reflect.Type[][] { typeArray6, typeArray7, typeArray8 };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[]> typeArrayMultiKey10 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[]>(typeArray9);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[]> typeArrayMultiKey11 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[]>(typeArray9);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[][]> typeArrayMultiKey12 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[][]>(typeArray3, typeArray9);
        org.junit.Assert.assertNotNull(typeArray0);
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(typeArray2);
        org.junit.Assert.assertNotNull(typeArray3);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(typeArray8);
        org.junit.Assert.assertNotNull(typeArray9);
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test645");
        java.lang.String[] strArray4 = new java.lang.String[] { "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray4);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray4);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey8 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray4, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.io.Serializable> serializableMultiKey10 = new org.apache.commons.collections4.keyvalue.MultiKey<java.io.Serializable>((java.io.Serializable[]) strArray4, false);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test646");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[, hi!, MultiKey[, hi!], null, ]", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String>[] strComparableArray4 = null; // flaky: strComparableMultiKey3.getKeys();
        java.lang.Comparable<java.lang.String>[] strComparableArray5 = null; // flaky: strComparableMultiKey3.getKeys();
// flaky:         org.junit.Assert.assertNotNull(strComparableArray4);
// flaky:         org.junit.Assert.assertNotNull(strComparableArray5);
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test647");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[, hi!], MultiKey[, hi!, MultiKey[, hi!], null, ], MultiKey[, hi!]]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], hi!, ]");
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test648");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int3 = strComparableMultiKey2.size();
        int int4 = strComparableMultiKey2.size();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey7 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int8 = strComparableMultiKey7.size();
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>> strComparableMultiKeyMultiKey9 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>>(strComparableMultiKey2, strComparableMultiKey7);
        java.lang.Comparable<java.lang.String>[] strComparableArray10 = null; // flaky: strComparableMultiKey2.getKeys();
        java.lang.String[] strArray15 = new java.lang.String[] { "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey16 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray15);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey17 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence[]) strArray15);
        org.apache.commons.collections4.keyvalue.MultiKey<java.io.Serializable> serializableMultiKey18 = new org.apache.commons.collections4.keyvalue.MultiKey<java.io.Serializable>((java.io.Serializable[]) strArray15);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey19 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray15);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey21 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray15, false);
        int int22 = strComparableMultiKey21.size();
        boolean boolean23 = strComparableMultiKey2.equals((java.lang.Object) strComparableMultiKey21);
        java.lang.String[] strArray28 = new java.lang.String[] { "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey29 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray28);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey30 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence[]) strArray28);
        org.apache.commons.collections4.keyvalue.MultiKey<java.io.Serializable> serializableMultiKey31 = new org.apache.commons.collections4.keyvalue.MultiKey<java.io.Serializable>((java.io.Serializable[]) strArray28);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey32 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray28);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey34 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray28, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Object> objMultiKey36 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Object>((java.lang.Object) strArray28, (java.lang.Object) 'a');
        boolean boolean37 = strComparableMultiKey2.equals((java.lang.Object) objMultiKey36);
        int int38 = strComparableMultiKey2.size();
        java.lang.Comparable<java.lang.String>[] strComparableArray39 = null; // flaky: strComparableMultiKey2.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey42 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]]", (java.lang.Comparable<java.lang.String>) "MultiKey[hi!, MultiKey[, hi!, MultiKey[, hi!], null, ], MultiKey[, hi!, MultiKey[, hi!], null, ]]");
        java.lang.Object obj43 = null;
        boolean boolean44 = strComparableMultiKey42.equals(obj43);
        boolean boolean45 = strComparableMultiKey2.equals(obj43);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
// flaky:         org.junit.Assert.assertNotNull(strComparableArray10);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2 + "'", int38 == 2);
// flaky:         org.junit.Assert.assertNotNull(strComparableArray39);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test649");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]], MultiKey[, hi!, MultiKey[, hi!], null, ]]");
        java.lang.String[] strArray7 = new java.lang.String[] { "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey8 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray7);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey10 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray7, false);
        boolean boolean11 = strComparableMultiKey2.equals((java.lang.Object) strArray7);
        int int12 = strComparableMultiKey2.size();
        java.lang.Class<?> wildcardClass13 = strComparableMultiKey2.getClass();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test650");
        java.lang.Comparable<java.lang.String> strComparable4 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]], , hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[, hi!], , MultiKey[, hi!], null, ]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[, hi!, MultiKey[, hi!], null, ], hi!, MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]], hi!, MultiKey[, hi!, MultiKey[, hi!], null, ]]", strComparable4);
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test651");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[null, MultiKey[, hi!], hi!]", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str3 = strComparableMultiKey2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "MultiKey[MultiKey[null, MultiKey[, hi!], hi!], hi!]" + "'", str3, "MultiKey[MultiKey[null, MultiKey[, hi!], hi!], hi!]");
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test652");
        org.apache.commons.collections4.keyvalue.MultiKey[][] multiKeyArray1 = new org.apache.commons.collections4.keyvalue.MultiKey[0][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>[][] strComparableMultiKeyArray2 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>[][]) multiKeyArray1;
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>[]> comparableMultiKeyArrayMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>[]>(strComparableMultiKeyArray2, false);
        org.junit.Assert.assertNotNull(multiKeyArray1);
        org.junit.Assert.assertNotNull(strComparableMultiKeyArray2);
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test653");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]], , hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[null, MultiKey[, hi!], , MultiKey[, hi!]]", (java.lang.Comparable<java.lang.String>) "MultiKey[hi!, MultiKey[, hi!, MultiKey[, hi!], null, ], MultiKey[, hi!, MultiKey[, hi!], null, ]]", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableMultiKey5.getKey(4);
        java.lang.Comparable<java.lang.String>[] strComparableArray8 = null; // flaky: strComparableMultiKey5.getKeys();
        java.lang.Comparable<java.lang.String>[] strComparableArray9 = null; // flaky: strComparableMultiKey5.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey12 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]]", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!, MultiKey[, hi!], null, ]");
        java.lang.String str13 = strComparableMultiKey12.toString();
        java.lang.Comparable<java.lang.String>[] strComparableArray14 = null; // flaky: strComparableMultiKey12.getKeys();
        java.lang.String[] strArray19 = new java.lang.String[] { "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey20 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray19);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey21 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence[]) strArray19);
        org.apache.commons.collections4.keyvalue.MultiKey<java.io.Serializable> serializableMultiKey22 = new org.apache.commons.collections4.keyvalue.MultiKey<java.io.Serializable>((java.io.Serializable[]) strArray19);
        java.lang.String[] strArray27 = new java.lang.String[] { "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey28 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray27);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey29 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence[]) strArray27);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey30 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray27);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey32 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray27, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey34 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray27, true);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey35 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray27);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[]> charSequenceArrayMultiKey36 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[]>((java.lang.CharSequence[]) strArray19, (java.lang.CharSequence[]) strArray27);
        java.lang.String[] strArray41 = new java.lang.String[] { "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey42 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray41);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey43 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence[]) strArray41);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey44 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray41);
        org.apache.commons.collections4.keyvalue.MultiKey<java.io.Serializable> serializableMultiKey45 = new org.apache.commons.collections4.keyvalue.MultiKey<java.io.Serializable>((java.io.Serializable[]) strArray41);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String> strMultiKey47 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String>(strArray41, true);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey49 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray41, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>[]> strComparableArrayMultiKey50 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>[]>(strComparableArray9, strComparableArray14, (java.lang.Comparable<java.lang.String>[]) strArray27, (java.lang.Comparable<java.lang.String>[]) strArray41);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Object> objMultiKey51 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Object>((java.lang.Object[]) strArray41);
        java.lang.Class<?> wildcardClass52 = strArray41.getClass();
        org.junit.Assert.assertEquals("'" + strComparable7 + "' != '" + "" + "'", strComparable7, "");
// flaky:         org.junit.Assert.assertNotNull(strComparableArray8);
// flaky:         org.junit.Assert.assertNotNull(strComparableArray9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "MultiKey[MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]], MultiKey[, hi!, MultiKey[, hi!], null, ]]" + "'", str13, "MultiKey[MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]], MultiKey[, hi!, MultiKey[, hi!], null, ]]");
// flaky:         org.junit.Assert.assertNotNull(strComparableArray14);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test654");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[hi!, ]", (java.lang.Comparable<java.lang.String>) "MultiKey[null, MultiKey[, hi!], , MultiKey[, hi!]]");
        java.lang.String str3 = strComparableMultiKey2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "MultiKey[MultiKey[hi!, ], MultiKey[null, MultiKey[, hi!], , MultiKey[, hi!]]]" + "'", str3, "MultiKey[MultiKey[hi!, ], MultiKey[null, MultiKey[, hi!], , MultiKey[, hi!]]]");
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test655");
        java.lang.String[] strArray4 = new java.lang.String[] { "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray4);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence[]) strArray4);
        org.apache.commons.collections4.keyvalue.MultiKey<java.io.Serializable> serializableMultiKey7 = new org.apache.commons.collections4.keyvalue.MultiKey<java.io.Serializable>((java.io.Serializable[]) strArray4);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey8 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray4);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey10 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray4, false);
        java.lang.Class<?> wildcardClass11 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test656");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[, MultiKey[, hi!], MultiKey[MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]], MultiKey[, hi!, MultiKey[, hi!], null, ]]]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], hi!, null], MultiKey[null, null, MultiKey[, hi!], MultiKey[, hi!, MultiKey[, hi!], null, ], MultiKey[, hi!, MultiKey[, hi!], null, ]], MultiKey[hi!, MultiKey[, hi!, MultiKey[, hi!], null, ], hi!, hi!], MultiKey[, , MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], hi!, ], ], MultiKey[MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]], MultiKey[, hi!, MultiKey[, hi!], null, ]]]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[, hi!, MultiKey[, hi!], null, ], hi!, MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]], hi!, MultiKey[, hi!, MultiKey[, hi!], null, ]]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[, hi!], MultiKey[, hi!, MultiKey[, hi!], null, ], MultiKey[, hi!]]", (java.lang.Comparable<java.lang.String>) "MultiKey[hi!, MultiKey[, hi!, MultiKey[, hi!], null, ], hi!, hi!]");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey8 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int9 = strComparableMultiKey8.size();
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableMultiKey8.getKey((int) (short) 1);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey14 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int15 = strComparableMultiKey14.size();
        int int16 = strComparableMultiKey14.size();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey19 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int20 = strComparableMultiKey19.size();
        int int21 = strComparableMultiKey19.size();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey24 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int25 = strComparableMultiKey24.size();
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>> strComparableMultiKeyMultiKey26 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>>(strComparableMultiKey19, strComparableMultiKey24);
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>> strComparableMultiKeyMultiKey27 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>>(strComparableMultiKey8, strComparableMultiKey14, strComparableMultiKey19);
        int int28 = strComparableMultiKey19.size();
        java.lang.String str29 = strComparableMultiKey19.toString();
        java.lang.String str30 = strComparableMultiKey19.toString();
        java.lang.Class<?> wildcardClass31 = strComparableMultiKey19.getClass();
        boolean boolean32 = strComparableMultiKey5.equals((java.lang.Object) strComparableMultiKey19);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertEquals("'" + strComparable11 + "' != '" + "hi!" + "'", strComparable11, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2 + "'", int28 == 2);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "MultiKey[, hi!]" + "'", str29, "MultiKey[, hi!]");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "MultiKey[, hi!]" + "'", str30, "MultiKey[, hi!]");
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test657");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[, hi!], , MultiKey[, hi!], null, ], MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], hi!, ]]", (java.lang.Comparable<java.lang.String>) "MultiKey[, , MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], hi!, ], ]", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!, MultiKey[, hi!], null, ]", (java.lang.Comparable<java.lang.String>) "MultiKey[hi!, ]");
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test658");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[, hi!, MultiKey[, hi!], null, ], hi!, MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]], hi!, MultiKey[, hi!, MultiKey[, hi!], null, ]]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[, hi!], MultiKey[, hi!, MultiKey[, hi!], null, ], MultiKey[, hi!]], MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], hi!, null], MultiKey[null, MultiKey[, hi!], , MultiKey[, hi!]], hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]], MultiKey[, hi!, MultiKey[, hi!], null, ]]");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableMultiKey3.getKey(0);
        org.junit.Assert.assertEquals("'" + strComparable5 + "' != '" + "MultiKey[MultiKey[, hi!, MultiKey[, hi!], null, ], hi!, MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]], hi!, MultiKey[, hi!, MultiKey[, hi!], null, ]]" + "'", strComparable5, "MultiKey[MultiKey[, hi!, MultiKey[, hi!], null, ], hi!, MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]], hi!, MultiKey[, hi!, MultiKey[, hi!], null, ]]");
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test659");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], hi!, ]", (java.lang.Comparable<java.lang.String>) "");
        java.lang.String str5 = strComparableMultiKey4.toString();
        java.lang.Comparable<java.lang.String>[] strComparableArray6 = null; // flaky: strComparableMultiKey4.getKeys();
        int int7 = strComparableMultiKey4.size();
        java.lang.Comparable<java.lang.String>[] strComparableArray8 = null; // flaky: strComparableMultiKey4.getKeys();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MultiKey[, , MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], hi!, ], ]" + "'", str5, "MultiKey[, , MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], hi!, ], ]");
// flaky:         org.junit.Assert.assertNotNull(strComparableArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
// flaky:         org.junit.Assert.assertNotNull(strComparableArray8);
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test660");
        java.lang.reflect.Type[][] typeArray0 = new java.lang.reflect.Type[][] {};
        java.lang.reflect.Type[][] typeArray1 = new java.lang.reflect.Type[][] {};
        java.lang.reflect.Type[][] typeArray2 = new java.lang.reflect.Type[][] {};
        java.lang.reflect.Type[][] typeArray3 = new java.lang.reflect.Type[][] {};
        java.lang.reflect.Type[][] typeArray4 = new java.lang.reflect.Type[][] {};
        java.lang.reflect.Type[][] typeArray5 = new java.lang.reflect.Type[][] {};
        java.lang.reflect.Type[][][] typeArray6 = new java.lang.reflect.Type[][][] { typeArray0, typeArray1, typeArray2, typeArray3, typeArray4, typeArray5 };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[][]> typeArrayMultiKey7 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[][]>(typeArray6);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[][]> typeArrayMultiKey9 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[][]>(typeArray6, true);
        org.junit.Assert.assertNotNull(typeArray0);
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(typeArray2);
        org.junit.Assert.assertNotNull(typeArray3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(typeArray5);
        org.junit.Assert.assertNotNull(typeArray6);
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test661");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int3 = strComparableMultiKey2.size();
        int int4 = strComparableMultiKey2.size();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey7 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int8 = strComparableMultiKey7.size();
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>> strComparableMultiKeyMultiKey9 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>>(strComparableMultiKey2, strComparableMultiKey7);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey12 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int13 = strComparableMultiKey12.size();
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>> strComparableMultiKeyMultiKey14 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>>(strComparableMultiKey2, strComparableMultiKey12);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey17 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int18 = strComparableMultiKey17.size();
        java.lang.Comparable<java.lang.String> strComparable20 = strComparableMultiKey17.getKey((int) (short) 1);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey23 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int24 = strComparableMultiKey23.size();
        int int25 = strComparableMultiKey23.size();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey28 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int29 = strComparableMultiKey28.size();
        int int30 = strComparableMultiKey28.size();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey33 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int34 = strComparableMultiKey33.size();
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>> strComparableMultiKeyMultiKey35 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>>(strComparableMultiKey28, strComparableMultiKey33);
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>> strComparableMultiKeyMultiKey36 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>>(strComparableMultiKey17, strComparableMultiKey23, strComparableMultiKey28);
        boolean boolean37 = strComparableMultiKey2.equals((java.lang.Object) strComparableMultiKey28);
        java.lang.Comparable<java.lang.String>[] strComparableArray38 = null; // flaky: strComparableMultiKey28.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey40 = null; // flaky: new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparableArray38, false);
        java.lang.Comparable<java.lang.String>[] strComparableArray41 = null; // flaky: strComparableMultiKey40.getKeys();
        int int42 = 0; // flaky: strComparableMultiKey40.size();
        java.lang.Comparable<java.lang.String>[] strComparableArray43 = null; // flaky: strComparableMultiKey40.getKeys();
        java.lang.Comparable<java.lang.String> strComparable47 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey49 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]", strComparable47, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String>[] strComparableArray50 = null; // flaky: strComparableMultiKey49.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey51 = null; // flaky: new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparableArray50);
        int int52 = 0; // flaky: strComparableMultiKey51.size();
        boolean boolean53 = false; // flaky: strComparableMultiKey40.equals((java.lang.Object) strComparableMultiKey51);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertEquals("'" + strComparable20 + "' != '" + "hi!" + "'", strComparable20, "hi!");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2 + "'", int29 == 2);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2 + "'", int34 == 2);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
// flaky:         org.junit.Assert.assertNotNull(strComparableArray38);
// flaky:         org.junit.Assert.assertNotNull(strComparableArray41);
// flaky:         org.junit.Assert.assertTrue("'" + int42 + "' != '" + 2 + "'", int42 == 2);
// flaky:         org.junit.Assert.assertNotNull(strComparableArray43);
// flaky:         org.junit.Assert.assertNotNull(strComparableArray50);
// flaky:         org.junit.Assert.assertTrue("'" + int52 + "' != '" + 5 + "'", int52 == 5);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }
}
