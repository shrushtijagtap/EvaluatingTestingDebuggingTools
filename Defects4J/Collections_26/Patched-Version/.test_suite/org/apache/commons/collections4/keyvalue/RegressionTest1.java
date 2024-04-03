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
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], hi!, MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]], hi!]", (java.lang.CharSequence) "MultiKey[MultiKey[MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ], MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]], null], MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], null, MultiKey[], ], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], MultiKey[MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], ]], MultiKey[]]", (java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], null, MultiKey[null, hi!, hi!, hi!]]");
        java.lang.String str4 = charSequenceMultiKey3.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence6 = charSequenceMultiKey3.getKey((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MultiKey[MultiKey[MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], hi!, MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]], hi!], MultiKey[MultiKey[MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ], MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]], null], MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], null, MultiKey[], ], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], MultiKey[MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], ]], MultiKey[]], MultiKey[MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], null, MultiKey[null, hi!, hi!, hi!]]]" + "'", str4, "MultiKey[MultiKey[MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], hi!, MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]], hi!], MultiKey[MultiKey[MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ], MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]], null], MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], null, MultiKey[], ], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], MultiKey[MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], ]], MultiKey[]], MultiKey[MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], null, MultiKey[null, hi!, hi!, hi!]]]");
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test502");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]");
        java.lang.CharSequence charSequence3 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey7 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence3, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!");
        java.lang.String str8 = charSequenceMultiKey7.toString();
        java.lang.String str9 = charSequenceMultiKey7.toString();
        java.lang.Object obj10 = null;
        boolean boolean11 = charSequenceMultiKey7.equals(obj10);
        java.lang.CharSequence[] charSequenceArray12 = null; // flaky: charSequenceMultiKey7.getKeys();
        java.lang.CharSequence[] charSequenceArray15 = new java.lang.CharSequence[] { "MultiKey[null, hi!, hi!, hi!]", "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]" };
        java.lang.CharSequence[] charSequenceArray16 = new java.lang.CharSequence[] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey17 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray16);
        java.lang.CharSequence[] charSequenceArray22 = new java.lang.CharSequence[] { "", "MultiKey[null, hi!, hi!, hi!]", "hi!", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey24 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray22, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[]> charSequenceArrayMultiKey25 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[]>(charSequenceArray12, charSequenceArray15, charSequenceArray16, charSequenceArray22);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey27 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray16, true);
        boolean boolean28 = charSequenceMultiKey2.equals((java.lang.Object) charSequenceArray16);
        java.lang.Object obj29 = null;
        boolean boolean30 = charSequenceMultiKey2.equals(obj29);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str8, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str9, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray12);
        org.junit.Assert.assertNotNull(charSequenceArray15);
        org.junit.Assert.assertNotNull(charSequenceArray16);
        org.junit.Assert.assertNotNull(charSequenceArray22);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test503");
        java.lang.Comparable<java.lang.String> strComparable2 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[null, hi!, hi!, hi!], MultiKey[null, hi!, hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]], hi!]", strComparable2);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test504");
        java.lang.Object[] objArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Object> objMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Object>(objArray0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The array of keys must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test505");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[MultiKey[MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ], MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]], null], MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], null, MultiKey[], ], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], MultiKey[MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], ]], MultiKey[]]", (java.lang.CharSequence) "MultiKey[MultiKey[MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], ]], MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]]]", (java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!, hi!], MultiKey[], MultiKey[null, hi!, hi!, hi!], ], hi!]");
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test506");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "MultiKey[MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ], MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]], null]");
        java.lang.CharSequence charSequence5 = charSequenceMultiKey3.getKey((int) (byte) 0);
        org.junit.Assert.assertEquals("'" + charSequence5 + "' != '" + "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]" + "'", charSequence5, "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]");
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test507");
        java.lang.CharSequence[] charSequenceArray0 = new java.lang.CharSequence[] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey1 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray0);
        java.lang.CharSequence[] charSequenceArray2 = charSequenceMultiKey1.getKeys();
        java.lang.Object obj3 = charSequenceMultiKey1.readResolve();
        java.lang.Object obj4 = charSequenceMultiKey1.readResolve();
        java.lang.String str5 = charSequenceMultiKey1.toString();
        java.lang.CharSequence[] charSequenceArray6 = charSequenceMultiKey1.getKeys();
        java.lang.Object obj7 = charSequenceMultiKey1.readResolve();
        org.junit.Assert.assertNotNull(charSequenceArray0);
        org.junit.Assert.assertNotNull(charSequenceArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "MultiKey[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "MultiKey[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "MultiKey[]");
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "MultiKey[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "MultiKey[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "MultiKey[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MultiKey[]" + "'", str5, "MultiKey[]");
        org.junit.Assert.assertNotNull(charSequenceArray6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "MultiKey[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "MultiKey[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "MultiKey[]");
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test508");
        java.lang.CharSequence charSequence1 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]], hi!]", charSequence1, (java.lang.CharSequence) "MultiKey[MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]], hi!]", (java.lang.CharSequence) "MultiKey[null, MultiKey[MultiKey[null, hi!, hi!, hi!], MultiKey[], null], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]]");
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test509");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]]", (java.lang.CharSequence) "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "MultiKey[hi!, MultiKey[null, hi!, hi!, hi!], MultiKey[], MultiKey[null, hi!, hi!, hi!], ]", (java.lang.CharSequence) "MultiKey[]");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey11 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[]", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", (java.lang.CharSequence) "MultiKey[MultiKey[null, hi!, hi!, hi!], MultiKey[], null]", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", (java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]");
        boolean boolean12 = charSequenceMultiKey5.equals((java.lang.Object) "MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]");
        java.lang.CharSequence charSequence14 = charSequenceMultiKey5.getKey(1);
        java.lang.CharSequence[] charSequenceArray15 = null; // flaky: charSequenceMultiKey5.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey17 = null; // flaky: new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray15, true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + charSequence14 + "' != '" + "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]" + "'", charSequence14, "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]");
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray15);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test510");
        java.lang.CharSequence charSequence1 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", charSequence1, (java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]");
        java.lang.Object obj4 = charSequenceMultiKey3.readResolve();
        int int5 = charSequenceMultiKey3.size();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "MultiKey[MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], null, MultiKey[null, hi!, hi!, hi!]]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "MultiKey[MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], null, MultiKey[null, hi!, hi!, hi!]]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "MultiKey[MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], null, MultiKey[null, hi!, hi!, hi!]]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test511");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[MultiKey[MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ], MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]], null], MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], null, MultiKey[], ], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], MultiKey[MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], ]], MultiKey[]]", (java.lang.CharSequence) "MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]]");
        int int3 = charSequenceMultiKey2.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test512");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]", (java.lang.CharSequence) "MultiKey[]", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]", (java.lang.CharSequence) "");
        java.lang.CharSequence[] charSequenceArray6 = null; // flaky: charSequenceMultiKey5.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey7 = null; // flaky: new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray6);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey8 = null; // flaky: new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray6);
        java.lang.Class<?> wildcardClass9 = null; // flaky: charSequenceArray6.getClass();
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray6);
// flaky:         org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test513");
        java.lang.CharSequence charSequence1 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", charSequence1, (java.lang.CharSequence) "MultiKey[MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], hi!, MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]], hi!]", (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]");
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test514");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]", (java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]", (java.lang.CharSequence) "MultiKey[MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]], hi!]", (java.lang.CharSequence) "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]");
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test515");
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] { "", "MultiKey[null, hi!, hi!, hi!]", "hi!", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey8 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4, true);
        java.lang.CharSequence[] charSequenceArray9 = charSequenceMultiKey8.getKeys();
        java.lang.CharSequence[] charSequenceArray10 = charSequenceMultiKey8.getKeys();
        org.junit.Assert.assertNotNull(charSequenceArray4);
        org.junit.Assert.assertNotNull(charSequenceArray9);
        org.junit.Assert.assertNotNull(charSequenceArray10);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test516");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]", (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]");
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "MultiKey[]", "", "MultiKey[]", "MultiKey[null, hi!, hi!, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey10 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray9);
        java.lang.String[] strArray13 = new java.lang.String[] { "MultiKey[null, hi!, hi!, hi!]", "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]" };
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!", "MultiKey[]", "", "MultiKey[]", "MultiKey[null, hi!, hi!, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey20 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray19);
        java.lang.String[] strArray26 = new java.lang.String[] { "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", "hi!", "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]", "MultiKey[]", "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]> strArrayMultiKey27 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]>(strArray9, strArray13, strArray19, strArray26);
        boolean boolean28 = charSequenceMultiKey3.equals((java.lang.Object) strArray26);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey29 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence[]) strArray26);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey30 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence[]) strArray26);
        int int31 = charSequenceMultiKey30.size();
        boolean boolean33 = charSequenceMultiKey30.equals((java.lang.Object) 10L);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 5 + "'", int31 == 5);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test517");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], ]]", (java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[null, hi!, hi!, hi!], MultiKey[null, hi!, hi!, hi!]]");
        java.lang.String str3 = charSequenceMultiKey2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "MultiKey[MultiKey[MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], ]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[null, hi!, hi!, hi!], MultiKey[null, hi!, hi!, hi!]]]" + "'", str3, "MultiKey[MultiKey[MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], ]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[null, hi!, hi!, hi!], MultiKey[null, hi!, hi!, hi!]]]");
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test518");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]", (java.lang.CharSequence) "MultiKey[MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], ]]");
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test519");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]", (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence4 = charSequenceMultiKey2.getKey(4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test520");
        java.io.Serializable serializable0 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "", (java.lang.CharSequence) "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]");
        java.lang.String str4 = charSequenceMultiKey3.toString();
        java.lang.String str5 = charSequenceMultiKey3.toString();
        java.lang.Object obj6 = charSequenceMultiKey3.readResolve();
        org.apache.commons.collections4.keyvalue.MultiKey<java.io.Serializable> serializableMultiKey8 = new org.apache.commons.collections4.keyvalue.MultiKey<java.io.Serializable>(serializable0, (java.io.Serializable) charSequenceMultiKey3, (java.io.Serializable) 1);
        java.lang.CharSequence[] charSequenceArray9 = new java.lang.CharSequence[] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey10 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray9);
        java.lang.Object obj11 = charSequenceMultiKey10.readResolve();
        java.lang.Object obj12 = charSequenceMultiKey10.readResolve();
        java.lang.String str13 = charSequenceMultiKey10.toString();
        boolean boolean14 = charSequenceMultiKey3.equals((java.lang.Object) charSequenceMultiKey10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]" + "'", str4, "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]" + "'", str5, "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]");
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]");
        org.junit.Assert.assertNotNull(charSequenceArray9);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "MultiKey[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "MultiKey[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "MultiKey[]");
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "MultiKey[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "MultiKey[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "MultiKey[]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "MultiKey[]" + "'", str13, "MultiKey[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test521");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", (java.lang.CharSequence) "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]");
        java.lang.CharSequence[][] charSequenceArray3 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray4 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray5 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray6 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray7 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][][] charSequenceArray8 = new java.lang.CharSequence[][][] { charSequenceArray3, charSequenceArray4, charSequenceArray5, charSequenceArray6, charSequenceArray7 };
        java.lang.CharSequence[][] charSequenceArray9 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray10 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray11 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray12 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray13 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray14 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][][] charSequenceArray15 = new java.lang.CharSequence[][][] { charSequenceArray9, charSequenceArray10, charSequenceArray11, charSequenceArray12, charSequenceArray13, charSequenceArray14 };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[][]> charSequenceArrayMultiKey17 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[][]>(charSequenceArray15, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[][]> charSequenceArrayMultiKey18 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[][]>(charSequenceArray15);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[][][]> charSequenceArrayMultiKey19 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[][][]>(charSequenceArray8, charSequenceArray15);
        boolean boolean20 = charSequenceMultiKey2.equals((java.lang.Object) charSequenceArray8);
        java.lang.CharSequence[] charSequenceArray21 = null; // flaky: charSequenceMultiKey2.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey23 = null; // flaky: new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray21, false);
        java.lang.CharSequence charSequence25 = null; // flaky: charSequenceMultiKey23.getKey(0);
        org.junit.Assert.assertNotNull(charSequenceArray3);
        org.junit.Assert.assertNotNull(charSequenceArray4);
        org.junit.Assert.assertNotNull(charSequenceArray5);
        org.junit.Assert.assertNotNull(charSequenceArray6);
        org.junit.Assert.assertNotNull(charSequenceArray7);
        org.junit.Assert.assertNotNull(charSequenceArray8);
        org.junit.Assert.assertNotNull(charSequenceArray9);
        org.junit.Assert.assertNotNull(charSequenceArray10);
        org.junit.Assert.assertNotNull(charSequenceArray11);
        org.junit.Assert.assertNotNull(charSequenceArray12);
        org.junit.Assert.assertNotNull(charSequenceArray13);
        org.junit.Assert.assertNotNull(charSequenceArray14);
        org.junit.Assert.assertNotNull(charSequenceArray15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray21);
// flaky:         org.junit.Assert.assertEquals("'" + charSequence25 + "' != '" + "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]" + "'", charSequence25, "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]");
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test522");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ], MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]], null]", (java.lang.CharSequence) "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], null, MultiKey[], ]", (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]", (java.lang.CharSequence) "MultiKey[MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], ]]", (java.lang.CharSequence) "MultiKey[]");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey9 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[hi!, MultiKey[null, hi!, hi!, hi!], MultiKey[], MultiKey[null, hi!, hi!, hi!], ]", (java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]", (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]");
        boolean boolean10 = charSequenceMultiKey5.equals((java.lang.Object) "MultiKey[hi!, MultiKey[null, hi!, hi!, hi!], MultiKey[], MultiKey[null, hi!, hi!, hi!], ]");
        java.lang.CharSequence[][] charSequenceArray11 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray12 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray13 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray14 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray15 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray16 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][][] charSequenceArray17 = new java.lang.CharSequence[][][] { charSequenceArray11, charSequenceArray12, charSequenceArray13, charSequenceArray14, charSequenceArray15, charSequenceArray16 };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[][]> charSequenceArrayMultiKey19 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[][]>(charSequenceArray17, false);
        boolean boolean20 = charSequenceMultiKey5.equals((java.lang.Object) false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey24 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[hi!, MultiKey[null, hi!, hi!, hi!], MultiKey[], MultiKey[null, hi!, hi!, hi!], ]", (java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]", (java.lang.CharSequence) "MultiKey[hi!, MultiKey[null, hi!, hi!, hi!], MultiKey[], MultiKey[null, hi!, hi!, hi!], ]");
        boolean boolean25 = charSequenceMultiKey5.equals((java.lang.Object) "MultiKey[hi!, MultiKey[null, hi!, hi!, hi!], MultiKey[], MultiKey[null, hi!, hi!, hi!], ]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(charSequenceArray11);
        org.junit.Assert.assertNotNull(charSequenceArray12);
        org.junit.Assert.assertNotNull(charSequenceArray13);
        org.junit.Assert.assertNotNull(charSequenceArray14);
        org.junit.Assert.assertNotNull(charSequenceArray15);
        org.junit.Assert.assertNotNull(charSequenceArray16);
        org.junit.Assert.assertNotNull(charSequenceArray17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test523");
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] { "", "MultiKey[null, hi!, hi!, hi!]", "hi!", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey8 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4, true);
        java.lang.String str9 = charSequenceMultiKey8.toString();
        java.lang.CharSequence charSequence12 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey15 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]", (java.lang.CharSequence) "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]", charSequence12, (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", (java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]");
        java.lang.CharSequence charSequence17 = charSequenceMultiKey15.getKey((int) (short) 1);
        boolean boolean18 = charSequenceMultiKey8.equals((java.lang.Object) charSequence17);
        org.junit.Assert.assertNotNull(charSequenceArray4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]" + "'", str9, "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]");
        org.junit.Assert.assertEquals("'" + charSequence17 + "' != '" + "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]" + "'", charSequence17, "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test524");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[MultiKey[null, hi!, hi!, hi!], MultiKey[], null]", (java.lang.CharSequence) "MultiKey[null, MultiKey[], MultiKey[]]");
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test525");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[MultiKey[hi!, MultiKey[null, hi!, hi!, hi!], MultiKey[], MultiKey[null, hi!, hi!, hi!], ], MultiKey[hi!, MultiKey[null, hi!, hi!, hi!], MultiKey[], MultiKey[null, hi!, hi!, hi!], ]]", (java.lang.CharSequence) "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], null, MultiKey[], ]", (java.lang.CharSequence) "MultiKey[MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!], MultiKey[], MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[null, hi!, hi!, hi!]]", (java.lang.CharSequence) "MultiKey[MultiKey[MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], null, MultiKey[null, hi!, hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]], MultiKey[null, MultiKey[MultiKey[null, hi!, hi!, hi!], MultiKey[], null], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]]]");
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test526");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]]", (java.lang.CharSequence) "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ]", (java.lang.CharSequence) "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]");
        java.lang.Object obj4 = charSequenceMultiKey3.readResolve();
        java.lang.CharSequence[] charSequenceArray5 = null; // flaky: charSequenceMultiKey3.getKeys();
        java.lang.Object obj6 = charSequenceMultiKey3.readResolve();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "MultiKey[MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]], MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "MultiKey[MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]], MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "MultiKey[MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]], MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]");
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "MultiKey[MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]], MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "MultiKey[MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]], MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "MultiKey[MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]], MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]");
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test527");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "", (java.lang.CharSequence) "", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]");
        java.lang.CharSequence charSequence4 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey8 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence4, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!");
        java.lang.String str9 = charSequenceMultiKey8.toString();
        boolean boolean10 = charSequenceMultiKey3.equals((java.lang.Object) str9);
        java.lang.String str11 = charSequenceMultiKey3.toString();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str9, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MultiKey[, , MultiKey[null, hi!, hi!, hi!]]" + "'", str11, "MultiKey[, , MultiKey[null, hi!, hi!, hi!]]");
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test528");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]", (java.lang.CharSequence) "");
        java.lang.CharSequence[] charSequenceArray3 = null; // flaky: charSequenceMultiKey2.getKeys();
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray3);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test529");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]", (java.lang.CharSequence) "MultiKey[MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!], hi!, MultiKey[MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ], MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]], null]]", (java.lang.CharSequence) "MultiKey[MultiKey[hi!, MultiKey[null, hi!, hi!, hi!], MultiKey[], MultiKey[null, hi!, hi!, hi!], ], MultiKey[hi!, MultiKey[null, hi!, hi!, hi!], MultiKey[], MultiKey[null, hi!, hi!, hi!], ]]");
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test530");
        java.lang.CharSequence[] charSequenceArray0 = new java.lang.CharSequence[] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey1 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray0);
        java.lang.Object obj2 = charSequenceMultiKey1.readResolve();
        java.lang.CharSequence[] charSequenceArray3 = charSequenceMultiKey1.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray3);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray3);
        org.junit.Assert.assertNotNull(charSequenceArray0);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "MultiKey[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "MultiKey[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "MultiKey[]");
        org.junit.Assert.assertNotNull(charSequenceArray3);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test531");
        java.lang.CharSequence charSequence1 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ], MultiKey[null, hi!, hi!, hi!], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]], , MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]]", charSequence1, (java.lang.CharSequence) "MultiKey[MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!], , MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ], MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]], null], MultiKey[hi!, MultiKey[null, hi!, hi!, hi!], MultiKey[], MultiKey[null, hi!, hi!, hi!], ]]", (java.lang.CharSequence) "MultiKey[MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[null, hi!, hi!, hi!], MultiKey[null, hi!, hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]]", (java.lang.CharSequence) "MultiKey[MultiKey[MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!], MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]], null, hi!, null], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]]");
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test532");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[MultiKey[MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], null, MultiKey[null, hi!, hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]], MultiKey[null, MultiKey[MultiKey[null, hi!, hi!, hi!], MultiKey[], null], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]]]", (java.lang.CharSequence) "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ]", (java.lang.CharSequence) "MultiKey[MultiKey[MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!], MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]], null, hi!, null], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]]");
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test533");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[]", (java.lang.CharSequence) "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], null, MultiKey[], ]");
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test534");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence2 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence0, (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]", charSequence2, (java.lang.CharSequence) "MultiKey[]", (java.lang.CharSequence) "");
        java.lang.Object obj6 = charSequenceMultiKey5.readResolve();
        java.lang.CharSequence charSequence7 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey11 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence7, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence[] charSequenceArray12 = null; // flaky: charSequenceMultiKey11.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey13 = null; // flaky: new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray12);
        java.lang.String str14 = null; // flaky: charSequenceMultiKey13.toString();
        boolean boolean15 = charSequenceMultiKey5.equals((java.lang.Object) charSequenceMultiKey13);
        java.lang.String str16 = charSequenceMultiKey5.toString();
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], null, MultiKey[], ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], null, MultiKey[], ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], null, MultiKey[], ]");
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray12);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str14, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], null, MultiKey[], ]" + "'", str16, "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], null, MultiKey[], ]");
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test535");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]]", (java.lang.CharSequence) "MultiKey[MultiKey[MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!], MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]], null, hi!, null], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]]", (java.lang.CharSequence) "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], null, MultiKey[], ]", (java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]");
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test536");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[MultiKey[MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], null, MultiKey[null, hi!, hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]], MultiKey[null, MultiKey[MultiKey[null, hi!, hi!, hi!], MultiKey[], null], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]]]", (java.lang.CharSequence) "MultiKey[MultiKey[MultiKey[null, hi!, hi!, hi!], MultiKey[], null], MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]], MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], null, MultiKey[], ], null, MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], ]]");
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test537");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]", (java.lang.CharSequence) "MultiKey[MultiKey[MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ], MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]], null], MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], null, MultiKey[], ], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], MultiKey[MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], ]], MultiKey[]]");
        java.lang.CharSequence[] charSequenceArray3 = null; // flaky: charSequenceMultiKey2.getKeys();
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray3);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test538");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ]", (java.lang.CharSequence) "MultiKey[hi!, , MultiKey[null, hi!, hi!, hi!], ]", (java.lang.CharSequence) "MultiKey[MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!], MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]], null, hi!, null]", (java.lang.CharSequence) "MultiKey[MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!], hi!, MultiKey[MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ], MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]], null]]", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]");
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test539");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence2 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence0, (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]", charSequence2, (java.lang.CharSequence) "MultiKey[]", (java.lang.CharSequence) "");
        java.lang.Object obj6 = charSequenceMultiKey5.readResolve();
        java.lang.CharSequence[] charSequenceArray7 = null; // flaky: charSequenceMultiKey5.getKeys();
        java.lang.Object obj8 = charSequenceMultiKey5.readResolve();
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], null, MultiKey[], ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], null, MultiKey[], ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], null, MultiKey[], ]");
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], null, MultiKey[], ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], null, MultiKey[], ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], null, MultiKey[], ]");
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test540");
        java.lang.Object obj0 = null;
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "", "MultiKey[null, hi!, hi!, hi!]", "hi!", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey7 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray5, false);
        java.lang.CharSequence[] charSequenceArray8 = charSequenceMultiKey7.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey10 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray8, false);
        java.lang.Object obj11 = charSequenceMultiKey10.readResolve();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey14 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", (java.lang.CharSequence) "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]");
        java.lang.CharSequence[][] charSequenceArray15 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray16 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray17 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray18 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray19 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][][] charSequenceArray20 = new java.lang.CharSequence[][][] { charSequenceArray15, charSequenceArray16, charSequenceArray17, charSequenceArray18, charSequenceArray19 };
        java.lang.CharSequence[][] charSequenceArray21 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray22 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray23 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray24 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray25 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray26 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][][] charSequenceArray27 = new java.lang.CharSequence[][][] { charSequenceArray21, charSequenceArray22, charSequenceArray23, charSequenceArray24, charSequenceArray25, charSequenceArray26 };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[][]> charSequenceArrayMultiKey29 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[][]>(charSequenceArray27, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[][]> charSequenceArrayMultiKey30 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[][]>(charSequenceArray27);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[][][]> charSequenceArrayMultiKey31 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[][][]>(charSequenceArray20, charSequenceArray27);
        boolean boolean32 = charSequenceMultiKey14.equals((java.lang.Object) charSequenceArray20);
        java.lang.CharSequence[] charSequenceArray33 = null; // flaky: charSequenceMultiKey14.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Object> objMultiKey34 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Object>(obj0, obj11, (java.lang.Object) charSequenceMultiKey14);
        java.lang.Class<?> wildcardClass35 = charSequenceMultiKey14.getClass();
        org.junit.Assert.assertNotNull(charSequenceArray5);
        org.junit.Assert.assertNotNull(charSequenceArray8);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]");
        org.junit.Assert.assertNotNull(charSequenceArray15);
        org.junit.Assert.assertNotNull(charSequenceArray16);
        org.junit.Assert.assertNotNull(charSequenceArray17);
        org.junit.Assert.assertNotNull(charSequenceArray18);
        org.junit.Assert.assertNotNull(charSequenceArray19);
        org.junit.Assert.assertNotNull(charSequenceArray20);
        org.junit.Assert.assertNotNull(charSequenceArray21);
        org.junit.Assert.assertNotNull(charSequenceArray22);
        org.junit.Assert.assertNotNull(charSequenceArray23);
        org.junit.Assert.assertNotNull(charSequenceArray24);
        org.junit.Assert.assertNotNull(charSequenceArray25);
        org.junit.Assert.assertNotNull(charSequenceArray26);
        org.junit.Assert.assertNotNull(charSequenceArray27);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray33);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test541");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[]", (java.lang.CharSequence) "hi!");
        int int3 = charSequenceMultiKey2.size();
        java.lang.Object obj4 = charSequenceMultiKey2.readResolve();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "MultiKey[MultiKey[], hi!]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "MultiKey[MultiKey[], hi!]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "MultiKey[MultiKey[], hi!]");
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test542");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]", (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]");
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "MultiKey[]", "", "MultiKey[]", "MultiKey[null, hi!, hi!, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey10 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray9);
        java.lang.String[] strArray13 = new java.lang.String[] { "MultiKey[null, hi!, hi!, hi!]", "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]" };
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!", "MultiKey[]", "", "MultiKey[]", "MultiKey[null, hi!, hi!, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey20 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray19);
        java.lang.String[] strArray26 = new java.lang.String[] { "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", "hi!", "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]", "MultiKey[]", "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]> strArrayMultiKey27 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]>(strArray9, strArray13, strArray19, strArray26);
        boolean boolean28 = charSequenceMultiKey3.equals((java.lang.Object) strArray26);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey29 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence[]) strArray26);
        java.lang.CharSequence charSequence31 = charSequenceMultiKey29.getKey(0);
        int int32 = charSequenceMultiKey29.size();
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + charSequence31 + "' != '" + "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]" + "'", charSequence31, "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 5 + "'", int32 == 5);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test543");
        java.lang.CharSequence charSequence1 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!], , MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ], MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]], null], MultiKey[hi!, MultiKey[null, hi!, hi!, hi!], MultiKey[], MultiKey[null, hi!, hi!, hi!], ]]", charSequence1);
        java.lang.Class<?> wildcardClass3 = charSequenceMultiKey2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test544");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[null, MultiKey[], MultiKey[]]", (java.lang.CharSequence) "MultiKey[MultiKey[MultiKey[null, hi!, hi!, hi!], MultiKey[], null], MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]], MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], null, MultiKey[], ], null, MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], ]]");
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test545");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[]> charSequenceArrayMultiKey1 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[]>(charSequenceArray0);
        java.lang.CharSequence[] charSequenceArray6 = new java.lang.CharSequence[] { "", "MultiKey[null, hi!, hi!, hi!]", "hi!", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey8 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray6, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey10 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray6, true);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey11 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray6);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey13 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray6, true);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey14 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray6);
        java.lang.Object obj15 = charSequenceMultiKey14.readResolve();
        java.lang.CharSequence charSequence16 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey21 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence16, (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]", (java.lang.CharSequence) "", (java.lang.CharSequence) "MultiKey[]", (java.lang.CharSequence) "");
        java.lang.CharSequence[] charSequenceArray22 = null; // flaky: charSequenceMultiKey21.getKeys();
        java.lang.CharSequence[][] charSequenceArray23 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray24 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray25 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray26 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray27 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][][] charSequenceArray28 = new java.lang.CharSequence[][][] { charSequenceArray23, charSequenceArray24, charSequenceArray25, charSequenceArray26, charSequenceArray27 };
        java.lang.CharSequence[][] charSequenceArray29 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray30 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray31 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray32 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray33 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray34 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][][] charSequenceArray35 = new java.lang.CharSequence[][][] { charSequenceArray29, charSequenceArray30, charSequenceArray31, charSequenceArray32, charSequenceArray33, charSequenceArray34 };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[][]> charSequenceArrayMultiKey37 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[][]>(charSequenceArray35, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[][]> charSequenceArrayMultiKey38 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[][]>(charSequenceArray35);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[][][]> charSequenceArrayMultiKey39 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[][][]>(charSequenceArray28, charSequenceArray35);
        java.lang.CharSequence[][] charSequenceArray40 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray41 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray42 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray43 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray44 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][][] charSequenceArray45 = new java.lang.CharSequence[][][] { charSequenceArray40, charSequenceArray41, charSequenceArray42, charSequenceArray43, charSequenceArray44 };
        java.lang.CharSequence[][] charSequenceArray46 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray47 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray48 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray49 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray50 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray51 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][][] charSequenceArray52 = new java.lang.CharSequence[][][] { charSequenceArray46, charSequenceArray47, charSequenceArray48, charSequenceArray49, charSequenceArray50, charSequenceArray51 };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[][]> charSequenceArrayMultiKey54 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[][]>(charSequenceArray52, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[][]> charSequenceArrayMultiKey55 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[][]>(charSequenceArray52);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[][][]> charSequenceArrayMultiKey56 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[][][]>(charSequenceArray45, charSequenceArray52);
        java.lang.CharSequence[] charSequenceArray63 = new java.lang.CharSequence[] { "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], ]", "MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]]", "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], ]", "MultiKey[null, hi!, hi!, hi!]", "MultiKey[MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[null, hi!, hi!, hi!], MultiKey[null, hi!, hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]]", "MultiKey[MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]]" };
        java.lang.CharSequence[] charSequenceArray70 = new java.lang.CharSequence[] { "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], ]", "MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]]", "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], ]", "MultiKey[null, hi!, hi!, hi!]", "MultiKey[MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[null, hi!, hi!, hi!], MultiKey[null, hi!, hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]]", "MultiKey[MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]]" };
        java.lang.CharSequence[][] charSequenceArray71 = new java.lang.CharSequence[][] { charSequenceArray63, charSequenceArray70 };
        java.lang.CharSequence[][][] charSequenceArray72 = new java.lang.CharSequence[][][] { charSequenceArray71 };
        java.lang.CharSequence[][][] charSequenceArray73 = null;
        java.lang.CharSequence[][] charSequenceArray74 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray75 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray76 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray77 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray78 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray79 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][][] charSequenceArray80 = new java.lang.CharSequence[][][] { charSequenceArray74, charSequenceArray75, charSequenceArray76, charSequenceArray77, charSequenceArray78, charSequenceArray79 };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[][]> charSequenceArrayMultiKey82 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[][]>(charSequenceArray80, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[][]> charSequenceArrayMultiKey83 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[][]>(charSequenceArray80);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[][][]> charSequenceArrayMultiKey84 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[][][]>(charSequenceArray28, charSequenceArray45, charSequenceArray72, charSequenceArray73, charSequenceArray80);
        org.apache.commons.collections4.keyvalue.MultiKey<java.io.Serializable> serializableMultiKey85 = new org.apache.commons.collections4.keyvalue.MultiKey<java.io.Serializable>((java.io.Serializable) charSequenceArrayMultiKey1, (java.io.Serializable) charSequenceMultiKey14, (java.io.Serializable) charSequenceMultiKey21, (java.io.Serializable) charSequenceArrayMultiKey84);
        java.lang.Class<?> wildcardClass86 = charSequenceMultiKey14.getClass();
        org.junit.Assert.assertNotNull(charSequenceArray0);
        org.junit.Assert.assertNotNull(charSequenceArray6);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]");
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray22);
        org.junit.Assert.assertNotNull(charSequenceArray23);
        org.junit.Assert.assertNotNull(charSequenceArray24);
        org.junit.Assert.assertNotNull(charSequenceArray25);
        org.junit.Assert.assertNotNull(charSequenceArray26);
        org.junit.Assert.assertNotNull(charSequenceArray27);
        org.junit.Assert.assertNotNull(charSequenceArray28);
        org.junit.Assert.assertNotNull(charSequenceArray29);
        org.junit.Assert.assertNotNull(charSequenceArray30);
        org.junit.Assert.assertNotNull(charSequenceArray31);
        org.junit.Assert.assertNotNull(charSequenceArray32);
        org.junit.Assert.assertNotNull(charSequenceArray33);
        org.junit.Assert.assertNotNull(charSequenceArray34);
        org.junit.Assert.assertNotNull(charSequenceArray35);
        org.junit.Assert.assertNotNull(charSequenceArray40);
        org.junit.Assert.assertNotNull(charSequenceArray41);
        org.junit.Assert.assertNotNull(charSequenceArray42);
        org.junit.Assert.assertNotNull(charSequenceArray43);
        org.junit.Assert.assertNotNull(charSequenceArray44);
        org.junit.Assert.assertNotNull(charSequenceArray45);
        org.junit.Assert.assertNotNull(charSequenceArray46);
        org.junit.Assert.assertNotNull(charSequenceArray47);
        org.junit.Assert.assertNotNull(charSequenceArray48);
        org.junit.Assert.assertNotNull(charSequenceArray49);
        org.junit.Assert.assertNotNull(charSequenceArray50);
        org.junit.Assert.assertNotNull(charSequenceArray51);
        org.junit.Assert.assertNotNull(charSequenceArray52);
        org.junit.Assert.assertNotNull(charSequenceArray63);
        org.junit.Assert.assertNotNull(charSequenceArray70);
        org.junit.Assert.assertNotNull(charSequenceArray71);
        org.junit.Assert.assertNotNull(charSequenceArray72);
        org.junit.Assert.assertNotNull(charSequenceArray74);
        org.junit.Assert.assertNotNull(charSequenceArray75);
        org.junit.Assert.assertNotNull(charSequenceArray76);
        org.junit.Assert.assertNotNull(charSequenceArray77);
        org.junit.Assert.assertNotNull(charSequenceArray78);
        org.junit.Assert.assertNotNull(charSequenceArray79);
        org.junit.Assert.assertNotNull(charSequenceArray80);
        org.junit.Assert.assertNotNull(wildcardClass86);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test546");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", (java.lang.CharSequence) "MultiKey[null, MultiKey[MultiKey[null, hi!, hi!, hi!], MultiKey[], null], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]]", (java.lang.CharSequence) "MultiKey[MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], ]]", (java.lang.CharSequence) "MultiKey[MultiKey[MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], ]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[null, hi!, hi!, hi!], MultiKey[null, hi!, hi!, hi!]]]");
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test547");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]", (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]");
        java.lang.CharSequence[] charSequenceArray7 = new java.lang.CharSequence[] { "", "MultiKey[null, hi!, hi!, hi!]", "hi!", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey9 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray7, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey11 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray7, true);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey12 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray7);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey14 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray7, true);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey15 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray7);
        boolean boolean16 = charSequenceMultiKey2.equals((java.lang.Object) charSequenceMultiKey15);
        java.lang.CharSequence[] charSequenceArray17 = charSequenceMultiKey15.getKeys();
        org.junit.Assert.assertNotNull(charSequenceArray7);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(charSequenceArray17);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test548");
        java.lang.CharSequence charSequence0 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence0, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!");
        java.lang.String str5 = charSequenceMultiKey4.toString();
        java.lang.String str6 = charSequenceMultiKey4.toString();
        java.lang.Object obj7 = null;
        boolean boolean8 = charSequenceMultiKey4.equals(obj7);
        java.lang.CharSequence[] charSequenceArray9 = null; // flaky: charSequenceMultiKey4.getKeys();
        java.lang.Object obj10 = charSequenceMultiKey4.readResolve();
        java.lang.Object obj11 = charSequenceMultiKey4.readResolve();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str5, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str6, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "MultiKey[null, hi!, hi!, hi!]");
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test549");
        java.lang.CharSequence[] charSequenceArray0 = new java.lang.CharSequence[] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey1 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray0);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray0);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray0, false);
        java.lang.CharSequence[] charSequenceArray5 = charSequenceMultiKey4.getKeys();
        java.lang.String str6 = charSequenceMultiKey4.toString();
        boolean boolean8 = charSequenceMultiKey4.equals((java.lang.Object) '4');
        org.junit.Assert.assertNotNull(charSequenceArray0);
        org.junit.Assert.assertNotNull(charSequenceArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiKey[]" + "'", str6, "MultiKey[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test550");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[MultiKey[MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], null, MultiKey[null, hi!, hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]], MultiKey[MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ], MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]], null], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ]]", (java.lang.CharSequence) "MultiKey[MultiKey[MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ], MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]], null], MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], null, MultiKey[], ], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], MultiKey[MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], ]], MultiKey[]]", (java.lang.CharSequence) "MultiKey[]");
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test551");
        java.lang.CharSequence charSequence0 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence0, (java.lang.CharSequence) "MultiKey[MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[null, hi!, hi!, hi!], MultiKey[null, hi!, hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]]", (java.lang.CharSequence) "MultiKey[]");
        java.lang.CharSequence[] charSequenceArray4 = null; // flaky: charSequenceMultiKey3.getKeys();
        java.lang.CharSequence[] charSequenceArray5 = null; // flaky: charSequenceMultiKey3.getKeys();
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray4);
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray5);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test552");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "MultiKey[]", "", "MultiKey[]", "MultiKey[null, hi!, hi!, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray5);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey8 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence[]) strArray5, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey10 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence[]) strArray5, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey12 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence[]) strArray5, true);
        java.lang.Object obj13 = charSequenceMultiKey12.readResolve();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]]");
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test553");
        java.lang.CharSequence[] charSequenceArray0 = new java.lang.CharSequence[] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey1 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray0);
        java.lang.CharSequence charSequence2 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence2, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!");
        java.lang.String str7 = charSequenceMultiKey6.toString();
        java.lang.String str8 = charSequenceMultiKey6.toString();
        java.lang.Object obj9 = null;
        boolean boolean10 = charSequenceMultiKey6.equals(obj9);
        java.lang.CharSequence[] charSequenceArray11 = null; // flaky: charSequenceMultiKey6.getKeys();
        java.lang.CharSequence[] charSequenceArray14 = new java.lang.CharSequence[] { "MultiKey[null, hi!, hi!, hi!]", "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]" };
        java.lang.CharSequence[] charSequenceArray15 = new java.lang.CharSequence[] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey16 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray15);
        java.lang.CharSequence[] charSequenceArray21 = new java.lang.CharSequence[] { "", "MultiKey[null, hi!, hi!, hi!]", "hi!", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey23 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray21, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[]> charSequenceArrayMultiKey24 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[]>(charSequenceArray11, charSequenceArray14, charSequenceArray15, charSequenceArray21);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey25 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray14);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey27 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray14, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey28 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray14);
        boolean boolean29 = charSequenceMultiKey1.equals((java.lang.Object) charSequenceArray14);
        org.junit.Assert.assertNotNull(charSequenceArray0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str7, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str8, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray11);
        org.junit.Assert.assertNotNull(charSequenceArray14);
        org.junit.Assert.assertNotNull(charSequenceArray15);
        org.junit.Assert.assertNotNull(charSequenceArray21);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test554");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", (java.lang.CharSequence) "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]");
        java.lang.String str3 = charSequenceMultiKey2.toString();
        java.lang.Class<?> wildcardClass4 = charSequenceMultiKey2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "MultiKey[MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]]" + "'", str3, "MultiKey[MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test555");
        java.lang.CharSequence charSequence0 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence0, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!");
        java.lang.String str5 = charSequenceMultiKey4.toString();
        java.lang.Object obj6 = charSequenceMultiKey4.readResolve();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str5, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "MultiKey[null, hi!, hi!, hi!]");
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test556");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "MultiKey[]", "", "MultiKey[]", "MultiKey[null, hi!, hi!, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray5);
        java.lang.String[] strArray9 = new java.lang.String[] { "MultiKey[null, hi!, hi!, hi!]", "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]" };
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "MultiKey[]", "", "MultiKey[]", "MultiKey[null, hi!, hi!, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey16 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray15);
        java.lang.String[] strArray22 = new java.lang.String[] { "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", "hi!", "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]", "MultiKey[]", "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]> strArrayMultiKey23 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]>(strArray5, strArray9, strArray15, strArray22);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey24 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray5);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey26 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence[]) strArray5, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey27 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray22);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test557");
        java.lang.CharSequence charSequence0 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence0, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!");
        java.lang.String str5 = charSequenceMultiKey4.toString();
        java.lang.String str6 = charSequenceMultiKey4.toString();
        java.lang.Object obj7 = null;
        boolean boolean8 = charSequenceMultiKey4.equals(obj7);
        java.lang.CharSequence[] charSequenceArray9 = null; // flaky: charSequenceMultiKey4.getKeys();
        java.lang.CharSequence[] charSequenceArray12 = new java.lang.CharSequence[] { "MultiKey[null, hi!, hi!, hi!]", "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]" };
        java.lang.CharSequence[] charSequenceArray13 = new java.lang.CharSequence[] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey14 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray13);
        java.lang.CharSequence[] charSequenceArray19 = new java.lang.CharSequence[] { "", "MultiKey[null, hi!, hi!, hi!]", "hi!", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey21 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray19, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[]> charSequenceArrayMultiKey22 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[]>(charSequenceArray9, charSequenceArray12, charSequenceArray13, charSequenceArray19);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey23 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray12);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey25 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray12, false);
        java.lang.CharSequence[] charSequenceArray26 = charSequenceMultiKey25.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey27 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray26);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str5, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str6, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray9);
        org.junit.Assert.assertNotNull(charSequenceArray12);
        org.junit.Assert.assertNotNull(charSequenceArray13);
        org.junit.Assert.assertNotNull(charSequenceArray19);
        org.junit.Assert.assertNotNull(charSequenceArray26);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test558");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]", (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]");
        java.lang.CharSequence[] charSequenceArray4 = null; // flaky: charSequenceMultiKey3.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = null; // flaky: new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4);
        java.lang.CharSequence[] charSequenceArray6 = null; // flaky: charSequenceMultiKey5.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey8 = null; // flaky: new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray6, false);
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray4);
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray6);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test559");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[]", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", (java.lang.CharSequence) "MultiKey[MultiKey[null, hi!, hi!, hi!], MultiKey[], null]", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", (java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]");
        java.lang.CharSequence[] charSequenceArray6 = null; // flaky: charSequenceMultiKey5.getKeys();
        java.lang.Class<?> wildcardClass7 = null; // flaky: charSequenceArray6.getClass();
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray6);
// flaky:         org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test560");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", (java.lang.CharSequence) "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ]", (java.lang.CharSequence) "MultiKey[MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ], MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]], null]", (java.lang.CharSequence) "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], null, MultiKey[], ]");
        int int5 = charSequenceMultiKey4.size();
        java.lang.Class<?> wildcardClass6 = charSequenceMultiKey4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test561");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!, hi!], MultiKey[], MultiKey[null, hi!, hi!, hi!], ], hi!]", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]", (java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]", (java.lang.CharSequence) "MultiKey[MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], hi!, MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]], hi!]");
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test562");
        java.lang.CharSequence charSequence0 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence0, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!");
        java.lang.String str5 = charSequenceMultiKey4.toString();
        java.lang.String str6 = charSequenceMultiKey4.toString();
        java.lang.Object obj7 = charSequenceMultiKey4.readResolve();
        java.lang.String str8 = charSequenceMultiKey4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str5, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str6, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str8, "MultiKey[null, hi!, hi!, hi!]");
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test563");
        java.lang.CharSequence[] charSequenceArray0 = null;
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "", "MultiKey[null, hi!, hi!, hi!]", "hi!", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey7 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray5, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey9 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray5, true);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey10 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray5);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey12 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray5, true);
        java.lang.CharSequence charSequence13 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey17 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence13, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!");
        java.lang.String str18 = charSequenceMultiKey17.toString();
        java.lang.String str19 = charSequenceMultiKey17.toString();
        java.lang.Object obj20 = null;
        boolean boolean21 = charSequenceMultiKey17.equals(obj20);
        java.lang.CharSequence[] charSequenceArray22 = null; // flaky: charSequenceMultiKey17.getKeys();
        java.lang.CharSequence[] charSequenceArray25 = new java.lang.CharSequence[] { "MultiKey[null, hi!, hi!, hi!]", "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]" };
        java.lang.CharSequence[] charSequenceArray26 = new java.lang.CharSequence[] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey27 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray26);
        java.lang.CharSequence[] charSequenceArray32 = new java.lang.CharSequence[] { "", "MultiKey[null, hi!, hi!, hi!]", "hi!", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey34 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray32, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[]> charSequenceArrayMultiKey35 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[]>(charSequenceArray22, charSequenceArray25, charSequenceArray26, charSequenceArray32);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Object> objMultiKey37 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Object>((java.lang.Object[]) charSequenceArray26, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey39 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray26, false);
        java.lang.CharSequence[] charSequenceArray44 = new java.lang.CharSequence[] { "", "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]", "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey46 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray44, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey47 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray44);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey48 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray44);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[]> charSequenceArrayMultiKey49 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[]>(charSequenceArray0, charSequenceArray5, charSequenceArray26, charSequenceArray44);
        org.junit.Assert.assertNotNull(charSequenceArray5);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str18, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str19, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray22);
        org.junit.Assert.assertNotNull(charSequenceArray25);
        org.junit.Assert.assertNotNull(charSequenceArray26);
        org.junit.Assert.assertNotNull(charSequenceArray32);
        org.junit.Assert.assertNotNull(charSequenceArray44);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test564");
        java.lang.CharSequence charSequence0 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence0, (java.lang.CharSequence) "MultiKey[MultiKey[MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], ]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[null, hi!, hi!, hi!], MultiKey[null, hi!, hi!, hi!]]]", (java.lang.CharSequence) "MultiKey[MultiKey[MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], null, MultiKey[null, hi!, hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]], MultiKey[null, MultiKey[MultiKey[null, hi!, hi!, hi!], MultiKey[], null], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]]]", (java.lang.CharSequence) "MultiKey[MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!], , MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ], MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]], null], MultiKey[hi!, MultiKey[null, hi!, hi!, hi!], MultiKey[], MultiKey[null, hi!, hi!, hi!], ]]");
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test565");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "MultiKey[]", "", "MultiKey[]", "MultiKey[null, hi!, hi!, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray5);
        java.lang.String[] strArray9 = new java.lang.String[] { "MultiKey[null, hi!, hi!, hi!]", "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]" };
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "MultiKey[]", "", "MultiKey[]", "MultiKey[null, hi!, hi!, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey16 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray15);
        java.lang.String[] strArray22 = new java.lang.String[] { "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", "hi!", "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]", "MultiKey[]", "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]> strArrayMultiKey23 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]>(strArray5, strArray9, strArray15, strArray22);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey24 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray5);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey25 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence[]) strArray5);
        java.lang.String str26 = charSequenceMultiKey25.toString();
        java.lang.String str27 = charSequenceMultiKey25.toString();
        java.lang.String str28 = charSequenceMultiKey25.toString();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]]" + "'", str26, "MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]]");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]]" + "'", str27, "MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]]");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]]" + "'", str28, "MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]]");
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test566");
        java.lang.String[][] strArray0 = new java.lang.String[][] {};
        java.lang.String[][] strArray1 = new java.lang.String[][] {};
        java.lang.String[][] strArray2 = new java.lang.String[][] {};
        java.lang.String[][] strArray3 = new java.lang.String[][] {};
        java.lang.String[][][] strArray4 = new java.lang.String[][][] { strArray0, strArray1, strArray2, strArray3 };
        java.lang.String[][] strArray5 = new java.lang.String[][] {};
        java.lang.String[][] strArray6 = new java.lang.String[][] {};
        java.lang.String[][] strArray7 = new java.lang.String[][] {};
        java.lang.String[][] strArray8 = new java.lang.String[][] {};
        java.lang.String[][][] strArray9 = new java.lang.String[][][] { strArray5, strArray6, strArray7, strArray8 };
        java.lang.String[][] strArray10 = new java.lang.String[][] {};
        java.lang.String[][] strArray11 = new java.lang.String[][] {};
        java.lang.String[][] strArray12 = new java.lang.String[][] {};
        java.lang.String[][] strArray13 = new java.lang.String[][] {};
        java.lang.String[][][] strArray14 = new java.lang.String[][][] { strArray10, strArray11, strArray12, strArray13 };
        java.lang.String[][] strArray15 = new java.lang.String[][] {};
        java.lang.String[][] strArray16 = new java.lang.String[][] {};
        java.lang.String[][] strArray17 = new java.lang.String[][] {};
        java.lang.String[][] strArray18 = new java.lang.String[][] {};
        java.lang.String[][][] strArray19 = new java.lang.String[][][] { strArray15, strArray16, strArray17, strArray18 };
        java.lang.String[][] strArray20 = new java.lang.String[][] {};
        java.lang.String[][] strArray21 = new java.lang.String[][] {};
        java.lang.String[][] strArray22 = new java.lang.String[][] {};
        java.lang.String[][] strArray23 = new java.lang.String[][] {};
        java.lang.String[][][] strArray24 = new java.lang.String[][][] { strArray20, strArray21, strArray22, strArray23 };
        java.lang.String[][][][] strArray25 = new java.lang.String[][][][] { strArray4, strArray9, strArray14, strArray19, strArray24 };
        java.lang.String[][][][][] strArray26 = new java.lang.String[][][][][] { strArray25 };
        java.lang.String[][][][][] strArray27 = new java.lang.String[][][][][] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[][][][]> strArrayMultiKey28 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[][][][]>(strArray27);
        org.apache.commons.collections4.keyvalue.MultiKey<java.io.Serializable[][][][]> serializableArrayMultiKey30 = new org.apache.commons.collections4.keyvalue.MultiKey<java.io.Serializable[][][][]>((java.io.Serializable[][][][][]) strArray27, false);
        java.lang.String[][][][][] strArray31 = new java.lang.String[][][][][] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[][][][]> strArrayMultiKey32 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[][][][]>(strArray31);
        org.apache.commons.collections4.keyvalue.MultiKey<java.io.Serializable[][][][]> serializableArrayMultiKey34 = new org.apache.commons.collections4.keyvalue.MultiKey<java.io.Serializable[][][][]>((java.io.Serializable[][][][][]) strArray31, false);
        java.lang.String[][][][][] strArray35 = new java.lang.String[][][][][] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[][][][]> strArrayMultiKey36 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[][][][]>(strArray35);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[][][][][]> strArrayMultiKey37 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[][][][][]>(strArray26, strArray27, strArray31, strArray35);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(strArray35);
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test567");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]", (java.lang.CharSequence) "MultiKey[MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!], MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]], null, hi!, null]", (java.lang.CharSequence) "hi!");
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test568");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[MultiKey[hi!, MultiKey[null, hi!, hi!, hi!], MultiKey[], MultiKey[null, hi!, hi!, hi!], ], MultiKey[hi!, MultiKey[null, hi!, hi!, hi!], MultiKey[], MultiKey[null, hi!, hi!, hi!], ]]", (java.lang.CharSequence) "MultiKey[MultiKey[MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], hi!, MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]], hi!], MultiKey[MultiKey[MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ], MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]], null], MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], null, MultiKey[], ], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], MultiKey[MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], ]], MultiKey[]], MultiKey[MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], null, MultiKey[null, hi!, hi!, hi!]]]", (java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[null, hi!, hi!, hi!], MultiKey[null, hi!, hi!, hi!]]", (java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]]");
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test569");
        java.lang.String[][] strArray0 = new java.lang.String[][] {};
        java.lang.String[][] strArray1 = new java.lang.String[][] {};
        java.lang.String[][] strArray2 = new java.lang.String[][] {};
        java.lang.String[][] strArray3 = new java.lang.String[][] {};
        java.lang.String[][] strArray4 = new java.lang.String[][] {};
        java.lang.String[][] strArray5 = new java.lang.String[][] {};
        java.lang.String[][][] strArray6 = new java.lang.String[][][] { strArray0, strArray1, strArray2, strArray3, strArray4, strArray5 };
        java.lang.String[][] strArray7 = new java.lang.String[][] {};
        java.lang.String[][] strArray8 = new java.lang.String[][] {};
        java.lang.String[][] strArray9 = new java.lang.String[][] {};
        java.lang.String[][] strArray10 = new java.lang.String[][] {};
        java.lang.String[][] strArray11 = new java.lang.String[][] {};
        java.lang.String[][] strArray12 = new java.lang.String[][] {};
        java.lang.String[][][] strArray13 = new java.lang.String[][][] { strArray7, strArray8, strArray9, strArray10, strArray11, strArray12 };
        java.lang.String[][][][] strArray14 = new java.lang.String[][][][] { strArray6, strArray13 };
        java.lang.String[][][][] strArray15 = null;
        java.lang.String[] strArray17 = new java.lang.String[] { "MultiKey[MultiKey[null, hi!, hi!, hi!], MultiKey[], null]" };
        java.lang.String[] strArray19 = new java.lang.String[] { "MultiKey[MultiKey[null, hi!, hi!, hi!], MultiKey[], null]" };
        java.lang.String[] strArray21 = new java.lang.String[] { "MultiKey[MultiKey[null, hi!, hi!, hi!], MultiKey[], null]" };
        java.lang.String[] strArray23 = new java.lang.String[] { "MultiKey[MultiKey[null, hi!, hi!, hi!], MultiKey[], null]" };
        java.lang.String[] strArray25 = new java.lang.String[] { "MultiKey[MultiKey[null, hi!, hi!, hi!], MultiKey[], null]" };
        java.lang.String[][] strArray26 = new java.lang.String[][] { strArray17, strArray19, strArray21, strArray23, strArray25 };
        java.lang.String[] strArray28 = new java.lang.String[] { "MultiKey[MultiKey[null, hi!, hi!, hi!], MultiKey[], null]" };
        java.lang.String[] strArray30 = new java.lang.String[] { "MultiKey[MultiKey[null, hi!, hi!, hi!], MultiKey[], null]" };
        java.lang.String[] strArray32 = new java.lang.String[] { "MultiKey[MultiKey[null, hi!, hi!, hi!], MultiKey[], null]" };
        java.lang.String[] strArray34 = new java.lang.String[] { "MultiKey[MultiKey[null, hi!, hi!, hi!], MultiKey[], null]" };
        java.lang.String[] strArray36 = new java.lang.String[] { "MultiKey[MultiKey[null, hi!, hi!, hi!], MultiKey[], null]" };
        java.lang.String[][] strArray37 = new java.lang.String[][] { strArray28, strArray30, strArray32, strArray34, strArray36 };
        java.lang.String[] strArray39 = new java.lang.String[] { "MultiKey[MultiKey[null, hi!, hi!, hi!], MultiKey[], null]" };
        java.lang.String[] strArray41 = new java.lang.String[] { "MultiKey[MultiKey[null, hi!, hi!, hi!], MultiKey[], null]" };
        java.lang.String[] strArray43 = new java.lang.String[] { "MultiKey[MultiKey[null, hi!, hi!, hi!], MultiKey[], null]" };
        java.lang.String[] strArray45 = new java.lang.String[] { "MultiKey[MultiKey[null, hi!, hi!, hi!], MultiKey[], null]" };
        java.lang.String[] strArray47 = new java.lang.String[] { "MultiKey[MultiKey[null, hi!, hi!, hi!], MultiKey[], null]" };
        java.lang.String[][] strArray48 = new java.lang.String[][] { strArray39, strArray41, strArray43, strArray45, strArray47 };
        java.lang.String[] strArray50 = new java.lang.String[] { "MultiKey[MultiKey[null, hi!, hi!, hi!], MultiKey[], null]" };
        java.lang.String[] strArray52 = new java.lang.String[] { "MultiKey[MultiKey[null, hi!, hi!, hi!], MultiKey[], null]" };
        java.lang.String[] strArray54 = new java.lang.String[] { "MultiKey[MultiKey[null, hi!, hi!, hi!], MultiKey[], null]" };
        java.lang.String[] strArray56 = new java.lang.String[] { "MultiKey[MultiKey[null, hi!, hi!, hi!], MultiKey[], null]" };
        java.lang.String[] strArray58 = new java.lang.String[] { "MultiKey[MultiKey[null, hi!, hi!, hi!], MultiKey[], null]" };
        java.lang.String[][] strArray59 = new java.lang.String[][] { strArray50, strArray52, strArray54, strArray56, strArray58 };
        java.lang.String[][][] strArray60 = new java.lang.String[][][] { strArray26, strArray37, strArray48, strArray59 };
        java.lang.String[][][][] strArray61 = new java.lang.String[][][][] { strArray60 };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[][][]> strArrayMultiKey62 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[][][]>(strArray61);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[][][][]> strArrayMultiKey63 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[][][][]>(strArray14, strArray15, strArray61);
        java.lang.Class<?> wildcardClass64 = strArrayMultiKey63.getClass();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertNotNull(wildcardClass64);
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test570");
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] { "", "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]", "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4, false);
        java.lang.Object obj7 = charSequenceMultiKey6.readResolve();
        java.lang.String str8 = charSequenceMultiKey6.toString();
        java.lang.CharSequence[] charSequenceArray9 = new java.lang.CharSequence[] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey10 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray9);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey13 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "", (java.lang.CharSequence) "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey16 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]");
        java.lang.CharSequence[] charSequenceArray21 = new java.lang.CharSequence[] { "", "MultiKey[null, hi!, hi!, hi!]", "hi!", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey23 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray21, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey25 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray21, true);
        java.lang.CharSequence[] charSequenceArray26 = charSequenceMultiKey25.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey[] multiKeyArray28 = new org.apache.commons.collections4.keyvalue.MultiKey[4];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[] charSequenceMultiKeyArray29 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]) multiKeyArray28;
        charSequenceMultiKeyArray29[0] = charSequenceMultiKey10;
        charSequenceMultiKeyArray29[1] = charSequenceMultiKey13;
        charSequenceMultiKeyArray29[2] = charSequenceMultiKey16;
        charSequenceMultiKeyArray29[3] = charSequenceMultiKey25;
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>> charSequenceMultiKeyMultiKey39 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>>(charSequenceMultiKeyArray29, false);
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>> charSequenceMultiKeyMultiKey41 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>>(charSequenceMultiKeyArray29, true);
        java.lang.CharSequence[] charSequenceArray42 = new java.lang.CharSequence[] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey43 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray42);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey46 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "", (java.lang.CharSequence) "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey49 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]");
        java.lang.CharSequence[] charSequenceArray54 = new java.lang.CharSequence[] { "", "MultiKey[null, hi!, hi!, hi!]", "hi!", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey56 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray54, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey58 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray54, true);
        java.lang.CharSequence[] charSequenceArray59 = charSequenceMultiKey58.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey[] multiKeyArray61 = new org.apache.commons.collections4.keyvalue.MultiKey[4];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[] charSequenceMultiKeyArray62 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]) multiKeyArray61;
        charSequenceMultiKeyArray62[0] = charSequenceMultiKey43;
        charSequenceMultiKeyArray62[1] = charSequenceMultiKey46;
        charSequenceMultiKeyArray62[2] = charSequenceMultiKey49;
        charSequenceMultiKeyArray62[3] = charSequenceMultiKey58;
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>> charSequenceMultiKeyMultiKey72 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>>(charSequenceMultiKeyArray62, false);
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>> charSequenceMultiKeyMultiKey73 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>>(charSequenceMultiKeyArray62);
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]> charSequenceMultiKeyArrayMultiKey74 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]>(charSequenceMultiKeyArray29, charSequenceMultiKeyArray62);
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>> charSequenceMultiKeyMultiKey76 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>>(charSequenceMultiKeyArray62, true);
        boolean boolean77 = charSequenceMultiKey6.equals((java.lang.Object) charSequenceMultiKeyMultiKey76);
        java.lang.CharSequence[] charSequenceArray78 = charSequenceMultiKey6.getKeys();
        org.junit.Assert.assertNotNull(charSequenceArray4);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]" + "'", str8, "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]");
        org.junit.Assert.assertNotNull(charSequenceArray9);
        org.junit.Assert.assertNotNull(charSequenceArray21);
        org.junit.Assert.assertNotNull(charSequenceArray26);
        org.junit.Assert.assertNotNull(multiKeyArray28);
        org.junit.Assert.assertNotNull(charSequenceMultiKeyArray29);
        org.junit.Assert.assertNotNull(charSequenceArray42);
        org.junit.Assert.assertNotNull(charSequenceArray54);
        org.junit.Assert.assertNotNull(charSequenceArray59);
        org.junit.Assert.assertNotNull(multiKeyArray61);
        org.junit.Assert.assertNotNull(charSequenceMultiKeyArray62);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(charSequenceArray78);
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test571");
        java.lang.CharSequence charSequence2 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence2, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence[] charSequenceArray7 = null; // flaky: charSequenceMultiKey6.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey8 = null; // flaky: new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray7);
        org.apache.commons.collections4.keyvalue.MultiKey<java.io.Serializable> serializableMultiKey9 = new org.apache.commons.collections4.keyvalue.MultiKey<java.io.Serializable>((java.io.Serializable) false, (java.io.Serializable) (byte) 10, (java.io.Serializable) charSequenceArray7);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey11 = null; // flaky: new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray7, false);
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray7);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test572");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]", (java.lang.CharSequence) "MultiKey[MultiKey[MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ], MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]], null], MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], null, MultiKey[], ], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], MultiKey[MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], ]], MultiKey[]]", (java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]]");
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test573");
        java.lang.CharSequence charSequence0 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence0, (java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass3 = charSequenceMultiKey2.getClass();
        java.lang.reflect.Type[] typeArray4 = new java.lang.reflect.Type[] { wildcardClass3 };
        java.lang.CharSequence charSequence5 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey7 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence5, (java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass8 = charSequenceMultiKey7.getClass();
        java.lang.reflect.Type[] typeArray9 = new java.lang.reflect.Type[] { wildcardClass8 };
        java.lang.CharSequence charSequence10 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey12 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence10, (java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass13 = charSequenceMultiKey12.getClass();
        java.lang.reflect.Type[] typeArray14 = new java.lang.reflect.Type[] { wildcardClass13 };
        java.lang.CharSequence charSequence15 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey17 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence15, (java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass18 = charSequenceMultiKey17.getClass();
        java.lang.reflect.Type[] typeArray19 = new java.lang.reflect.Type[] { wildcardClass18 };
        java.lang.CharSequence charSequence20 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey22 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence20, (java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass23 = charSequenceMultiKey22.getClass();
        java.lang.reflect.Type[] typeArray24 = new java.lang.reflect.Type[] { wildcardClass23 };
        java.lang.reflect.Type[][] typeArray25 = new java.lang.reflect.Type[][] { typeArray4, typeArray9, typeArray14, typeArray19, typeArray24 };
        java.lang.CharSequence charSequence26 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey28 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence26, (java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass29 = charSequenceMultiKey28.getClass();
        java.lang.reflect.Type[] typeArray30 = new java.lang.reflect.Type[] { wildcardClass29 };
        java.lang.CharSequence charSequence31 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey33 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence31, (java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass34 = charSequenceMultiKey33.getClass();
        java.lang.reflect.Type[] typeArray35 = new java.lang.reflect.Type[] { wildcardClass34 };
        java.lang.CharSequence charSequence36 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey38 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence36, (java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass39 = charSequenceMultiKey38.getClass();
        java.lang.reflect.Type[] typeArray40 = new java.lang.reflect.Type[] { wildcardClass39 };
        java.lang.CharSequence charSequence41 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey43 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence41, (java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass44 = charSequenceMultiKey43.getClass();
        java.lang.reflect.Type[] typeArray45 = new java.lang.reflect.Type[] { wildcardClass44 };
        java.lang.CharSequence charSequence46 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey48 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence46, (java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass49 = charSequenceMultiKey48.getClass();
        java.lang.reflect.Type[] typeArray50 = new java.lang.reflect.Type[] { wildcardClass49 };
        java.lang.reflect.Type[][] typeArray51 = new java.lang.reflect.Type[][] { typeArray30, typeArray35, typeArray40, typeArray45, typeArray50 };
        java.lang.reflect.Type[][][] typeArray52 = new java.lang.reflect.Type[][][] { typeArray25, typeArray51 };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[][]> typeArrayMultiKey54 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[][]>(typeArray52, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[][]> typeArrayMultiKey56 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[][]>(typeArray52, false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(typeArray9);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(typeArray14);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertNotNull(typeArray25);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(typeArray30);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNotNull(typeArray35);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertNotNull(typeArray40);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertNotNull(typeArray45);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertNotNull(typeArray50);
        org.junit.Assert.assertNotNull(typeArray51);
        org.junit.Assert.assertNotNull(typeArray52);
    }
}
