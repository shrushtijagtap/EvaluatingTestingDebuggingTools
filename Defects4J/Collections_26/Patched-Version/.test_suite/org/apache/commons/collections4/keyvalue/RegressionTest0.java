package org.apache.commons.collections4.keyvalue;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        java.lang.CharSequence charSequence0 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence0, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!");
        java.lang.String str5 = charSequenceMultiKey4.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence7 = charSequenceMultiKey4.getKey((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str5, "MultiKey[null, hi!, hi!, hi!]");
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        java.lang.CharSequence charSequence0 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence0, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!");
        java.lang.String str5 = charSequenceMultiKey4.toString();
        java.lang.Class<?> wildcardClass6 = charSequenceMultiKey4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str5, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        java.lang.CharSequence charSequence0 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence0, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence6 = charSequenceMultiKey4.getKey(10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] { "", "MultiKey[null, hi!, hi!, hi!]", "hi!", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4, false);
        java.lang.Class<?> wildcardClass7 = charSequenceMultiKey6.getClass();
        org.junit.Assert.assertNotNull(charSequenceArray4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        java.lang.CharSequence charSequence0 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence0, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!");
        java.lang.String str5 = charSequenceMultiKey4.toString();
        int int6 = charSequenceMultiKey4.size();
        java.lang.Class<?> wildcardClass7 = charSequenceMultiKey4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str5, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        java.lang.CharSequence charSequence0 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence0, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!");
        java.lang.String str5 = charSequenceMultiKey4.toString();
        int int6 = charSequenceMultiKey4.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence8 = charSequenceMultiKey4.getKey(10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str5, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        java.lang.CharSequence[] charSequenceArray0 = new java.lang.CharSequence[] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey1 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence3 = charSequenceMultiKey1.getKey((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceArray0);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        java.lang.CharSequence charSequence0 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence0, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!");
        java.lang.String str5 = charSequenceMultiKey4.toString();
        java.lang.CharSequence[] charSequenceArray6 = null; // flaky: charSequenceMultiKey4.getKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence8 = charSequenceMultiKey4.getKey((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str5, "MultiKey[null, hi!, hi!, hi!]");
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray6);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        java.lang.CharSequence[] charSequenceArray0 = new java.lang.CharSequence[] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey1 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray0);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence4 = charSequenceMultiKey2.getKey((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceArray0);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        java.lang.CharSequence[] charSequenceArray0 = new java.lang.CharSequence[] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey1 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray0);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray0);
        int int3 = charSequenceMultiKey2.size();
        int int4 = charSequenceMultiKey2.size();
        org.junit.Assert.assertNotNull(charSequenceArray0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence5 = charSequenceMultiKey3.getKey(3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        java.lang.CharSequence[] charSequenceArray0 = new java.lang.CharSequence[] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey1 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray0);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray0);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray0, false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence6 = charSequenceMultiKey4.getKey(3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceArray0);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        java.lang.CharSequence[] charSequenceArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey1 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The array of keys must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "MultiKey[]", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "");
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence4 = charSequenceMultiKey2.getKey(3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] { "", "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]", "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4, false);
        java.lang.Object obj7 = charSequenceMultiKey6.readResolve();
        java.lang.String str8 = charSequenceMultiKey6.toString();
        java.lang.String str9 = charSequenceMultiKey6.toString();
        org.junit.Assert.assertNotNull(charSequenceArray4);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]" + "'", str8, "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]" + "'", str9, "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]");
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        java.lang.CharSequence charSequence0 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence0, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!");
        java.lang.String str5 = charSequenceMultiKey4.toString();
        java.lang.CharSequence[] charSequenceArray6 = null; // flaky: charSequenceMultiKey4.getKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence8 = charSequenceMultiKey4.getKey((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str5, "MultiKey[null, hi!, hi!, hi!]");
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray6);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
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
        java.lang.Class<?> wildcardClass23 = charSequenceArray19.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str5, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str6, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray9);
        org.junit.Assert.assertNotNull(charSequenceArray12);
        org.junit.Assert.assertNotNull(charSequenceArray13);
        org.junit.Assert.assertNotNull(charSequenceArray19);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[null, hi!, hi!, hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[null, hi!, hi!, hi!]");
        java.lang.Class<?> wildcardClass4 = strComparableMultiKey3.getClass();
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray5);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey9 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "", (java.lang.CharSequence) "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey12 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]");
        java.lang.CharSequence[] charSequenceArray17 = new java.lang.CharSequence[] { "", "MultiKey[null, hi!, hi!, hi!]", "hi!", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey19 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray17, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey21 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray17, true);
        java.lang.CharSequence[] charSequenceArray22 = charSequenceMultiKey21.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey[] multiKeyArray24 = new org.apache.commons.collections4.keyvalue.MultiKey[4];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[] charSequenceMultiKeyArray25 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]) multiKeyArray24;
        charSequenceMultiKeyArray25[0] = charSequenceMultiKey6;
        charSequenceMultiKeyArray25[1] = charSequenceMultiKey9;
        charSequenceMultiKeyArray25[2] = charSequenceMultiKey12;
        charSequenceMultiKeyArray25[3] = charSequenceMultiKey21;
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>> charSequenceMultiKeyMultiKey35 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>>(charSequenceMultiKeyArray25, false);
        java.lang.Class<?> wildcardClass36 = charSequenceMultiKeyMultiKey35.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type> typeMultiKey37 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type>((java.lang.reflect.Type) wildcardClass4, (java.lang.reflect.Type) wildcardClass36);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(charSequenceArray5);
        org.junit.Assert.assertNotNull(charSequenceArray17);
        org.junit.Assert.assertNotNull(charSequenceArray22);
        org.junit.Assert.assertNotNull(multiKeyArray24);
        org.junit.Assert.assertNotNull(charSequenceMultiKeyArray25);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] { "", "MultiKey[null, hi!, hi!, hi!]", "hi!", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey8 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4, true);
        java.lang.CharSequence[] charSequenceArray9 = charSequenceMultiKey8.getKeys();
        java.lang.CharSequence charSequence11 = charSequenceMultiKey8.getKey((int) (byte) 0);
        org.junit.Assert.assertNotNull(charSequenceArray4);
        org.junit.Assert.assertNotNull(charSequenceArray9);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "" + "'", charSequence11, "");
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]", (java.lang.CharSequence) "MultiKey[]");
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]", (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]");
        java.lang.Object obj3 = null;
        boolean boolean4 = charSequenceMultiKey2.equals(obj3);
        java.lang.String str5 = charSequenceMultiKey2.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence7 = charSequenceMultiKey2.getKey((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]" + "'", str5, "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]");
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        java.lang.CharSequence charSequence0 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence0, (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]", (java.lang.CharSequence) "", (java.lang.CharSequence) "MultiKey[]", (java.lang.CharSequence) "");
        int int6 = charSequenceMultiKey5.size();
        java.lang.String str7 = charSequenceMultiKey5.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ]" + "'", str7, "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ]");
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
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
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey24 = null; // flaky: new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray9, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str5, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str6, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray9);
        org.junit.Assert.assertNotNull(charSequenceArray12);
        org.junit.Assert.assertNotNull(charSequenceArray13);
        org.junit.Assert.assertNotNull(charSequenceArray19);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        java.lang.Object[] objArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Object> objMultiKey1 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Object>(objArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The array of keys must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        java.lang.CharSequence charSequence0 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence0, (java.lang.CharSequence) "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]");
        java.lang.Object obj3 = charSequenceMultiKey2.readResolve();
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "MultiKey[null, MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "MultiKey[null, MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "MultiKey[null, MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]]");
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] { "", "MultiKey[null, hi!, hi!, hi!]", "hi!", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey8 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4, true);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey9 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey11 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4, true);
        java.lang.String str12 = charSequenceMultiKey11.toString();
        org.junit.Assert.assertNotNull(charSequenceArray4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]" + "'", str12, "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]");
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        java.lang.CharSequence[] charSequenceArray0 = new java.lang.CharSequence[] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey1 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray0);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray0, false);
        int int4 = charSequenceMultiKey3.size();
        org.junit.Assert.assertNotNull(charSequenceArray0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "MultiKey[]", "", "MultiKey[]", "MultiKey[null, hi!, hi!, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray5);
        java.lang.Class<?> wildcardClass7 = strArray5.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        java.lang.CharSequence charSequence0 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence0, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence[] charSequenceArray5 = null; // flaky: charSequenceMultiKey4.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey6 = null; // flaky: new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray5);
        java.lang.Object obj7 = null; // flaky: charSequenceMultiKey6.readResolve();
        java.lang.String str8 = null; // flaky: charSequenceMultiKey6.toString();
        java.lang.String str9 = null; // flaky: charSequenceMultiKey6.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence11 = null; // flaky: charSequenceMultiKey6.getKey((int) 'a');
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray5);
// flaky:         org.junit.Assert.assertNotNull(obj7);
// flaky:         org.junit.Assert.assertEquals(obj7.toString(), "MultiKey[null, hi!, hi!, hi!]");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "MultiKey[null, hi!, hi!, hi!]");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "MultiKey[null, hi!, hi!, hi!]");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str8, "MultiKey[null, hi!, hi!, hi!]");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str9, "MultiKey[null, hi!, hi!, hi!]");
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String> strMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String>("MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ]", "MultiKey[null, hi!, hi!, hi!]");
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence2 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence0, (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]", charSequence2, (java.lang.CharSequence) "MultiKey[]", (java.lang.CharSequence) "");
        java.lang.CharSequence[] charSequenceArray6 = null; // flaky: charSequenceMultiKey5.getKeys();
        java.lang.Class<?> wildcardClass7 = null; // flaky: charSequenceArray6.getClass();
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray6);
// flaky:         org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        java.lang.CharSequence[] charSequenceArray0 = new java.lang.CharSequence[] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey1 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray0);
        java.lang.Object obj2 = charSequenceMultiKey1.readResolve();
        java.lang.Object obj3 = charSequenceMultiKey1.readResolve();
        java.lang.String str4 = charSequenceMultiKey1.toString();
        java.lang.Class<?> wildcardClass5 = charSequenceMultiKey1.getClass();
        org.junit.Assert.assertNotNull(charSequenceArray0);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "MultiKey[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "MultiKey[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "MultiKey[]");
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "MultiKey[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "MultiKey[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "MultiKey[]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MultiKey[]" + "'", str4, "MultiKey[]");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]", (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]", (java.lang.CharSequence) "MultiKey[]", (java.lang.CharSequence) "");
        int int5 = charSequenceMultiKey4.size();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        java.lang.CharSequence charSequence0 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence0, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "MultiKey[]", (java.lang.CharSequence) "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]");
        java.lang.CharSequence charSequence6 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey10 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence6, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!");
        java.lang.String str11 = charSequenceMultiKey10.toString();
        int int12 = charSequenceMultiKey10.size();
        java.lang.Class<?> wildcardClass13 = charSequenceMultiKey10.getClass();
        java.lang.reflect.Type[] typeArray14 = new java.lang.reflect.Type[] { wildcardClass13 };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type> typeMultiKey16 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type>(typeArray14, true);
        boolean boolean17 = charSequenceMultiKey5.equals((java.lang.Object) true);
        java.lang.CharSequence[] charSequenceArray18 = new java.lang.CharSequence[] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey19 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray18);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey20 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray18);
        java.lang.String str21 = charSequenceMultiKey20.toString();
        boolean boolean22 = charSequenceMultiKey5.equals((java.lang.Object) charSequenceMultiKey20);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence24 = charSequenceMultiKey20.getKey((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str11, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(typeArray14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(charSequenceArray18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "MultiKey[]" + "'", str21, "MultiKey[]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]", (java.lang.CharSequence) "MultiKey[]", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]", (java.lang.CharSequence) "");
        java.lang.CharSequence[] charSequenceArray6 = null; // flaky: charSequenceMultiKey5.getKeys();
        java.lang.String str7 = charSequenceMultiKey5.toString();
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "MultiKey[hi!, MultiKey[null, hi!, hi!, hi!], MultiKey[], MultiKey[null, hi!, hi!, hi!], ]" + "'", str7, "MultiKey[hi!, MultiKey[null, hi!, hi!, hi!], MultiKey[], MultiKey[null, hi!, hi!, hi!], ]");
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        java.lang.CharSequence charSequence2 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]", (java.lang.CharSequence) "MultiKey[]", charSequence2);
        java.lang.Object obj4 = charSequenceMultiKey3.readResolve();
        java.lang.String str5 = charSequenceMultiKey3.toString();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "MultiKey[MultiKey[null, hi!, hi!, hi!], MultiKey[], null]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "MultiKey[MultiKey[null, hi!, hi!, hi!], MultiKey[], null]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "MultiKey[MultiKey[null, hi!, hi!, hi!], MultiKey[], null]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MultiKey[MultiKey[null, hi!, hi!, hi!], MultiKey[], null]" + "'", str5, "MultiKey[MultiKey[null, hi!, hi!, hi!], MultiKey[], null]");
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]");
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]");
        java.lang.CharSequence[] charSequenceArray3 = null; // flaky: charSequenceMultiKey2.getKeys();
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray3);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        java.lang.CharSequence charSequence0 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence0, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "MultiKey[]", (java.lang.CharSequence) "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]");
        java.lang.CharSequence charSequence6 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey10 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence6, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!");
        java.lang.String str11 = charSequenceMultiKey10.toString();
        int int12 = charSequenceMultiKey10.size();
        java.lang.Class<?> wildcardClass13 = charSequenceMultiKey10.getClass();
        java.lang.reflect.Type[] typeArray14 = new java.lang.reflect.Type[] { wildcardClass13 };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type> typeMultiKey16 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type>(typeArray14, true);
        boolean boolean17 = charSequenceMultiKey5.equals((java.lang.Object) true);
        java.lang.String str18 = charSequenceMultiKey5.toString();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str11, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(typeArray14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]" + "'", str18, "MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]");
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", (java.lang.CharSequence) "MultiKey[]", (java.lang.CharSequence) "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]");
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        java.lang.CharSequence charSequence0 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence0, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!");
        java.lang.String str5 = charSequenceMultiKey4.toString();
        java.lang.String str6 = charSequenceMultiKey4.toString();
        java.lang.Object obj7 = null;
        boolean boolean8 = charSequenceMultiKey4.equals(obj7);
        java.lang.CharSequence[] charSequenceArray9 = null; // flaky: charSequenceMultiKey4.getKeys();
        java.lang.String str10 = charSequenceMultiKey4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str5, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str6, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str10, "MultiKey[null, hi!, hi!, hi!]");
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "", (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]");
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]");
        java.lang.String str4 = charSequenceMultiKey3.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence6 = charSequenceMultiKey3.getKey((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[null, hi!, hi!, hi!], MultiKey[null, hi!, hi!, hi!]]" + "'", str4, "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[null, hi!, hi!, hi!], MultiKey[null, hi!, hi!, hi!]]");
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]", (java.lang.CharSequence) "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ]");
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        java.lang.CharSequence charSequence0 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence0, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!");
        java.lang.String str5 = charSequenceMultiKey4.toString();
        java.lang.CharSequence[] charSequenceArray6 = null; // flaky: charSequenceMultiKey4.getKeys();
        java.lang.Class<?> wildcardClass7 = charSequenceMultiKey4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str5, "MultiKey[null, hi!, hi!, hi!]");
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        java.lang.Comparable<java.lang.String>[] strComparableArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey1 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparableArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The array of keys must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] { "", "MultiKey[null, hi!, hi!, hi!]", "hi!", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4, false);
        java.lang.CharSequence[] charSequenceArray7 = charSequenceMultiKey6.getKeys();
        int int8 = charSequenceMultiKey6.size();
        java.lang.CharSequence[] charSequenceArray9 = charSequenceMultiKey6.getKeys();
        org.junit.Assert.assertNotNull(charSequenceArray4);
        org.junit.Assert.assertNotNull(charSequenceArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(charSequenceArray9);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        java.io.Serializable serializable0 = null;
        java.lang.CharSequence[] charSequenceArray1 = new java.lang.CharSequence[] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray1);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray1);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray1, false);
        java.lang.CharSequence[] charSequenceArray6 = charSequenceMultiKey5.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey7 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray6);
        org.apache.commons.collections4.keyvalue.MultiKey<java.io.Serializable> serializableMultiKey8 = new org.apache.commons.collections4.keyvalue.MultiKey<java.io.Serializable>(serializable0, (java.io.Serializable) charSequenceArray6);
        org.junit.Assert.assertNotNull(charSequenceArray1);
        org.junit.Assert.assertNotNull(charSequenceArray6);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "", (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]", (java.lang.CharSequence) "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]");
        java.lang.CharSequence[] charSequenceArray5 = null; // flaky: charSequenceMultiKey4.getKeys();
        int int6 = charSequenceMultiKey4.size();
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        java.lang.CharSequence charSequence2 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]", (java.lang.CharSequence) "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]", charSequence2, (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", (java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey8 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]");
        java.lang.CharSequence charSequence9 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey13 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence9, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!");
        java.lang.String str14 = charSequenceMultiKey13.toString();
        java.lang.String str15 = charSequenceMultiKey13.toString();
        java.lang.Object obj16 = null;
        boolean boolean17 = charSequenceMultiKey13.equals(obj16);
        java.lang.CharSequence[] charSequenceArray18 = null; // flaky: charSequenceMultiKey13.getKeys();
        java.lang.CharSequence[] charSequenceArray21 = new java.lang.CharSequence[] { "MultiKey[null, hi!, hi!, hi!]", "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]" };
        java.lang.CharSequence[] charSequenceArray22 = new java.lang.CharSequence[] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey23 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray22);
        java.lang.CharSequence[] charSequenceArray28 = new java.lang.CharSequence[] { "", "MultiKey[null, hi!, hi!, hi!]", "hi!", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey30 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray28, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[]> charSequenceArrayMultiKey31 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[]>(charSequenceArray18, charSequenceArray21, charSequenceArray22, charSequenceArray28);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey33 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray22, true);
        boolean boolean34 = charSequenceMultiKey8.equals((java.lang.Object) charSequenceArray22);
        boolean boolean35 = charSequenceMultiKey5.equals((java.lang.Object) boolean34);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str14, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str15, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray18);
        org.junit.Assert.assertNotNull(charSequenceArray21);
        org.junit.Assert.assertNotNull(charSequenceArray22);
        org.junit.Assert.assertNotNull(charSequenceArray28);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        java.lang.reflect.Type[] typeArray0 = new java.lang.reflect.Type[] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type> typeMultiKey1 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type>(typeArray0);
        org.junit.Assert.assertNotNull(typeArray0);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        java.lang.CharSequence charSequence0 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence0, (java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[null, hi!, hi!, hi!], MultiKey[null, hi!, hi!, hi!]]", (java.lang.CharSequence) "MultiKey[MultiKey[null, hi!, hi!, hi!], MultiKey[], null]");
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "MultiKey[MultiKey[null, hi!, hi!, hi!], MultiKey[], null]", (java.lang.CharSequence) "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ]");
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "MultiKey[]", "", "MultiKey[]", "MultiKey[null, hi!, hi!, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray5);
        java.lang.String[] strArray9 = new java.lang.String[] { "MultiKey[null, hi!, hi!, hi!]", "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]" };
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "MultiKey[]", "", "MultiKey[]", "MultiKey[null, hi!, hi!, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey16 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray15);
        java.lang.String[] strArray22 = new java.lang.String[] { "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", "hi!", "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]", "MultiKey[]", "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]> strArrayMultiKey23 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]>(strArray5, strArray9, strArray15, strArray22);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey24 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray5);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey25 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence[]) strArray5);
        int int26 = charSequenceMultiKey25.size();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 5 + "'", int26 == 5);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String> strMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String>("MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]", "MultiKey[null, hi!, hi!, hi!]", "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]", "MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "", (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]", (java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]", (java.lang.CharSequence) "");
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[hi!, MultiKey[null, hi!, hi!, hi!], MultiKey[], MultiKey[null, hi!, hi!, hi!], ]", (java.lang.CharSequence) "MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]]");
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[null, hi!, hi!, hi!], MultiKey[null, hi!, hi!, hi!]]", (java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[null, hi!, hi!, hi!], MultiKey[null, hi!, hi!, hi!]]", (java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]");
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        java.lang.CharSequence charSequence2 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", charSequence2, (java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]", (java.lang.CharSequence) "hi!");
        java.lang.String str6 = charSequenceMultiKey5.toString();
        java.lang.Object obj7 = charSequenceMultiKey5.readResolve();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey10 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "", (java.lang.CharSequence) "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]");
        java.lang.String str11 = charSequenceMultiKey10.toString();
        java.lang.String str12 = charSequenceMultiKey10.toString();
        java.lang.Object obj13 = charSequenceMultiKey10.readResolve();
        boolean boolean14 = charSequenceMultiKey5.equals(obj13);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]" + "'", str6, "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]");
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]" + "'", str11, "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]" + "'", str12, "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]");
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        java.lang.CharSequence charSequence0 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence0, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "MultiKey[]", (java.lang.CharSequence) "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]");
        java.lang.CharSequence charSequence6 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey10 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence6, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!");
        java.lang.String str11 = charSequenceMultiKey10.toString();
        int int12 = charSequenceMultiKey10.size();
        java.lang.Class<?> wildcardClass13 = charSequenceMultiKey10.getClass();
        java.lang.reflect.Type[] typeArray14 = new java.lang.reflect.Type[] { wildcardClass13 };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type> typeMultiKey16 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type>(typeArray14, true);
        boolean boolean17 = charSequenceMultiKey5.equals((java.lang.Object) true);
        java.lang.CharSequence[] charSequenceArray18 = new java.lang.CharSequence[] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey19 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray18);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey20 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray18);
        java.lang.String str21 = charSequenceMultiKey20.toString();
        boolean boolean22 = charSequenceMultiKey5.equals((java.lang.Object) charSequenceMultiKey20);
        int int23 = charSequenceMultiKey20.size();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str11, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(typeArray14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(charSequenceArray18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "MultiKey[]" + "'", str21, "MultiKey[]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        java.lang.CharSequence[] charSequenceArray0 = new java.lang.CharSequence[] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey1 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray0);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray0);
        java.lang.String str3 = charSequenceMultiKey2.toString();
        java.lang.String str4 = charSequenceMultiKey2.toString();
        boolean boolean6 = charSequenceMultiKey2.equals((java.lang.Object) "MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]");
        org.junit.Assert.assertNotNull(charSequenceArray0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "MultiKey[]" + "'", str3, "MultiKey[]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MultiKey[]" + "'", str4, "MultiKey[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        java.lang.CharSequence charSequence0 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence0, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "MultiKey[]", (java.lang.CharSequence) "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence7 = charSequenceMultiKey5.getKey((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]", (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]");
        java.lang.CharSequence[] charSequenceArray7 = new java.lang.CharSequence[] { "", "MultiKey[null, hi!, hi!, hi!]", "hi!", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey9 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray7, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey11 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray7, true);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey12 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray7);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey14 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray7, true);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey15 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray7);
        boolean boolean16 = charSequenceMultiKey2.equals((java.lang.Object) charSequenceMultiKey15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence18 = charSequenceMultiKey2.getKey((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceArray7);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String> strMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String>("MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", "", "", "MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]]", "");
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]");
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] { "", "MultiKey[null, hi!, hi!, hi!]", "hi!", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4, false);
        java.lang.String str7 = charSequenceMultiKey6.toString();
        boolean boolean9 = charSequenceMultiKey6.equals((java.lang.Object) 100);
        org.junit.Assert.assertNotNull(charSequenceArray4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]" + "'", str7, "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]", (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]");
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]", (java.lang.CharSequence) "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ]", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]", (java.lang.CharSequence) "MultiKey[hi!, MultiKey[null, hi!, hi!, hi!], MultiKey[], MultiKey[null, hi!, hi!, hi!], ]", (java.lang.CharSequence) "");
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "", (java.lang.CharSequence) "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]");
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] { "", "MultiKey[null, hi!, hi!, hi!]", "hi!", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey8 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4, true);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey9 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4);
        java.lang.Object obj10 = null;
        boolean boolean11 = charSequenceMultiKey9.equals(obj10);
        java.lang.String str12 = charSequenceMultiKey9.toString();
        java.lang.String str13 = charSequenceMultiKey9.toString();
        org.junit.Assert.assertNotNull(charSequenceArray4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]" + "'", str12, "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]" + "'", str13, "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]");
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "", (java.lang.CharSequence) "MultiKey[]", (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", (java.lang.CharSequence) "MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]]", (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]");
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        java.lang.CharSequence charSequence0 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence0, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!");
        java.lang.String str5 = charSequenceMultiKey4.toString();
        java.lang.String str6 = charSequenceMultiKey4.toString();
        java.lang.Object obj7 = null;
        boolean boolean8 = charSequenceMultiKey4.equals(obj7);
        java.lang.Object obj9 = charSequenceMultiKey4.readResolve();
        java.lang.CharSequence[] charSequenceArray10 = new java.lang.CharSequence[] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey11 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray10);
        java.lang.Object obj12 = charSequenceMultiKey11.readResolve();
        java.lang.Object obj13 = charSequenceMultiKey11.readResolve();
        java.lang.String str14 = charSequenceMultiKey11.toString();
        boolean boolean15 = charSequenceMultiKey4.equals((java.lang.Object) str14);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str5, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str6, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertNotNull(charSequenceArray10);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "MultiKey[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "MultiKey[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "MultiKey[]");
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "MultiKey[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "MultiKey[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "MultiKey[]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MultiKey[]" + "'", str14, "MultiKey[]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]", (java.lang.CharSequence) "");
        java.lang.CharSequence[] charSequenceArray7 = new java.lang.CharSequence[] { "", "MultiKey[null, hi!, hi!, hi!]", "hi!", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey9 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray7, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey11 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray7, true);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey12 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray7);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey14 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray7, true);
        java.lang.Class<?> wildcardClass15 = charSequenceMultiKey14.getClass();
        boolean boolean16 = charSequenceMultiKey2.equals((java.lang.Object) wildcardClass15);
        java.lang.String str17 = charSequenceMultiKey2.toString();
        org.junit.Assert.assertNotNull(charSequenceArray7);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], ]" + "'", str17, "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], ]");
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] { "", "MultiKey[null, hi!, hi!, hi!]", "hi!", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey7 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4);
        org.junit.Assert.assertNotNull(charSequenceArray4);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[]", (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", (java.lang.CharSequence) "", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]");
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]]", (java.lang.CharSequence) "MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]]");
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        java.lang.CharSequence charSequence1 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]", charSequence1, (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence5 = charSequenceMultiKey3.getKey(1);
        org.junit.Assert.assertNull(charSequence5);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]", (java.lang.Comparable<java.lang.String>) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]");
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ]", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]", (java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]", (java.lang.CharSequence) "", (java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]");
        java.lang.CharSequence[] charSequenceArray6 = null; // flaky: charSequenceMultiKey5.getKeys();
        java.lang.Object obj7 = charSequenceMultiKey5.readResolve();
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "MultiKey[MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ], MultiKey[null, hi!, hi!, hi!], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]], , MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "MultiKey[MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ], MultiKey[null, hi!, hi!, hi!], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]], , MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "MultiKey[MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ], MultiKey[null, hi!, hi!, hi!], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]], , MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]]");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        java.lang.CharSequence charSequence0 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence0, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence[] charSequenceArray5 = null; // flaky: charSequenceMultiKey4.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey6 = null; // flaky: new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray5);
        java.lang.Object obj7 = null; // flaky: charSequenceMultiKey6.readResolve();
        java.lang.String str8 = null; // flaky: charSequenceMultiKey6.toString();
        int int9 = 0; // flaky: charSequenceMultiKey6.size();
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray5);
// flaky:         org.junit.Assert.assertNotNull(obj7);
// flaky:         org.junit.Assert.assertEquals(obj7.toString(), "MultiKey[null, hi!, hi!, hi!]");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "MultiKey[null, hi!, hi!, hi!]");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "MultiKey[null, hi!, hi!, hi!]");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str8, "MultiKey[null, hi!, hi!, hi!]");
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.AnnotatedElement[]> annotatedElementArrayMultiKey1 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.AnnotatedElement[]>(annotatedElementArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The array of keys must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        java.lang.CharSequence charSequence0 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence0, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "MultiKey[]", (java.lang.CharSequence) "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]");
        java.lang.CharSequence charSequence6 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey10 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence6, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!");
        java.lang.String str11 = charSequenceMultiKey10.toString();
        int int12 = charSequenceMultiKey10.size();
        java.lang.Class<?> wildcardClass13 = charSequenceMultiKey10.getClass();
        java.lang.reflect.Type[] typeArray14 = new java.lang.reflect.Type[] { wildcardClass13 };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type> typeMultiKey16 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type>(typeArray14, true);
        boolean boolean17 = charSequenceMultiKey5.equals((java.lang.Object) true);
        java.lang.CharSequence[] charSequenceArray18 = new java.lang.CharSequence[] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey19 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray18);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey20 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray18);
        java.lang.String str21 = charSequenceMultiKey20.toString();
        boolean boolean22 = charSequenceMultiKey5.equals((java.lang.Object) charSequenceMultiKey20);
        java.lang.CharSequence[] charSequenceArray23 = null; // flaky: charSequenceMultiKey5.getKeys();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str11, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(typeArray14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(charSequenceArray18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "MultiKey[]" + "'", str21, "MultiKey[]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray23);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        java.lang.CharSequence[] charSequenceArray0 = new java.lang.CharSequence[] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey1 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray0);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray0, false);
        java.lang.Class<?> wildcardClass4 = charSequenceArray0.getClass();
        org.junit.Assert.assertNotNull(charSequenceArray0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence4 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence0, (java.lang.CharSequence) "MultiKey[hi!, MultiKey[null, hi!, hi!, hi!], MultiKey[], MultiKey[null, hi!, hi!, hi!], ]", (java.lang.CharSequence) "", (java.lang.CharSequence) "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]", charSequence4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence7 = charSequenceMultiKey5.getKey((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", (java.lang.CharSequence) "MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]]", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]");
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[]", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]", (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]");
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] { "", "MultiKey[null, hi!, hi!, hi!]", "hi!", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey8 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4, true);
        java.lang.String str9 = charSequenceMultiKey8.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence11 = charSequenceMultiKey8.getKey((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceArray4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]" + "'", str9, "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]");
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence4 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence0, (java.lang.CharSequence) "MultiKey[hi!, MultiKey[null, hi!, hi!, hi!], MultiKey[], MultiKey[null, hi!, hi!, hi!], ]", (java.lang.CharSequence) "", (java.lang.CharSequence) "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]", charSequence4);
        java.lang.Class<?> wildcardClass6 = charSequenceMultiKey5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]]", (java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[null, hi!, hi!, hi!], MultiKey[null, hi!, hi!, hi!]]", (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", (java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]");
        java.lang.String str5 = charSequenceMultiKey4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MultiKey[MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[null, hi!, hi!, hi!], MultiKey[null, hi!, hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]]" + "'", str5, "MultiKey[MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[null, hi!, hi!, hi!], MultiKey[null, hi!, hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]]");
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        java.lang.CharSequence charSequence2 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]", (java.lang.CharSequence) "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]", charSequence2, (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", (java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]");
        java.lang.CharSequence charSequence7 = charSequenceMultiKey5.getKey((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence9 = charSequenceMultiKey5.getKey((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + charSequence7 + "' != '" + "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]" + "'", charSequence7, "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]");
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        org.apache.commons.collections4.keyvalue.MultiKey[] multiKeyArray1 = new org.apache.commons.collections4.keyvalue.MultiKey[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[] charSequenceMultiKeyArray2 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]) multiKeyArray1;
        org.apache.commons.collections4.keyvalue.MultiKey[] multiKeyArray4 = new org.apache.commons.collections4.keyvalue.MultiKey[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[] charSequenceMultiKeyArray5 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]) multiKeyArray4;
        org.apache.commons.collections4.keyvalue.MultiKey[] multiKeyArray7 = new org.apache.commons.collections4.keyvalue.MultiKey[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[] charSequenceMultiKeyArray8 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]) multiKeyArray7;
        org.apache.commons.collections4.keyvalue.MultiKey[] multiKeyArray10 = new org.apache.commons.collections4.keyvalue.MultiKey[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[] charSequenceMultiKeyArray11 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]) multiKeyArray10;
        org.apache.commons.collections4.keyvalue.MultiKey[][] multiKeyArray13 = new org.apache.commons.collections4.keyvalue.MultiKey[4][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[][] charSequenceMultiKeyArray14 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[][]) multiKeyArray13;
        charSequenceMultiKeyArray14[0] = multiKeyArray1;
        charSequenceMultiKeyArray14[1] = charSequenceMultiKeyArray5;
        charSequenceMultiKeyArray14[2] = multiKeyArray7;
        charSequenceMultiKeyArray14[3] = multiKeyArray10;
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]> charSequenceMultiKeyArrayMultiKey23 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]>(charSequenceMultiKeyArray14);
        org.apache.commons.collections4.keyvalue.MultiKey<java.io.Serializable[]> serializableArrayMultiKey24 = new org.apache.commons.collections4.keyvalue.MultiKey<java.io.Serializable[]>((java.io.Serializable[][]) charSequenceMultiKeyArray14);
        org.junit.Assert.assertNotNull(multiKeyArray1);
        org.junit.Assert.assertNotNull(charSequenceMultiKeyArray2);
        org.junit.Assert.assertNotNull(multiKeyArray4);
        org.junit.Assert.assertNotNull(charSequenceMultiKeyArray5);
        org.junit.Assert.assertNotNull(multiKeyArray7);
        org.junit.Assert.assertNotNull(charSequenceMultiKeyArray8);
        org.junit.Assert.assertNotNull(multiKeyArray10);
        org.junit.Assert.assertNotNull(charSequenceMultiKeyArray11);
        org.junit.Assert.assertNotNull(multiKeyArray13);
        org.junit.Assert.assertNotNull(charSequenceMultiKeyArray14);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
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
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey29 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray16);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str8, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str9, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray12);
        org.junit.Assert.assertNotNull(charSequenceArray15);
        org.junit.Assert.assertNotNull(charSequenceArray16);
        org.junit.Assert.assertNotNull(charSequenceArray22);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[null, hi!, hi!, hi!], MultiKey[null, hi!, hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]]", (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", (java.lang.CharSequence) "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", (java.lang.CharSequence) "MultiKey[MultiKey[null, hi!, hi!, hi!], MultiKey[], null]");
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence2 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence0, (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]", charSequence2, (java.lang.CharSequence) "MultiKey[]", (java.lang.CharSequence) "");
        java.lang.Object obj6 = charSequenceMultiKey5.readResolve();
        java.lang.Object obj7 = charSequenceMultiKey5.readResolve();
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], null, MultiKey[], ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], null, MultiKey[], ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], null, MultiKey[], ]");
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], null, MultiKey[], ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], null, MultiKey[], ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], null, MultiKey[], ]");
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
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
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]]" + "'", str26, "MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]]");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]]" + "'", str27, "MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]]");
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence2 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence0, (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]", charSequence2, (java.lang.CharSequence) "MultiKey[]", (java.lang.CharSequence) "");
        java.lang.Object obj6 = charSequenceMultiKey5.readResolve();
        java.lang.CharSequence[] charSequenceArray7 = null; // flaky: charSequenceMultiKey5.getKeys();
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], null, MultiKey[], ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], null, MultiKey[], ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], null, MultiKey[], ]");
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray7);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[]", (java.lang.CharSequence) "", (java.lang.CharSequence) "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]");
        java.lang.Class<?> wildcardClass4 = charSequenceMultiKey3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] { "", "MultiKey[null, hi!, hi!, hi!]", "hi!", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4, false);
        java.lang.String str7 = charSequenceMultiKey6.toString();
        java.lang.Class<?> wildcardClass8 = charSequenceMultiKey6.getClass();
        org.junit.Assert.assertNotNull(charSequenceArray4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]" + "'", str7, "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] { "", "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]", "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey7 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4);
        java.lang.Class<?> wildcardClass8 = charSequenceMultiKey7.getClass();
        org.junit.Assert.assertNotNull(charSequenceArray4);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] { "", "MultiKey[null, hi!, hi!, hi!]", "hi!", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey8 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4, true);
        java.lang.String str9 = charSequenceMultiKey8.toString();
        java.lang.Object obj10 = charSequenceMultiKey8.readResolve();
        org.junit.Assert.assertNotNull(charSequenceArray4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]" + "'", str9, "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]");
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]");
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        java.lang.CharSequence charSequence3 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]", (java.lang.CharSequence) "", charSequence3, (java.lang.CharSequence) "MultiKey[]");
        int int6 = charSequenceMultiKey5.size();
        java.lang.Object obj7 = charSequenceMultiKey5.readResolve();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "MultiKey[hi!, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , null, MultiKey[]]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "MultiKey[hi!, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , null, MultiKey[]]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "MultiKey[hi!, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , null, MultiKey[]]");
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        org.apache.commons.collections4.keyvalue.MultiKey[] multiKeyArray1 = new org.apache.commons.collections4.keyvalue.MultiKey[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[] charSequenceMultiKeyArray2 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]) multiKeyArray1;
        org.apache.commons.collections4.keyvalue.MultiKey[] multiKeyArray4 = new org.apache.commons.collections4.keyvalue.MultiKey[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[] charSequenceMultiKeyArray5 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]) multiKeyArray4;
        org.apache.commons.collections4.keyvalue.MultiKey[] multiKeyArray7 = new org.apache.commons.collections4.keyvalue.MultiKey[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[] charSequenceMultiKeyArray8 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]) multiKeyArray7;
        org.apache.commons.collections4.keyvalue.MultiKey[] multiKeyArray10 = new org.apache.commons.collections4.keyvalue.MultiKey[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[] charSequenceMultiKeyArray11 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]) multiKeyArray10;
        org.apache.commons.collections4.keyvalue.MultiKey[][] multiKeyArray13 = new org.apache.commons.collections4.keyvalue.MultiKey[4][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[][] charSequenceMultiKeyArray14 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[][]) multiKeyArray13;
        charSequenceMultiKeyArray14[0] = multiKeyArray1;
        charSequenceMultiKeyArray14[1] = multiKeyArray4;
        charSequenceMultiKeyArray14[2] = charSequenceMultiKeyArray8;
        charSequenceMultiKeyArray14[3] = multiKeyArray10;
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]> charSequenceMultiKeyArrayMultiKey24 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]>(charSequenceMultiKeyArray14, true);
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]> charSequenceMultiKeyArrayMultiKey25 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]>(charSequenceMultiKeyArray14);
        org.junit.Assert.assertNotNull(multiKeyArray1);
        org.junit.Assert.assertNotNull(charSequenceMultiKeyArray2);
        org.junit.Assert.assertNotNull(multiKeyArray4);
        org.junit.Assert.assertNotNull(charSequenceMultiKeyArray5);
        org.junit.Assert.assertNotNull(multiKeyArray7);
        org.junit.Assert.assertNotNull(charSequenceMultiKeyArray8);
        org.junit.Assert.assertNotNull(multiKeyArray10);
        org.junit.Assert.assertNotNull(charSequenceMultiKeyArray11);
        org.junit.Assert.assertNotNull(multiKeyArray13);
        org.junit.Assert.assertNotNull(charSequenceMultiKeyArray14);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        java.lang.CharSequence charSequence0 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence0, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!");
        java.lang.String str5 = charSequenceMultiKey4.toString();
        java.lang.String str6 = charSequenceMultiKey4.toString();
        java.lang.Object obj7 = null;
        boolean boolean8 = charSequenceMultiKey4.equals(obj7);
        java.lang.CharSequence[] charSequenceArray9 = null; // flaky: charSequenceMultiKey4.getKeys();
        java.lang.Object obj10 = charSequenceMultiKey4.readResolve();
        java.lang.Class<?> wildcardClass11 = obj10.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str5, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str6, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence4 = charSequenceMultiKey2.getKey((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        java.lang.CharSequence charSequence0 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence0, (java.lang.CharSequence) "MultiKey[]", (java.lang.CharSequence) "MultiKey[]");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence5 = charSequenceMultiKey3.getKey(3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]", (java.lang.CharSequence) "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]", (java.lang.CharSequence) "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]", (java.lang.CharSequence) "MultiKey[hi!, MultiKey[null, hi!, hi!, hi!], MultiKey[], MultiKey[null, hi!, hi!, hi!], ]");
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        java.lang.CharSequence charSequence0 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence0, (java.lang.CharSequence) "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]");
        int int3 = charSequenceMultiKey2.size();
        boolean boolean5 = charSequenceMultiKey2.equals((java.lang.Object) "MultiKey[MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[null, hi!, hi!, hi!], MultiKey[null, hi!, hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        org.apache.commons.collections4.keyvalue.MultiKey[][] multiKeyArray1 = new org.apache.commons.collections4.keyvalue.MultiKey[0][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[][] charSequenceMultiKeyArray2 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[][]) multiKeyArray1;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[][] charSequenceMultiKeyArray3 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[][]> charSequenceMultiKeyArrayMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[][]>(charSequenceMultiKeyArray2, charSequenceMultiKeyArray3);
        org.junit.Assert.assertNotNull(multiKeyArray1);
        org.junit.Assert.assertNotNull(charSequenceMultiKeyArray2);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[] charSequenceMultiKeyArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>> charSequenceMultiKeyMultiKey1 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>>(charSequenceMultiKeyArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The array of keys must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]");
        int int3 = charSequenceMultiKey2.size();
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey8 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4, false);
        java.lang.CharSequence[] charSequenceArray9 = charSequenceMultiKey8.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey10 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray9);
        boolean boolean11 = charSequenceMultiKey2.equals((java.lang.Object) charSequenceMultiKey10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertNotNull(charSequenceArray4);
        org.junit.Assert.assertNotNull(charSequenceArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "", (java.lang.CharSequence) "", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]");
        java.lang.Object obj4 = charSequenceMultiKey3.readResolve();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "MultiKey[, , MultiKey[null, hi!, hi!, hi!]]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "MultiKey[, , MultiKey[null, hi!, hi!, hi!]]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "MultiKey[, , MultiKey[null, hi!, hi!, hi!]]");
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        java.lang.CharSequence charSequence3 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ]", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", (java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]", charSequence3);
        java.lang.String str5 = charSequenceMultiKey4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MultiKey[MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ], MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]], null]" + "'", str5, "MultiKey[MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ], MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]], null]");
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[null, hi!, hi!, hi!], MultiKey[null, hi!, hi!, hi!]]", (java.lang.CharSequence) "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ]", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", (java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]");
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] { "", "MultiKey[null, hi!, hi!, hi!]", "hi!", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey8 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4, true);
        java.lang.CharSequence[] charSequenceArray9 = charSequenceMultiKey8.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey11 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray9, false);
        int int12 = charSequenceMultiKey11.size();
        org.junit.Assert.assertNotNull(charSequenceArray4);
        org.junit.Assert.assertNotNull(charSequenceArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence31 = charSequenceMultiKey29.getKey(10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[]", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", (java.lang.CharSequence) "MultiKey[MultiKey[null, hi!, hi!, hi!], MultiKey[], null]", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", (java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]");
        boolean boolean7 = charSequenceMultiKey5.equals((java.lang.Object) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", "MultiKey[MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[null, hi!, hi!, hi!], MultiKey[null, hi!, hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]]", "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", "", "MultiKey[null, hi!, hi!, hi!]" };
        java.lang.CharSequence[] charSequenceArray11 = new java.lang.CharSequence[] { "MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", "MultiKey[MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[null, hi!, hi!, hi!], MultiKey[null, hi!, hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]]", "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", "", "MultiKey[null, hi!, hi!, hi!]" };
        java.lang.CharSequence[] charSequenceArray17 = new java.lang.CharSequence[] { "MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", "MultiKey[MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[null, hi!, hi!, hi!], MultiKey[null, hi!, hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]]", "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", "", "MultiKey[null, hi!, hi!, hi!]" };
        java.lang.CharSequence[] charSequenceArray23 = new java.lang.CharSequence[] { "MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", "MultiKey[MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[null, hi!, hi!, hi!], MultiKey[null, hi!, hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]]", "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", "", "MultiKey[null, hi!, hi!, hi!]" };
        java.lang.CharSequence[] charSequenceArray29 = new java.lang.CharSequence[] { "MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", "MultiKey[MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[null, hi!, hi!, hi!], MultiKey[null, hi!, hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]]", "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", "", "MultiKey[null, hi!, hi!, hi!]" };
        java.lang.CharSequence[] charSequenceArray35 = new java.lang.CharSequence[] { "MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", "MultiKey[MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[null, hi!, hi!, hi!], MultiKey[null, hi!, hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]]", "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", "", "MultiKey[null, hi!, hi!, hi!]" };
        java.lang.CharSequence[][] charSequenceArray36 = new java.lang.CharSequence[][] { charSequenceArray5, charSequenceArray11, charSequenceArray17, charSequenceArray23, charSequenceArray29, charSequenceArray35 };
        java.lang.CharSequence[] charSequenceArray39 = new java.lang.CharSequence[] { "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[null, hi!, hi!, hi!], MultiKey[null, hi!, hi!, hi!]]", "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]" };
        java.lang.CharSequence[][] charSequenceArray40 = new java.lang.CharSequence[][] { charSequenceArray39 };
        java.lang.CharSequence[][] charSequenceArray41 = new java.lang.CharSequence[][] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[]> charSequenceArrayMultiKey42 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[]>(charSequenceArray41);
        java.lang.CharSequence[] charSequenceArray47 = new java.lang.CharSequence[] { "MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]]", "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]", "MultiKey[hi!, MultiKey[null, hi!, hi!, hi!], MultiKey[], MultiKey[null, hi!, hi!, hi!], ]", "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[null, hi!, hi!, hi!], MultiKey[null, hi!, hi!, hi!]]" };
        java.lang.CharSequence[] charSequenceArray52 = new java.lang.CharSequence[] { "MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]]", "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]", "MultiKey[hi!, MultiKey[null, hi!, hi!, hi!], MultiKey[], MultiKey[null, hi!, hi!, hi!], ]", "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[null, hi!, hi!, hi!], MultiKey[null, hi!, hi!, hi!]]" };
        java.lang.CharSequence[] charSequenceArray57 = new java.lang.CharSequence[] { "MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]]", "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]", "MultiKey[hi!, MultiKey[null, hi!, hi!, hi!], MultiKey[], MultiKey[null, hi!, hi!, hi!], ]", "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[null, hi!, hi!, hi!], MultiKey[null, hi!, hi!, hi!]]" };
        java.lang.CharSequence[] charSequenceArray62 = new java.lang.CharSequence[] { "MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]]", "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]", "MultiKey[hi!, MultiKey[null, hi!, hi!, hi!], MultiKey[], MultiKey[null, hi!, hi!, hi!], ]", "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[null, hi!, hi!, hi!], MultiKey[null, hi!, hi!, hi!]]" };
        java.lang.CharSequence[] charSequenceArray67 = new java.lang.CharSequence[] { "MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]]", "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]", "MultiKey[hi!, MultiKey[null, hi!, hi!, hi!], MultiKey[], MultiKey[null, hi!, hi!, hi!], ]", "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[null, hi!, hi!, hi!], MultiKey[null, hi!, hi!, hi!]]" };
        java.lang.CharSequence[] charSequenceArray72 = new java.lang.CharSequence[] { "MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]]", "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]", "MultiKey[hi!, MultiKey[null, hi!, hi!, hi!], MultiKey[], MultiKey[null, hi!, hi!, hi!], ]", "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[null, hi!, hi!, hi!], MultiKey[null, hi!, hi!, hi!]]" };
        java.lang.CharSequence[][] charSequenceArray73 = new java.lang.CharSequence[][] { charSequenceArray47, charSequenceArray52, charSequenceArray57, charSequenceArray62, charSequenceArray67, charSequenceArray72 };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[][]> charSequenceArrayMultiKey74 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[][]>(charSequenceArray36, charSequenceArray40, charSequenceArray41, charSequenceArray73);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[]> charSequenceArrayMultiKey75 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[]>(charSequenceArray40);
        org.junit.Assert.assertNotNull(charSequenceArray5);
        org.junit.Assert.assertNotNull(charSequenceArray11);
        org.junit.Assert.assertNotNull(charSequenceArray17);
        org.junit.Assert.assertNotNull(charSequenceArray23);
        org.junit.Assert.assertNotNull(charSequenceArray29);
        org.junit.Assert.assertNotNull(charSequenceArray35);
        org.junit.Assert.assertNotNull(charSequenceArray36);
        org.junit.Assert.assertNotNull(charSequenceArray39);
        org.junit.Assert.assertNotNull(charSequenceArray40);
        org.junit.Assert.assertNotNull(charSequenceArray41);
        org.junit.Assert.assertNotNull(charSequenceArray47);
        org.junit.Assert.assertNotNull(charSequenceArray52);
        org.junit.Assert.assertNotNull(charSequenceArray57);
        org.junit.Assert.assertNotNull(charSequenceArray62);
        org.junit.Assert.assertNotNull(charSequenceArray67);
        org.junit.Assert.assertNotNull(charSequenceArray72);
        org.junit.Assert.assertNotNull(charSequenceArray73);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        java.lang.reflect.Type[][] typeArray0 = new java.lang.reflect.Type[][] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[]> typeArrayMultiKey1 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[]>(typeArray0);
        org.junit.Assert.assertNotNull(typeArray0);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        java.lang.CharSequence charSequence2 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", charSequence2, (java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]", (java.lang.CharSequence) "hi!");
        java.lang.String str6 = charSequenceMultiKey5.toString();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey12 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", (java.lang.CharSequence) "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]", (java.lang.CharSequence) "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], ]");
        java.lang.CharSequence charSequence13 = null;
        java.lang.CharSequence charSequence15 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey18 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence13, (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]", charSequence15, (java.lang.CharSequence) "MultiKey[]", (java.lang.CharSequence) "");
        java.lang.Object obj19 = charSequenceMultiKey18.readResolve();
        org.apache.commons.collections4.keyvalue.MultiKey[] multiKeyArray21 = new org.apache.commons.collections4.keyvalue.MultiKey[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[] charSequenceMultiKeyArray22 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]) multiKeyArray21;
        org.apache.commons.collections4.keyvalue.MultiKey[] multiKeyArray24 = new org.apache.commons.collections4.keyvalue.MultiKey[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[] charSequenceMultiKeyArray25 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]) multiKeyArray24;
        org.apache.commons.collections4.keyvalue.MultiKey[] multiKeyArray27 = new org.apache.commons.collections4.keyvalue.MultiKey[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[] charSequenceMultiKeyArray28 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]) multiKeyArray27;
        org.apache.commons.collections4.keyvalue.MultiKey[] multiKeyArray30 = new org.apache.commons.collections4.keyvalue.MultiKey[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[] charSequenceMultiKeyArray31 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]) multiKeyArray30;
        org.apache.commons.collections4.keyvalue.MultiKey[][] multiKeyArray33 = new org.apache.commons.collections4.keyvalue.MultiKey[4][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[][] charSequenceMultiKeyArray34 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[][]) multiKeyArray33;
        charSequenceMultiKeyArray34[0] = multiKeyArray21;
        charSequenceMultiKeyArray34[1] = charSequenceMultiKeyArray25;
        charSequenceMultiKeyArray34[2] = multiKeyArray27;
        charSequenceMultiKeyArray34[3] = multiKeyArray30;
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]> charSequenceMultiKeyArrayMultiKey43 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]>(charSequenceMultiKeyArray34);
        java.lang.Class<?> wildcardClass44 = charSequenceMultiKeyArray34.getClass();
        java.io.Serializable serializable45 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.io.Serializable> serializableMultiKey46 = new org.apache.commons.collections4.keyvalue.MultiKey<java.io.Serializable>((java.io.Serializable) str6, (java.io.Serializable) "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]", (java.io.Serializable) charSequenceMultiKey18, (java.io.Serializable) charSequenceMultiKeyArray34, serializable45);
        java.lang.CharSequence charSequence47 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey51 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence47, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!");
        java.lang.String str52 = charSequenceMultiKey51.toString();
        java.lang.String str53 = charSequenceMultiKey51.toString();
        java.lang.Object obj54 = null;
        boolean boolean55 = charSequenceMultiKey51.equals(obj54);
        java.lang.Object obj56 = charSequenceMultiKey51.readResolve();
        boolean boolean57 = charSequenceMultiKey18.equals((java.lang.Object) charSequenceMultiKey51);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]" + "'", str6, "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]");
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], null, MultiKey[], ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], null, MultiKey[], ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], null, MultiKey[], ]");
        org.junit.Assert.assertNotNull(multiKeyArray21);
        org.junit.Assert.assertNotNull(charSequenceMultiKeyArray22);
        org.junit.Assert.assertNotNull(multiKeyArray24);
        org.junit.Assert.assertNotNull(charSequenceMultiKeyArray25);
        org.junit.Assert.assertNotNull(multiKeyArray27);
        org.junit.Assert.assertNotNull(charSequenceMultiKeyArray28);
        org.junit.Assert.assertNotNull(multiKeyArray30);
        org.junit.Assert.assertNotNull(charSequenceMultiKeyArray31);
        org.junit.Assert.assertNotNull(multiKeyArray33);
        org.junit.Assert.assertNotNull(charSequenceMultiKeyArray34);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str52, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str53, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(obj56);
        org.junit.Assert.assertEquals(obj56.toString(), "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj56), "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj56), "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]", (java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], ]");
        java.lang.String str4 = charSequenceMultiKey3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MultiKey[MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], ]]" + "'", str4, "MultiKey[MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], ]]");
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        java.lang.CharSequence[] charSequenceArray0 = new java.lang.CharSequence[] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey1 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray0);
        java.lang.Object obj2 = charSequenceMultiKey1.readResolve();
        java.lang.CharSequence[] charSequenceArray3 = charSequenceMultiKey1.getKeys();
        java.lang.Class<?> wildcardClass4 = charSequenceMultiKey1.getClass();
        org.junit.Assert.assertNotNull(charSequenceArray0);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "MultiKey[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "MultiKey[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "MultiKey[]");
        org.junit.Assert.assertNotNull(charSequenceArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] { "", "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]", "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4, false);
        java.lang.String str7 = charSequenceMultiKey6.toString();
        org.junit.Assert.assertNotNull(charSequenceArray4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]" + "'", str7, "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]");
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        java.lang.CharSequence[][][] charSequenceArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[][]> charSequenceArrayMultiKey1 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[][]>(charSequenceArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The array of keys must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String> strMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String>("hi!", "MultiKey[MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], ]]", "MultiKey[MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ], MultiKey[null, hi!, hi!, hi!], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]], , MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]]", "MultiKey[null, hi!, hi!, hi!]");
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        java.lang.CharSequence[] charSequenceArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The array of keys must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] { "", "MultiKey[null, hi!, hi!, hi!]", "hi!", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4, false);
        boolean boolean8 = charSequenceMultiKey6.equals((java.lang.Object) '4');
        java.lang.CharSequence charSequence9 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey13 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence9, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!");
        java.lang.String str14 = charSequenceMultiKey13.toString();
        java.lang.String str15 = charSequenceMultiKey13.toString();
        boolean boolean16 = charSequenceMultiKey6.equals((java.lang.Object) charSequenceMultiKey13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence18 = charSequenceMultiKey13.getKey((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceArray4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str14, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str15, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "", (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]", (java.lang.CharSequence) "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]");
        java.lang.Class<?> wildcardClass5 = charSequenceMultiKey4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        java.lang.CharSequence charSequence0 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence0, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence[] charSequenceArray5 = null; // flaky: charSequenceMultiKey4.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey7 = null; // flaky: new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray5, false);
        int int8 = 0; // flaky: charSequenceMultiKey7.size();
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray5);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        java.lang.CharSequence[] charSequenceArray0 = new java.lang.CharSequence[] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey1 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray0);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray0);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray0, false);
        java.lang.CharSequence[] charSequenceArray5 = charSequenceMultiKey4.getKeys();
        java.lang.String str6 = charSequenceMultiKey4.toString();
        java.lang.Object obj7 = charSequenceMultiKey4.readResolve();
        org.junit.Assert.assertNotNull(charSequenceArray0);
        org.junit.Assert.assertNotNull(charSequenceArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiKey[]" + "'", str6, "MultiKey[]");
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "MultiKey[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "MultiKey[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "MultiKey[]");
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]", (java.lang.CharSequence) "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], null, MultiKey[], ]", (java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], ]");
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        java.lang.CharSequence[] charSequenceArray0 = new java.lang.CharSequence[] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey1 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray0);
        java.lang.CharSequence[] charSequenceArray2 = charSequenceMultiKey1.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray2);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray2);
        org.junit.Assert.assertNotNull(charSequenceArray0);
        org.junit.Assert.assertNotNull(charSequenceArray2);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]", (java.lang.CharSequence) "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]", (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]");
        int int5 = charSequenceMultiKey4.size();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[null, hi!, hi!, hi!], MultiKey[null, hi!, hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]]", (java.lang.CharSequence) "MultiKey[MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ], MultiKey[null, hi!, hi!, hi!], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]], , MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]]", (java.lang.CharSequence) "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ]");
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        java.lang.CharSequence[] charSequenceArray3 = new java.lang.CharSequence[] { "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]", "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ]", "MultiKey[MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], ]]" };
        java.lang.CharSequence[] charSequenceArray7 = new java.lang.CharSequence[] { "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]", "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ]", "MultiKey[MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], ]]" };
        java.lang.CharSequence[][] charSequenceArray8 = new java.lang.CharSequence[][] { charSequenceArray3, charSequenceArray7 };
        java.lang.CharSequence[] charSequenceArray12 = new java.lang.CharSequence[] { "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]", "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ]", "MultiKey[MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], ]]" };
        java.lang.CharSequence[] charSequenceArray16 = new java.lang.CharSequence[] { "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]", "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ]", "MultiKey[MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], ]]" };
        java.lang.CharSequence[][] charSequenceArray17 = new java.lang.CharSequence[][] { charSequenceArray12, charSequenceArray16 };
        java.lang.CharSequence[] charSequenceArray21 = new java.lang.CharSequence[] { "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]", "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ]", "MultiKey[MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], ]]" };
        java.lang.CharSequence[] charSequenceArray25 = new java.lang.CharSequence[] { "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]", "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ]", "MultiKey[MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], ]]" };
        java.lang.CharSequence[][] charSequenceArray26 = new java.lang.CharSequence[][] { charSequenceArray21, charSequenceArray25 };
        java.lang.CharSequence[] charSequenceArray30 = new java.lang.CharSequence[] { "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]", "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ]", "MultiKey[MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], ]]" };
        java.lang.CharSequence[] charSequenceArray34 = new java.lang.CharSequence[] { "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]", "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ]", "MultiKey[MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], ]]" };
        java.lang.CharSequence[][] charSequenceArray35 = new java.lang.CharSequence[][] { charSequenceArray30, charSequenceArray34 };
        java.lang.CharSequence[] charSequenceArray39 = new java.lang.CharSequence[] { "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]", "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ]", "MultiKey[MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], ]]" };
        java.lang.CharSequence[] charSequenceArray43 = new java.lang.CharSequence[] { "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]", "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ]", "MultiKey[MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], ]]" };
        java.lang.CharSequence[][] charSequenceArray44 = new java.lang.CharSequence[][] { charSequenceArray39, charSequenceArray43 };
        java.lang.CharSequence[] charSequenceArray48 = new java.lang.CharSequence[] { "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]", "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ]", "MultiKey[MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], ]]" };
        java.lang.CharSequence[] charSequenceArray52 = new java.lang.CharSequence[] { "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]", "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ]", "MultiKey[MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], ]]" };
        java.lang.CharSequence[][] charSequenceArray53 = new java.lang.CharSequence[][] { charSequenceArray48, charSequenceArray52 };
        java.lang.CharSequence[][][] charSequenceArray54 = new java.lang.CharSequence[][][] { charSequenceArray8, charSequenceArray17, charSequenceArray26, charSequenceArray35, charSequenceArray44, charSequenceArray53 };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[][]> charSequenceArrayMultiKey56 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[][]>(charSequenceArray54, true);
        org.junit.Assert.assertNotNull(charSequenceArray3);
        org.junit.Assert.assertNotNull(charSequenceArray7);
        org.junit.Assert.assertNotNull(charSequenceArray8);
        org.junit.Assert.assertNotNull(charSequenceArray12);
        org.junit.Assert.assertNotNull(charSequenceArray16);
        org.junit.Assert.assertNotNull(charSequenceArray17);
        org.junit.Assert.assertNotNull(charSequenceArray21);
        org.junit.Assert.assertNotNull(charSequenceArray25);
        org.junit.Assert.assertNotNull(charSequenceArray26);
        org.junit.Assert.assertNotNull(charSequenceArray30);
        org.junit.Assert.assertNotNull(charSequenceArray34);
        org.junit.Assert.assertNotNull(charSequenceArray35);
        org.junit.Assert.assertNotNull(charSequenceArray39);
        org.junit.Assert.assertNotNull(charSequenceArray43);
        org.junit.Assert.assertNotNull(charSequenceArray44);
        org.junit.Assert.assertNotNull(charSequenceArray48);
        org.junit.Assert.assertNotNull(charSequenceArray52);
        org.junit.Assert.assertNotNull(charSequenceArray53);
        org.junit.Assert.assertNotNull(charSequenceArray54);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        java.lang.CharSequence charSequence1 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ], MultiKey[null, hi!, hi!, hi!], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]], , MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]]", charSequence1, (java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]", (java.lang.CharSequence) "MultiKey[]");
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        java.lang.CharSequence[] charSequenceArray0 = new java.lang.CharSequence[] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey1 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray0);
        java.lang.CharSequence[] charSequenceArray2 = charSequenceMultiKey1.getKeys();
        java.lang.Object obj3 = charSequenceMultiKey1.readResolve();
        java.lang.Class<?> wildcardClass4 = charSequenceMultiKey1.getClass();
        org.junit.Assert.assertNotNull(charSequenceArray0);
        org.junit.Assert.assertNotNull(charSequenceArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "MultiKey[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "MultiKey[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "MultiKey[]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] { "", "MultiKey[null, hi!, hi!, hi!]", "hi!", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4, false);
        java.lang.String str7 = charSequenceMultiKey6.toString();
        int int8 = charSequenceMultiKey6.size();
        java.lang.Object obj9 = charSequenceMultiKey6.readResolve();
        org.junit.Assert.assertNotNull(charSequenceArray4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]" + "'", str7, "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]");
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence2 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence0, (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]", charSequence2, (java.lang.CharSequence) "MultiKey[]", (java.lang.CharSequence) "");
        java.lang.Object obj6 = charSequenceMultiKey5.readResolve();
        java.lang.String str7 = charSequenceMultiKey5.toString();
        int int8 = charSequenceMultiKey5.size();
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], null, MultiKey[], ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], null, MultiKey[], ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], null, MultiKey[], ]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], null, MultiKey[], ]" + "'", str7, "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], null, MultiKey[], ]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "", (java.lang.CharSequence) "", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]");
        java.lang.CharSequence charSequence4 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey8 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence4, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!");
        java.lang.String str9 = charSequenceMultiKey8.toString();
        boolean boolean10 = charSequenceMultiKey3.equals((java.lang.Object) str9);
        int int11 = charSequenceMultiKey3.size();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str9, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        java.lang.CharSequence charSequence0 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence0, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence[] charSequenceArray5 = null; // flaky: charSequenceMultiKey4.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey6 = null; // flaky: new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray5);
        java.lang.Object obj7 = null; // flaky: charSequenceMultiKey6.readResolve();
        java.lang.CharSequence charSequence9 = null; // flaky: charSequenceMultiKey6.getKey(3);
        java.lang.Object obj10 = null; // flaky: charSequenceMultiKey6.readResolve();
        java.lang.String str11 = null; // flaky: charSequenceMultiKey6.toString();
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray5);
// flaky:         org.junit.Assert.assertNotNull(obj7);
// flaky:         org.junit.Assert.assertEquals(obj7.toString(), "MultiKey[null, hi!, hi!, hi!]");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "MultiKey[null, hi!, hi!, hi!]");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "MultiKey[null, hi!, hi!, hi!]");
// flaky:         org.junit.Assert.assertEquals("'" + charSequence9 + "' != '" + "hi!" + "'", charSequence9, "hi!");
// flaky:         org.junit.Assert.assertNotNull(obj10);
// flaky:         org.junit.Assert.assertEquals(obj10.toString(), "MultiKey[null, hi!, hi!, hi!]");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "MultiKey[null, hi!, hi!, hi!]");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "MultiKey[null, hi!, hi!, hi!]");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str11, "MultiKey[null, hi!, hi!, hi!]");
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] { "", "MultiKey[null, hi!, hi!, hi!]", "hi!", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey8 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4, true);
        java.lang.String str9 = charSequenceMultiKey8.toString();
        java.lang.String str10 = charSequenceMultiKey8.toString();
        org.junit.Assert.assertNotNull(charSequenceArray4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]" + "'", str9, "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]" + "'", str10, "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]");
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]", (java.lang.CharSequence) "MultiKey[]", (java.lang.CharSequence) "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]", (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]");
        java.lang.CharSequence[] charSequenceArray6 = null; // flaky: charSequenceMultiKey5.getKeys();
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray6);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        java.lang.CharSequence[] charSequenceArray0 = new java.lang.CharSequence[] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey1 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray0);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray0, false);
        java.lang.Object obj4 = charSequenceMultiKey3.readResolve();
        org.junit.Assert.assertNotNull(charSequenceArray0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "MultiKey[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "MultiKey[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "MultiKey[]");
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
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
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey24 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray13, true);
        java.lang.Object obj25 = charSequenceMultiKey24.readResolve();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str5, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str6, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray9);
        org.junit.Assert.assertNotNull(charSequenceArray12);
        org.junit.Assert.assertNotNull(charSequenceArray13);
        org.junit.Assert.assertNotNull(charSequenceArray19);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertEquals(obj25.toString(), "MultiKey[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj25), "MultiKey[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj25), "MultiKey[]");
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        java.lang.CharSequence charSequence2 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]", (java.lang.CharSequence) "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]", charSequence2, (java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]]");
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        java.lang.CharSequence charSequence1 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", charSequence1, (java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]");
        java.lang.String str4 = charSequenceMultiKey3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MultiKey[MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], null, MultiKey[null, hi!, hi!, hi!]]" + "'", str4, "MultiKey[MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], null, MultiKey[null, hi!, hi!, hi!]]");
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]", (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]");
        java.lang.Object obj4 = charSequenceMultiKey3.readResolve();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "MultiKey[hi!, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "MultiKey[hi!, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "MultiKey[hi!, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]");
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "MultiKey[]", "", "MultiKey[]", "MultiKey[null, hi!, hi!, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray5);
        java.lang.String[] strArray9 = new java.lang.String[] { "MultiKey[null, hi!, hi!, hi!]", "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]" };
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "MultiKey[]", "", "MultiKey[]", "MultiKey[null, hi!, hi!, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey16 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray15);
        java.lang.String[] strArray22 = new java.lang.String[] { "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", "hi!", "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]", "MultiKey[]", "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]> strArrayMultiKey23 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]>(strArray5, strArray9, strArray15, strArray22);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey24 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray5);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey25 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence[]) strArray5);
        java.lang.CharSequence charSequence27 = charSequenceMultiKey25.getKey(0);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertEquals("'" + charSequence27 + "' != '" + "hi!" + "'", charSequence27, "hi!");
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        java.lang.CharSequence[] charSequenceArray0 = new java.lang.CharSequence[] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey1 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray0);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray0, false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence5 = charSequenceMultiKey3.getKey((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceArray0);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        java.lang.CharSequence charSequence0 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence0, (java.lang.CharSequence) "MultiKey[MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ], MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]], null]", (java.lang.CharSequence) "MultiKey[hi!, MultiKey[null, hi!, hi!, hi!], MultiKey[], MultiKey[null, hi!, hi!, hi!], ]");
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        java.lang.CharSequence charSequence0 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence0, (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]", (java.lang.CharSequence) "", (java.lang.CharSequence) "MultiKey[]", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence8 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey11 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]", (java.lang.CharSequence) "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]", charSequence8, (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", (java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]");
        java.lang.CharSequence[] charSequenceArray16 = new java.lang.CharSequence[] { "", "MultiKey[null, hi!, hi!, hi!]", "hi!", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey18 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray16, false);
        java.lang.CharSequence[] charSequenceArray19 = charSequenceMultiKey18.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey21 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray19, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey22 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray19);
        boolean boolean23 = charSequenceMultiKey11.equals((java.lang.Object) charSequenceMultiKey22);
        boolean boolean24 = charSequenceMultiKey5.equals((java.lang.Object) boolean23);
        org.junit.Assert.assertNotNull(charSequenceArray16);
        org.junit.Assert.assertNotNull(charSequenceArray19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        java.lang.CharSequence charSequence2 = null;
        java.lang.CharSequence charSequence4 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]", (java.lang.CharSequence) "MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]]", charSequence2, (java.lang.CharSequence) "hi!", charSequence4);
        java.lang.String str6 = charSequenceMultiKey5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiKey[MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!], MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]], null, hi!, null]" + "'", str6, "MultiKey[MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!], MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]], null, hi!, null]");
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]", (java.lang.CharSequence) "");
        java.lang.CharSequence[] charSequenceArray7 = new java.lang.CharSequence[] { "", "MultiKey[null, hi!, hi!, hi!]", "hi!", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey9 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray7, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey11 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray7, true);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey12 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray7);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey14 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray7, true);
        java.lang.Class<?> wildcardClass15 = charSequenceMultiKey14.getClass();
        boolean boolean16 = charSequenceMultiKey2.equals((java.lang.Object) wildcardClass15);
        java.lang.CharSequence charSequence17 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey21 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence17, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence[] charSequenceArray22 = null; // flaky: charSequenceMultiKey21.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey23 = null; // flaky: new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray22);
        java.lang.Object obj24 = null; // flaky: charSequenceMultiKey23.readResolve();
        java.lang.Object obj25 = null;
        org.apache.commons.collections4.keyvalue.MultiKey[] multiKeyArray27 = new org.apache.commons.collections4.keyvalue.MultiKey[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[] charSequenceMultiKeyArray28 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]) multiKeyArray27;
        org.apache.commons.collections4.keyvalue.MultiKey[] multiKeyArray30 = new org.apache.commons.collections4.keyvalue.MultiKey[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[] charSequenceMultiKeyArray31 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]) multiKeyArray30;
        org.apache.commons.collections4.keyvalue.MultiKey[] multiKeyArray33 = new org.apache.commons.collections4.keyvalue.MultiKey[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[] charSequenceMultiKeyArray34 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]) multiKeyArray33;
        org.apache.commons.collections4.keyvalue.MultiKey[] multiKeyArray36 = new org.apache.commons.collections4.keyvalue.MultiKey[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[] charSequenceMultiKeyArray37 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]) multiKeyArray36;
        org.apache.commons.collections4.keyvalue.MultiKey[][] multiKeyArray39 = new org.apache.commons.collections4.keyvalue.MultiKey[4][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[][] charSequenceMultiKeyArray40 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[][]) multiKeyArray39;
        charSequenceMultiKeyArray40[0] = multiKeyArray27;
        charSequenceMultiKeyArray40[1] = multiKeyArray30;
        charSequenceMultiKeyArray40[2] = charSequenceMultiKeyArray34;
        charSequenceMultiKeyArray40[3] = multiKeyArray36;
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]> charSequenceMultiKeyArrayMultiKey50 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]>(charSequenceMultiKeyArray40, true);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Object> objMultiKey51 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Object>((java.lang.Object) boolean16, obj24, obj25, (java.lang.Object) charSequenceMultiKeyArray40);
        java.lang.Class<?> wildcardClass52 = objMultiKey51.getClass();
        org.junit.Assert.assertNotNull(charSequenceArray7);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray22);
// flaky:         org.junit.Assert.assertNotNull(obj24);
// flaky:         org.junit.Assert.assertEquals(obj24.toString(), "MultiKey[null, hi!, hi!, hi!]");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj24), "MultiKey[null, hi!, hi!, hi!]");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj24), "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertNotNull(multiKeyArray27);
        org.junit.Assert.assertNotNull(charSequenceMultiKeyArray28);
        org.junit.Assert.assertNotNull(multiKeyArray30);
        org.junit.Assert.assertNotNull(charSequenceMultiKeyArray31);
        org.junit.Assert.assertNotNull(multiKeyArray33);
        org.junit.Assert.assertNotNull(charSequenceMultiKeyArray34);
        org.junit.Assert.assertNotNull(multiKeyArray36);
        org.junit.Assert.assertNotNull(charSequenceMultiKeyArray37);
        org.junit.Assert.assertNotNull(multiKeyArray39);
        org.junit.Assert.assertNotNull(charSequenceMultiKeyArray40);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "", (java.lang.CharSequence) "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]");
        java.lang.CharSequence charSequence4 = charSequenceMultiKey2.getKey((int) (byte) 1);
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "MultiKey[]", "", "MultiKey[]", "MultiKey[null, hi!, hi!, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey11 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray10);
        java.lang.String[] strArray14 = new java.lang.String[] { "MultiKey[null, hi!, hi!, hi!]", "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]" };
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "MultiKey[]", "", "MultiKey[]", "MultiKey[null, hi!, hi!, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey21 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray20);
        java.lang.String[] strArray27 = new java.lang.String[] { "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", "hi!", "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]", "MultiKey[]", "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]> strArrayMultiKey28 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]>(strArray10, strArray14, strArray20, strArray27);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey29 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray10);
        boolean boolean30 = charSequenceMultiKey2.equals((java.lang.Object) strComparableMultiKey29);
        java.lang.Class<?> wildcardClass31 = charSequenceMultiKey2.getClass();
        org.junit.Assert.assertEquals("'" + charSequence4 + "' != '" + "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]" + "'", charSequence4, "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]", (java.lang.CharSequence) "MultiKey[]", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]", (java.lang.CharSequence) "");
        java.lang.CharSequence[] charSequenceArray6 = null; // flaky: charSequenceMultiKey5.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey7 = null; // flaky: new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray6);
        java.lang.CharSequence charSequence9 = null; // flaky: charSequenceMultiKey7.getKey(2);
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray6);
// flaky:         org.junit.Assert.assertEquals("'" + charSequence9 + "' != '" + "MultiKey[]" + "'", charSequence9, "MultiKey[]");
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ]", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]", (java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]", (java.lang.CharSequence) "", (java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]");
        java.lang.CharSequence charSequence8 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey11 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]", (java.lang.CharSequence) "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]", charSequence8, (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", (java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]");
        boolean boolean12 = charSequenceMultiKey5.equals((java.lang.Object) "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] { "", "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]", "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey8 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4, true);
        org.junit.Assert.assertNotNull(charSequenceArray4);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "", (java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]]");
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        java.lang.CharSequence[] charSequenceArray0 = new java.lang.CharSequence[] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey1 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray0);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray0);
        java.lang.String str3 = charSequenceMultiKey2.toString();
        java.lang.String str4 = charSequenceMultiKey2.toString();
        java.lang.Object obj5 = charSequenceMultiKey2.readResolve();
        java.lang.String str6 = charSequenceMultiKey2.toString();
        org.junit.Assert.assertNotNull(charSequenceArray0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "MultiKey[]" + "'", str3, "MultiKey[]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MultiKey[]" + "'", str4, "MultiKey[]");
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "MultiKey[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "MultiKey[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "MultiKey[]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiKey[]" + "'", str6, "MultiKey[]");
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        java.lang.CharSequence[] charSequenceArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The array of keys must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        java.lang.CharSequence charSequence3 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]", (java.lang.CharSequence) "", charSequence3, (java.lang.CharSequence) "MultiKey[]");
        int int6 = charSequenceMultiKey5.size();
        java.lang.CharSequence[] charSequenceArray7 = new java.lang.CharSequence[] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey8 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray7);
        java.lang.CharSequence[] charSequenceArray9 = charSequenceMultiKey8.getKeys();
        java.lang.Object obj10 = charSequenceMultiKey8.readResolve();
        boolean boolean11 = charSequenceMultiKey5.equals(obj10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertNotNull(charSequenceArray7);
        org.junit.Assert.assertNotNull(charSequenceArray9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "MultiKey[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "MultiKey[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "MultiKey[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        java.lang.CharSequence charSequence4 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]", (java.lang.CharSequence) "MultiKey[MultiKey[null, hi!, hi!, hi!], MultiKey[], null]", charSequence4);
        java.lang.CharSequence[] charSequenceArray6 = null; // flaky: charSequenceMultiKey5.getKeys();
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray6);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        java.lang.CharSequence charSequence2 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]", (java.lang.CharSequence) "MultiKey[]", charSequence2);
        int int4 = charSequenceMultiKey3.size();
        java.lang.String str5 = charSequenceMultiKey3.toString();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MultiKey[MultiKey[null, hi!, hi!, hi!], MultiKey[], null]" + "'", str5, "MultiKey[MultiKey[null, hi!, hi!, hi!], MultiKey[], null]");
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence2 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence0, (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]", charSequence2, (java.lang.CharSequence) "MultiKey[]", (java.lang.CharSequence) "");
        java.lang.CharSequence[] charSequenceArray6 = null; // flaky: charSequenceMultiKey5.getKeys();
        int int7 = charSequenceMultiKey5.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence9 = charSequenceMultiKey5.getKey((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", (java.lang.CharSequence) "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]", (java.lang.CharSequence) "MultiKey[MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!], MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]], null, hi!, null]", (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]");
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        java.lang.CharSequence charSequence0 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence0, (java.lang.CharSequence) "MultiKey[MultiKey[null, hi!, hi!, hi!], MultiKey[], null]", (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]");
        java.lang.String str4 = charSequenceMultiKey3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MultiKey[null, MultiKey[MultiKey[null, hi!, hi!, hi!], MultiKey[], null], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]]" + "'", str4, "MultiKey[null, MultiKey[MultiKey[null, hi!, hi!, hi!], MultiKey[], null], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]]");
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] { "", "MultiKey[null, hi!, hi!, hi!]", "hi!", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey8 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4, true);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey9 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4);
        java.lang.Object obj10 = null;
        boolean boolean11 = charSequenceMultiKey9.equals(obj10);
        java.lang.String str12 = charSequenceMultiKey9.toString();
        java.lang.CharSequence[] charSequenceArray13 = charSequenceMultiKey9.getKeys();
        org.junit.Assert.assertNotNull(charSequenceArray4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]" + "'", str12, "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]");
        org.junit.Assert.assertNotNull(charSequenceArray13);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] { "", "MultiKey[null, hi!, hi!, hi!]", "hi!", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey8 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4, true);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey9 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4);
        java.lang.Object obj10 = null;
        boolean boolean11 = charSequenceMultiKey9.equals(obj10);
        java.lang.CharSequence[] charSequenceArray12 = charSequenceMultiKey9.getKeys();
        org.junit.Assert.assertNotNull(charSequenceArray4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(charSequenceArray12);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
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
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey24 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray13, true);
        java.lang.Class<?> wildcardClass25 = charSequenceArray13.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str5, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str6, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray9);
        org.junit.Assert.assertNotNull(charSequenceArray12);
        org.junit.Assert.assertNotNull(charSequenceArray13);
        org.junit.Assert.assertNotNull(charSequenceArray19);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] { "", "MultiKey[null, hi!, hi!, hi!]", "hi!", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4, false);
        java.lang.CharSequence[] charSequenceArray7 = charSequenceMultiKey6.getKeys();
        java.lang.CharSequence charSequence9 = charSequenceMultiKey6.getKey((int) (byte) 1);
        java.lang.String str10 = charSequenceMultiKey6.toString();
        org.junit.Assert.assertNotNull(charSequenceArray4);
        org.junit.Assert.assertNotNull(charSequenceArray7);
        org.junit.Assert.assertEquals("'" + charSequence9 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", charSequence9, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]" + "'", str10, "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]");
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "", (java.lang.CharSequence) "MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]]", (java.lang.CharSequence) "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]");
        java.lang.Object obj4 = charSequenceMultiKey3.readResolve();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "MultiKey[, MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "MultiKey[, MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "MultiKey[, MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]");
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String> strMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String>("MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", "MultiKey[MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]]", "MultiKey[null, MultiKey[MultiKey[null, hi!, hi!, hi!], MultiKey[], null], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]]", "MultiKey[MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]]", "MultiKey[MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], null, MultiKey[null, hi!, hi!, hi!]]");
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[null, hi!, hi!, hi!], MultiKey[null, hi!, hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]]", (java.lang.CharSequence) "MultiKey[]", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "MultiKey[hi!, MultiKey[null, hi!, hi!, hi!], MultiKey[], MultiKey[null, hi!, hi!, hi!], ]");
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence2 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence0, (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]", charSequence2, (java.lang.CharSequence) "MultiKey[]", (java.lang.CharSequence) "");
        java.lang.Object obj6 = charSequenceMultiKey5.readResolve();
        int int7 = charSequenceMultiKey5.size();
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], null, MultiKey[], ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], null, MultiKey[], ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], null, MultiKey[], ]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        java.lang.CharSequence[] charSequenceArray0 = new java.lang.CharSequence[] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey1 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray0);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray0);
        java.lang.String str3 = charSequenceMultiKey2.toString();
        java.lang.String str4 = charSequenceMultiKey2.toString();
        int int5 = charSequenceMultiKey2.size();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey11 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]", (java.lang.CharSequence) "MultiKey[]", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]", (java.lang.CharSequence) "");
        boolean boolean12 = charSequenceMultiKey2.equals((java.lang.Object) "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertNotNull(charSequenceArray0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "MultiKey[]" + "'", str3, "MultiKey[]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MultiKey[]" + "'", str4, "MultiKey[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] { "", "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]", "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey7 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey9 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey10 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4);
        org.junit.Assert.assertNotNull(charSequenceArray4);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]", (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]");
        java.lang.Object obj3 = null;
        boolean boolean4 = charSequenceMultiKey2.equals(obj3);
        java.lang.String str5 = charSequenceMultiKey2.toString();
        java.lang.String str6 = charSequenceMultiKey2.toString();
        java.lang.String str7 = charSequenceMultiKey2.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]" + "'", str5, "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]" + "'", str6, "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]" + "'", str7, "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]");
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", (java.lang.CharSequence) "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]");
        java.lang.String str3 = charSequenceMultiKey2.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence5 = charSequenceMultiKey2.getKey((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "MultiKey[MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]]" + "'", str3, "MultiKey[MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]]");
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[]", (java.lang.CharSequence) "hi!");
        int int3 = charSequenceMultiKey2.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", (java.lang.CharSequence) "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ]", (java.lang.CharSequence) "MultiKey[MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ], MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]], null]", (java.lang.CharSequence) "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], null, MultiKey[], ]");
        int int5 = charSequenceMultiKey4.size();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        java.lang.CharSequence charSequence0 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence0, (java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass3 = charSequenceMultiKey2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        java.lang.CharSequence charSequence3 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[]", (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]", charSequence3);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]", (java.lang.CharSequence) "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]", (java.lang.CharSequence) "MultiKey[]");
        java.lang.CharSequence[] charSequenceArray6 = null; // flaky: charSequenceMultiKey5.getKeys();
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray6);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        java.lang.CharSequence[] charSequenceArray0 = new java.lang.CharSequence[] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey1 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray0);
        java.lang.CharSequence[] charSequenceArray2 = charSequenceMultiKey1.getKeys();
        java.lang.Object obj3 = charSequenceMultiKey1.readResolve();
        java.lang.Object obj4 = charSequenceMultiKey1.readResolve();
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
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String[] strArray1 = new java.lang.String[] {};
        java.lang.String[] strArray2 = new java.lang.String[] {};
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String[][] strArray4 = new java.lang.String[][] { strArray0, strArray1, strArray2, strArray3 };
        java.lang.String[] strArray7 = new java.lang.String[] { "MultiKey[MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], ]]", "MultiKey[MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!], MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]], null, hi!, null]" };
        java.lang.String[] strArray10 = new java.lang.String[] { "MultiKey[MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], ]]", "MultiKey[MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!], MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]], null, hi!, null]" };
        java.lang.String[][] strArray11 = new java.lang.String[][] { strArray7, strArray10 };
        java.lang.String[][] strArray12 = new java.lang.String[][] {};
        java.lang.String[][] strArray13 = new java.lang.String[][] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[][]> strArrayMultiKey14 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[][]>(strArray4, strArray11, strArray12, strArray13);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]> strArrayMultiKey15 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]>(strArray12);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "MultiKey[]", "", "MultiKey[]", "MultiKey[null, hi!, hi!, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray5);
        java.lang.String[] strArray9 = new java.lang.String[] { "MultiKey[null, hi!, hi!, hi!]", "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]" };
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "MultiKey[]", "", "MultiKey[]", "MultiKey[null, hi!, hi!, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey16 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray15);
        java.lang.String[] strArray22 = new java.lang.String[] { "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", "hi!", "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]", "MultiKey[]", "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]> strArrayMultiKey23 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]>(strArray5, strArray9, strArray15, strArray22);
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!", "MultiKey[]", "", "MultiKey[]", "MultiKey[null, hi!, hi!, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey30 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray29);
        java.lang.String[] strArray33 = new java.lang.String[] { "MultiKey[null, hi!, hi!, hi!]", "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]" };
        java.lang.String[] strArray39 = new java.lang.String[] { "hi!", "MultiKey[]", "", "MultiKey[]", "MultiKey[null, hi!, hi!, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey40 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray39);
        java.lang.String[] strArray46 = new java.lang.String[] { "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", "hi!", "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]", "MultiKey[]", "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]> strArrayMultiKey47 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]>(strArray29, strArray33, strArray39, strArray46);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey48 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray29);
        java.lang.String[] strArray54 = new java.lang.String[] { "hi!", "MultiKey[]", "", "MultiKey[]", "MultiKey[null, hi!, hi!, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey55 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray54);
        java.lang.String[] strArray58 = new java.lang.String[] { "MultiKey[null, hi!, hi!, hi!]", "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]" };
        java.lang.String[] strArray64 = new java.lang.String[] { "hi!", "MultiKey[]", "", "MultiKey[]", "MultiKey[null, hi!, hi!, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey65 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray64);
        java.lang.String[] strArray71 = new java.lang.String[] { "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", "hi!", "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]", "MultiKey[]", "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]> strArrayMultiKey72 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]>(strArray54, strArray58, strArray64, strArray71);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]> strArrayMultiKey73 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]>(strArray5, strArray29, strArray54);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey75 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence[]) strArray29, false);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertNotNull(strArray71);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]", (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]", (java.lang.CharSequence) "MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]]");
        java.lang.Object obj5 = charSequenceMultiKey4.readResolve();
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "MultiKey[MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], MultiKey[null, hi!, hi!, hi!], MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]]]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "MultiKey[MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], MultiKey[null, hi!, hi!, hi!], MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]]]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "MultiKey[MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], MultiKey[null, hi!, hi!, hi!], MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]]]");
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        java.lang.CharSequence charSequence2 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ], MultiKey[null, hi!, hi!, hi!], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]], , MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]]", (java.lang.CharSequence) "MultiKey[MultiKey[null, hi!, hi!, hi!], MultiKey[], null]", charSequence2, (java.lang.CharSequence) "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]");
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String> strMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String>("MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]", "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]", "MultiKey[MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ], MultiKey[null, hi!, hi!, hi!], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]], , MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]]", "MultiKey[MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[null, hi!, hi!, hi!], MultiKey[null, hi!, hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]]");
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] { "", "MultiKey[null, hi!, hi!, hi!]", "hi!", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4, false);
        java.lang.CharSequence[] charSequenceArray7 = charSequenceMultiKey6.getKeys();
        java.lang.Object obj8 = charSequenceMultiKey6.readResolve();
        java.lang.Class<?> wildcardClass9 = charSequenceMultiKey6.getClass();
        org.junit.Assert.assertNotNull(charSequenceArray4);
        org.junit.Assert.assertNotNull(charSequenceArray7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        java.lang.CharSequence charSequence0 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence0, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence[] charSequenceArray5 = null; // flaky: charSequenceMultiKey4.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey6 = null; // flaky: new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray5);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey8 = null; // flaky: new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray5, false);
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray5);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
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
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + charSequence31 + "' != '" + "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]" + "'", charSequence31, "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]");
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[]", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", (java.lang.CharSequence) "MultiKey[MultiKey[null, hi!, hi!, hi!], MultiKey[], null]", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", (java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]");
        java.lang.CharSequence[] charSequenceArray6 = null; // flaky: charSequenceMultiKey5.getKeys();
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray6);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray1 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray2 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray3 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray4 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][][] charSequenceArray5 = new java.lang.CharSequence[][][] { charSequenceArray0, charSequenceArray1, charSequenceArray2, charSequenceArray3, charSequenceArray4 };
        java.lang.CharSequence[][] charSequenceArray6 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray7 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray8 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray9 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray10 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray11 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][][] charSequenceArray12 = new java.lang.CharSequence[][][] { charSequenceArray6, charSequenceArray7, charSequenceArray8, charSequenceArray9, charSequenceArray10, charSequenceArray11 };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[][]> charSequenceArrayMultiKey14 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[][]>(charSequenceArray12, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[][]> charSequenceArrayMultiKey15 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[][]>(charSequenceArray12);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[][][]> charSequenceArrayMultiKey16 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[][][]>(charSequenceArray5, charSequenceArray12);
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "MultiKey[]", "", "MultiKey[]", "MultiKey[null, hi!, hi!, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey23 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray22);
        java.lang.CharSequence[][] charSequenceArray24 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray25 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray26 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray27 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray28 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][][] charSequenceArray29 = new java.lang.CharSequence[][][] { charSequenceArray24, charSequenceArray25, charSequenceArray26, charSequenceArray27, charSequenceArray28 };
        java.lang.CharSequence[][] charSequenceArray30 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray31 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray32 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray33 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray34 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray35 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][][] charSequenceArray36 = new java.lang.CharSequence[][][] { charSequenceArray30, charSequenceArray31, charSequenceArray32, charSequenceArray33, charSequenceArray34, charSequenceArray35 };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[][]> charSequenceArrayMultiKey38 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[][]>(charSequenceArray36, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[][]> charSequenceArrayMultiKey39 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[][]>(charSequenceArray36);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[][][]> charSequenceArrayMultiKey40 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[][][]>(charSequenceArray29, charSequenceArray36);
        java.lang.CharSequence[][] charSequenceArray41 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray42 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray43 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray44 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray45 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][][] charSequenceArray46 = new java.lang.CharSequence[][][] { charSequenceArray41, charSequenceArray42, charSequenceArray43, charSequenceArray44, charSequenceArray45 };
        java.lang.CharSequence[][] charSequenceArray47 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray48 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray49 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray50 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray51 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray52 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][][] charSequenceArray53 = new java.lang.CharSequence[][][] { charSequenceArray47, charSequenceArray48, charSequenceArray49, charSequenceArray50, charSequenceArray51, charSequenceArray52 };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[][]> charSequenceArrayMultiKey55 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[][]>(charSequenceArray53, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[][]> charSequenceArrayMultiKey56 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[][]>(charSequenceArray53);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[][][]> charSequenceArrayMultiKey57 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[][][]>(charSequenceArray46, charSequenceArray53);
        java.lang.CharSequence[] charSequenceArray64 = new java.lang.CharSequence[] { "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], ]", "MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]]", "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], ]", "MultiKey[null, hi!, hi!, hi!]", "MultiKey[MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[null, hi!, hi!, hi!], MultiKey[null, hi!, hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]]", "MultiKey[MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]]" };
        java.lang.CharSequence[] charSequenceArray71 = new java.lang.CharSequence[] { "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], ]", "MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]]", "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], ]", "MultiKey[null, hi!, hi!, hi!]", "MultiKey[MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[null, hi!, hi!, hi!], MultiKey[null, hi!, hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]]", "MultiKey[MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]]" };
        java.lang.CharSequence[][] charSequenceArray72 = new java.lang.CharSequence[][] { charSequenceArray64, charSequenceArray71 };
        java.lang.CharSequence[][][] charSequenceArray73 = new java.lang.CharSequence[][][] { charSequenceArray72 };
        java.lang.CharSequence[][][] charSequenceArray74 = null;
        java.lang.CharSequence[][] charSequenceArray75 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray76 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray77 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray78 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray79 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray80 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][][] charSequenceArray81 = new java.lang.CharSequence[][][] { charSequenceArray75, charSequenceArray76, charSequenceArray77, charSequenceArray78, charSequenceArray79, charSequenceArray80 };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[][]> charSequenceArrayMultiKey83 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[][]>(charSequenceArray81, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[][]> charSequenceArrayMultiKey84 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[][]>(charSequenceArray81);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[][][]> charSequenceArrayMultiKey85 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[][][]>(charSequenceArray29, charSequenceArray46, charSequenceArray73, charSequenceArray74, charSequenceArray81);
        org.apache.commons.collections4.keyvalue.MultiKey<java.io.Serializable[]> serializableArrayMultiKey86 = new org.apache.commons.collections4.keyvalue.MultiKey<java.io.Serializable[]>((java.io.Serializable[]) strArray22, (java.io.Serializable[]) charSequenceArray46);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[][][]> charSequenceArrayMultiKey87 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[][][]>(charSequenceArray12, charSequenceArray46);
        org.junit.Assert.assertNotNull(charSequenceArray0);
        org.junit.Assert.assertNotNull(charSequenceArray1);
        org.junit.Assert.assertNotNull(charSequenceArray2);
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
        org.junit.Assert.assertNotNull(strArray22);
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
        org.junit.Assert.assertNotNull(charSequenceArray36);
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
        org.junit.Assert.assertNotNull(charSequenceArray53);
        org.junit.Assert.assertNotNull(charSequenceArray64);
        org.junit.Assert.assertNotNull(charSequenceArray71);
        org.junit.Assert.assertNotNull(charSequenceArray72);
        org.junit.Assert.assertNotNull(charSequenceArray73);
        org.junit.Assert.assertNotNull(charSequenceArray75);
        org.junit.Assert.assertNotNull(charSequenceArray76);
        org.junit.Assert.assertNotNull(charSequenceArray77);
        org.junit.Assert.assertNotNull(charSequenceArray78);
        org.junit.Assert.assertNotNull(charSequenceArray79);
        org.junit.Assert.assertNotNull(charSequenceArray80);
        org.junit.Assert.assertNotNull(charSequenceArray81);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        java.lang.CharSequence charSequence3 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[MultiKey[null, hi!, hi!, hi!], MultiKey[], null]", (java.lang.CharSequence) "MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]]", (java.lang.CharSequence) "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], null, MultiKey[], ]", charSequence3, (java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], ]");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence7 = charSequenceMultiKey5.getKey(5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[]", (java.lang.CharSequence) "", (java.lang.CharSequence) "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]");
        java.lang.CharSequence[] charSequenceArray4 = null; // flaky: charSequenceMultiKey3.getKeys();
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray4);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], null, MultiKey[], ]", (java.lang.CharSequence) "MultiKey[MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ], MultiKey[null, hi!, hi!, hi!], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]], , MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]]", (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]");
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]]", (java.lang.CharSequence) "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ]", (java.lang.CharSequence) "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]");
        java.lang.Object obj4 = charSequenceMultiKey3.readResolve();
        java.lang.CharSequence[] charSequenceArray5 = null; // flaky: charSequenceMultiKey3.getKeys();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "MultiKey[MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]], MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "MultiKey[MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]], MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "MultiKey[MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]], MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]");
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray5);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        java.lang.CharSequence[] charSequenceArray0 = new java.lang.CharSequence[] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey1 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray0);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray0);
        int int3 = charSequenceMultiKey2.size();
        java.lang.String str4 = charSequenceMultiKey2.toString();
        java.lang.Class<?> wildcardClass5 = charSequenceMultiKey2.getClass();
        org.junit.Assert.assertNotNull(charSequenceArray0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MultiKey[]" + "'", str4, "MultiKey[]");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        java.lang.CharSequence charSequence0 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence0, (java.lang.CharSequence) "MultiKey[hi!, MultiKey[null, hi!, hi!, hi!], MultiKey[], MultiKey[null, hi!, hi!, hi!], ]", (java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]]", (java.lang.CharSequence) "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]", (java.lang.CharSequence) "");
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        java.lang.CharSequence charSequence0 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence0, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!");
        java.lang.String str5 = charSequenceMultiKey4.toString();
        java.lang.String str6 = charSequenceMultiKey4.toString();
        java.lang.Object obj7 = null;
        boolean boolean8 = charSequenceMultiKey4.equals(obj7);
        java.lang.Object obj9 = charSequenceMultiKey4.readResolve();
        java.lang.String str10 = charSequenceMultiKey4.toString();
        java.lang.Object obj11 = charSequenceMultiKey4.readResolve();
        java.lang.String str12 = charSequenceMultiKey4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str5, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str6, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str10, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str12, "MultiKey[null, hi!, hi!, hi!]");
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        java.lang.CharSequence[] charSequenceArray3 = new java.lang.CharSequence[] { "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], null, MultiKey[], ]", "MultiKey[MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ], MultiKey[null, hi!, hi!, hi!], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]], , MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]]", "MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]" };
        java.lang.CharSequence[] charSequenceArray7 = new java.lang.CharSequence[] { "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], null, MultiKey[], ]", "MultiKey[MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ], MultiKey[null, hi!, hi!, hi!], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]], , MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]]", "MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]" };
        java.lang.CharSequence[] charSequenceArray11 = new java.lang.CharSequence[] { "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], null, MultiKey[], ]", "MultiKey[MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ], MultiKey[null, hi!, hi!, hi!], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]], , MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]]", "MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]" };
        java.lang.CharSequence[] charSequenceArray15 = new java.lang.CharSequence[] { "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], null, MultiKey[], ]", "MultiKey[MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ], MultiKey[null, hi!, hi!, hi!], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]], , MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]]", "MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]" };
        java.lang.CharSequence[][] charSequenceArray16 = new java.lang.CharSequence[][] { charSequenceArray3, charSequenceArray7, charSequenceArray11, charSequenceArray15 };
        java.lang.CharSequence[] charSequenceArray20 = new java.lang.CharSequence[] { "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], null, MultiKey[], ]", "MultiKey[MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ], MultiKey[null, hi!, hi!, hi!], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]], , MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]]", "MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]" };
        java.lang.CharSequence[] charSequenceArray24 = new java.lang.CharSequence[] { "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], null, MultiKey[], ]", "MultiKey[MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ], MultiKey[null, hi!, hi!, hi!], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]], , MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]]", "MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]" };
        java.lang.CharSequence[] charSequenceArray28 = new java.lang.CharSequence[] { "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], null, MultiKey[], ]", "MultiKey[MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ], MultiKey[null, hi!, hi!, hi!], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]], , MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]]", "MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]" };
        java.lang.CharSequence[] charSequenceArray32 = new java.lang.CharSequence[] { "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], null, MultiKey[], ]", "MultiKey[MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ], MultiKey[null, hi!, hi!, hi!], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]], , MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]]", "MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]" };
        java.lang.CharSequence[][] charSequenceArray33 = new java.lang.CharSequence[][] { charSequenceArray20, charSequenceArray24, charSequenceArray28, charSequenceArray32 };
        java.lang.CharSequence[] charSequenceArray37 = new java.lang.CharSequence[] { "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], null, MultiKey[], ]", "MultiKey[MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ], MultiKey[null, hi!, hi!, hi!], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]], , MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]]", "MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]" };
        java.lang.CharSequence[] charSequenceArray41 = new java.lang.CharSequence[] { "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], null, MultiKey[], ]", "MultiKey[MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ], MultiKey[null, hi!, hi!, hi!], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]], , MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]]", "MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]" };
        java.lang.CharSequence[] charSequenceArray45 = new java.lang.CharSequence[] { "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], null, MultiKey[], ]", "MultiKey[MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ], MultiKey[null, hi!, hi!, hi!], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]], , MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]]", "MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]" };
        java.lang.CharSequence[] charSequenceArray49 = new java.lang.CharSequence[] { "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], null, MultiKey[], ]", "MultiKey[MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ], MultiKey[null, hi!, hi!, hi!], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]], , MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]]", "MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]" };
        java.lang.CharSequence[][] charSequenceArray50 = new java.lang.CharSequence[][] { charSequenceArray37, charSequenceArray41, charSequenceArray45, charSequenceArray49 };
        java.lang.CharSequence[] charSequenceArray54 = new java.lang.CharSequence[] { "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], null, MultiKey[], ]", "MultiKey[MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ], MultiKey[null, hi!, hi!, hi!], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]], , MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]]", "MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]" };
        java.lang.CharSequence[] charSequenceArray58 = new java.lang.CharSequence[] { "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], null, MultiKey[], ]", "MultiKey[MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ], MultiKey[null, hi!, hi!, hi!], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]], , MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]]", "MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]" };
        java.lang.CharSequence[] charSequenceArray62 = new java.lang.CharSequence[] { "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], null, MultiKey[], ]", "MultiKey[MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ], MultiKey[null, hi!, hi!, hi!], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]], , MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]]", "MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]" };
        java.lang.CharSequence[] charSequenceArray66 = new java.lang.CharSequence[] { "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], null, MultiKey[], ]", "MultiKey[MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ], MultiKey[null, hi!, hi!, hi!], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]], , MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]]", "MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]" };
        java.lang.CharSequence[][] charSequenceArray67 = new java.lang.CharSequence[][] { charSequenceArray54, charSequenceArray58, charSequenceArray62, charSequenceArray66 };
        java.lang.CharSequence[][][] charSequenceArray68 = new java.lang.CharSequence[][][] { charSequenceArray16, charSequenceArray33, charSequenceArray50, charSequenceArray67 };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[][]> charSequenceArrayMultiKey70 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[][]>(charSequenceArray68, true);
        org.junit.Assert.assertNotNull(charSequenceArray3);
        org.junit.Assert.assertNotNull(charSequenceArray7);
        org.junit.Assert.assertNotNull(charSequenceArray11);
        org.junit.Assert.assertNotNull(charSequenceArray15);
        org.junit.Assert.assertNotNull(charSequenceArray16);
        org.junit.Assert.assertNotNull(charSequenceArray20);
        org.junit.Assert.assertNotNull(charSequenceArray24);
        org.junit.Assert.assertNotNull(charSequenceArray28);
        org.junit.Assert.assertNotNull(charSequenceArray32);
        org.junit.Assert.assertNotNull(charSequenceArray33);
        org.junit.Assert.assertNotNull(charSequenceArray37);
        org.junit.Assert.assertNotNull(charSequenceArray41);
        org.junit.Assert.assertNotNull(charSequenceArray45);
        org.junit.Assert.assertNotNull(charSequenceArray49);
        org.junit.Assert.assertNotNull(charSequenceArray50);
        org.junit.Assert.assertNotNull(charSequenceArray54);
        org.junit.Assert.assertNotNull(charSequenceArray58);
        org.junit.Assert.assertNotNull(charSequenceArray62);
        org.junit.Assert.assertNotNull(charSequenceArray66);
        org.junit.Assert.assertNotNull(charSequenceArray67);
        org.junit.Assert.assertNotNull(charSequenceArray68);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] { "", "MultiKey[null, hi!, hi!, hi!]", "hi!", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4, false);
        boolean boolean8 = charSequenceMultiKey6.equals((java.lang.Object) '4');
        java.lang.CharSequence charSequence9 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey13 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence9, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!");
        java.lang.String str14 = charSequenceMultiKey13.toString();
        java.lang.String str15 = charSequenceMultiKey13.toString();
        boolean boolean16 = charSequenceMultiKey6.equals((java.lang.Object) charSequenceMultiKey13);
        int int17 = charSequenceMultiKey13.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence19 = charSequenceMultiKey13.getKey(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceArray4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str14, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str15, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        java.lang.CharSequence charSequence2 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", charSequence2, (java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]", (java.lang.CharSequence) "hi!");
        java.lang.String str6 = charSequenceMultiKey5.toString();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey12 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", (java.lang.CharSequence) "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]", (java.lang.CharSequence) "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], ]");
        java.lang.CharSequence charSequence13 = null;
        java.lang.CharSequence charSequence15 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey18 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence13, (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]", charSequence15, (java.lang.CharSequence) "MultiKey[]", (java.lang.CharSequence) "");
        java.lang.Object obj19 = charSequenceMultiKey18.readResolve();
        org.apache.commons.collections4.keyvalue.MultiKey[] multiKeyArray21 = new org.apache.commons.collections4.keyvalue.MultiKey[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[] charSequenceMultiKeyArray22 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]) multiKeyArray21;
        org.apache.commons.collections4.keyvalue.MultiKey[] multiKeyArray24 = new org.apache.commons.collections4.keyvalue.MultiKey[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[] charSequenceMultiKeyArray25 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]) multiKeyArray24;
        org.apache.commons.collections4.keyvalue.MultiKey[] multiKeyArray27 = new org.apache.commons.collections4.keyvalue.MultiKey[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[] charSequenceMultiKeyArray28 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]) multiKeyArray27;
        org.apache.commons.collections4.keyvalue.MultiKey[] multiKeyArray30 = new org.apache.commons.collections4.keyvalue.MultiKey[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[] charSequenceMultiKeyArray31 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]) multiKeyArray30;
        org.apache.commons.collections4.keyvalue.MultiKey[][] multiKeyArray33 = new org.apache.commons.collections4.keyvalue.MultiKey[4][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[][] charSequenceMultiKeyArray34 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[][]) multiKeyArray33;
        charSequenceMultiKeyArray34[0] = multiKeyArray21;
        charSequenceMultiKeyArray34[1] = charSequenceMultiKeyArray25;
        charSequenceMultiKeyArray34[2] = multiKeyArray27;
        charSequenceMultiKeyArray34[3] = multiKeyArray30;
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]> charSequenceMultiKeyArrayMultiKey43 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]>(charSequenceMultiKeyArray34);
        java.lang.Class<?> wildcardClass44 = charSequenceMultiKeyArray34.getClass();
        java.io.Serializable serializable45 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.io.Serializable> serializableMultiKey46 = new org.apache.commons.collections4.keyvalue.MultiKey<java.io.Serializable>((java.io.Serializable) str6, (java.io.Serializable) "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]", (java.io.Serializable) charSequenceMultiKey18, (java.io.Serializable) charSequenceMultiKeyArray34, serializable45);
        int int47 = charSequenceMultiKey18.size();
        int int48 = charSequenceMultiKey18.size();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]" + "'", str6, "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]");
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], null, MultiKey[], ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], null, MultiKey[], ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], null, MultiKey[], ]");
        org.junit.Assert.assertNotNull(multiKeyArray21);
        org.junit.Assert.assertNotNull(charSequenceMultiKeyArray22);
        org.junit.Assert.assertNotNull(multiKeyArray24);
        org.junit.Assert.assertNotNull(charSequenceMultiKeyArray25);
        org.junit.Assert.assertNotNull(multiKeyArray27);
        org.junit.Assert.assertNotNull(charSequenceMultiKeyArray28);
        org.junit.Assert.assertNotNull(multiKeyArray30);
        org.junit.Assert.assertNotNull(charSequenceMultiKeyArray31);
        org.junit.Assert.assertNotNull(multiKeyArray33);
        org.junit.Assert.assertNotNull(charSequenceMultiKeyArray34);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 5 + "'", int47 == 5);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 5 + "'", int48 == 5);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        java.lang.CharSequence charSequence0 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence0, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence[] charSequenceArray5 = null; // flaky: charSequenceMultiKey4.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey6 = null; // flaky: new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray5);
        java.lang.Object obj7 = null; // flaky: charSequenceMultiKey6.readResolve();
        java.lang.CharSequence charSequence9 = null; // flaky: charSequenceMultiKey6.getKey((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence11 = null; // flaky: charSequenceMultiKey6.getKey((int) '4');
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray5);
// flaky:         org.junit.Assert.assertNotNull(obj7);
// flaky:         org.junit.Assert.assertEquals(obj7.toString(), "MultiKey[null, hi!, hi!, hi!]");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "MultiKey[null, hi!, hi!, hi!]");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "MultiKey[null, hi!, hi!, hi!]");
// flaky:         org.junit.Assert.assertEquals("'" + charSequence9 + "' != '" + "hi!" + "'", charSequence9, "hi!");
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]", (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]");
        java.lang.Object obj3 = null;
        boolean boolean4 = charSequenceMultiKey2.equals(obj3);
        java.lang.CharSequence[] charSequenceArray5 = null; // flaky: charSequenceMultiKey2.getKeys();
        java.lang.Class<?> wildcardClass6 = null; // flaky: charSequenceArray5.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray5);
// flaky:         org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        java.lang.CharSequence charSequence2 = null;
        java.lang.CharSequence charSequence3 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]", (java.lang.CharSequence) "MultiKey[MultiKey[null, hi!, hi!, hi!], MultiKey[], null]", charSequence2, charSequence3);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        java.lang.CharSequence charSequence1 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]]", charSequence1);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        java.lang.CharSequence charSequence0 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence0, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!");
        java.lang.String str5 = charSequenceMultiKey4.toString();
        java.lang.String str6 = charSequenceMultiKey4.toString();
        java.lang.Object obj7 = charSequenceMultiKey4.readResolve();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence9 = charSequenceMultiKey4.getKey((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str5, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str6, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "MultiKey[null, hi!, hi!, hi!]");
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        java.lang.CharSequence charSequence1 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], null, MultiKey[null, hi!, hi!, hi!]]", charSequence1);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]", (java.lang.CharSequence) "");
        int int5 = charSequenceMultiKey4.size();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], ]", (java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], null, MultiKey[null, hi!, hi!, hi!]]");
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], ]]", (java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[null, hi!, hi!, hi!], MultiKey[null, hi!, hi!, hi!]]");
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "", (java.lang.CharSequence) "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]");
        java.lang.CharSequence charSequence4 = charSequenceMultiKey2.getKey((int) (byte) 1);
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "MultiKey[]", "", "MultiKey[]", "MultiKey[null, hi!, hi!, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey11 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray10);
        java.lang.String[] strArray14 = new java.lang.String[] { "MultiKey[null, hi!, hi!, hi!]", "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]" };
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "MultiKey[]", "", "MultiKey[]", "MultiKey[null, hi!, hi!, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey21 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray20);
        java.lang.String[] strArray27 = new java.lang.String[] { "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", "hi!", "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]", "MultiKey[]", "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]> strArrayMultiKey28 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]>(strArray10, strArray14, strArray20, strArray27);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey29 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray10);
        boolean boolean30 = charSequenceMultiKey2.equals((java.lang.Object) strComparableMultiKey29);
        java.lang.Object obj31 = charSequenceMultiKey2.readResolve();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence33 = charSequenceMultiKey2.getKey(10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + charSequence4 + "' != '" + "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]" + "'", charSequence4, "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertEquals(obj31.toString(), "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj31), "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj31), "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]");
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence3 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence0, (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]", (java.lang.CharSequence) "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]", charSequence3, (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]");
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
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
        java.lang.Class<?> wildcardClass24 = charSequenceArray12.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str5, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str6, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray9);
        org.junit.Assert.assertNotNull(charSequenceArray12);
        org.junit.Assert.assertNotNull(charSequenceArray13);
        org.junit.Assert.assertNotNull(charSequenceArray19);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] { "", "MultiKey[null, hi!, hi!, hi!]", "hi!", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4, false);
        java.lang.CharSequence[] charSequenceArray7 = charSequenceMultiKey6.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey9 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray7, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey10 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray7);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey11 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray7);
        java.lang.String str12 = charSequenceMultiKey11.toString();
        org.junit.Assert.assertNotNull(charSequenceArray4);
        org.junit.Assert.assertNotNull(charSequenceArray7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]" + "'", str12, "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]");
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[null, hi!, hi!, hi!], MultiKey[null, hi!, hi!, hi!]]", (java.lang.CharSequence) "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ]", (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey9 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]", (java.lang.CharSequence) "MultiKey[]", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]", (java.lang.CharSequence) "");
        java.lang.CharSequence[] charSequenceArray10 = null; // flaky: charSequenceMultiKey9.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey11 = null; // flaky: new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray10);
        java.lang.CharSequence[] charSequenceArray16 = new java.lang.CharSequence[] { "", "MultiKey[null, hi!, hi!, hi!]", "hi!", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey18 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray16, false);
        java.lang.CharSequence[] charSequenceArray19 = charSequenceMultiKey18.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey21 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray19, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey22 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray19);
        java.lang.CharSequence[] charSequenceArray23 = new java.lang.CharSequence[] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey24 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray23);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey25 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray23);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey27 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray23, false);
        java.lang.CharSequence[] charSequenceArray28 = charSequenceMultiKey27.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>> charSequenceMultiKeyMultiKey29 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>>(charSequenceMultiKey3, charSequenceMultiKey11, charSequenceMultiKey22, charSequenceMultiKey27);
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray10);
        org.junit.Assert.assertNotNull(charSequenceArray16);
        org.junit.Assert.assertNotNull(charSequenceArray19);
        org.junit.Assert.assertNotNull(charSequenceArray23);
        org.junit.Assert.assertNotNull(charSequenceArray28);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "", (java.lang.CharSequence) "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]");
        java.lang.String str3 = charSequenceMultiKey2.toString();
        java.lang.String str4 = charSequenceMultiKey2.toString();
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "MultiKey[]", "", "MultiKey[]", "MultiKey[null, hi!, hi!, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey11 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray10);
        java.lang.String[] strArray14 = new java.lang.String[] { "MultiKey[null, hi!, hi!, hi!]", "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]" };
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "MultiKey[]", "", "MultiKey[]", "MultiKey[null, hi!, hi!, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey21 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray20);
        java.lang.String[] strArray27 = new java.lang.String[] { "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", "hi!", "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]", "MultiKey[]", "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]> strArrayMultiKey28 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]>(strArray10, strArray14, strArray20, strArray27);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey29 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray10);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey30 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence[]) strArray10);
        boolean boolean31 = charSequenceMultiKey2.equals((java.lang.Object) charSequenceMultiKey30);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]" + "'", str3, "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]" + "'", str4, "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], hi!, MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]], hi!]", (java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[null, hi!, hi!, hi!], MultiKey[null, hi!, hi!, hi!]]", (java.lang.CharSequence) "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], null, MultiKey[], ]");
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], null, MultiKey[null, hi!, hi!, hi!]]", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", (java.lang.CharSequence) "MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]]");
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] { "", "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]", "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey7 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4);
        java.lang.Object obj8 = charSequenceMultiKey7.readResolve();
        org.junit.Assert.assertNotNull(charSequenceArray4);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]");
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] { "", "MultiKey[null, hi!, hi!, hi!]", "hi!", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4, false);
        java.lang.CharSequence[] charSequenceArray7 = charSequenceMultiKey6.getKeys();
        java.lang.CharSequence[] charSequenceArray8 = charSequenceMultiKey6.getKeys();
        org.junit.Assert.assertNotNull(charSequenceArray4);
        org.junit.Assert.assertNotNull(charSequenceArray7);
        org.junit.Assert.assertNotNull(charSequenceArray8);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        java.lang.CharSequence[] charSequenceArray0 = new java.lang.CharSequence[] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey1 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray0);
        java.lang.CharSequence[] charSequenceArray2 = charSequenceMultiKey1.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray2);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey7 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]", (java.lang.CharSequence) "MultiKey[hi!, MultiKey[null, hi!, hi!, hi!], MultiKey[], MultiKey[null, hi!, hi!, hi!], ]", (java.lang.CharSequence) "hi!");
        boolean boolean8 = charSequenceMultiKey3.equals((java.lang.Object) charSequenceMultiKey7);
        org.junit.Assert.assertNotNull(charSequenceArray0);
        org.junit.Assert.assertNotNull(charSequenceArray2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]", (java.lang.CharSequence) "MultiKey[]", (java.lang.CharSequence) "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]", (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]");
        java.lang.CharSequence charSequence7 = charSequenceMultiKey5.getKey(4);
        java.lang.CharSequence[] charSequenceArray8 = null; // flaky: charSequenceMultiKey5.getKeys();
        java.lang.CharSequence charSequence11 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey14 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", charSequence11, (java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]", (java.lang.CharSequence) "hi!");
        java.lang.String str15 = charSequenceMultiKey14.toString();
        java.lang.Object obj16 = charSequenceMultiKey14.readResolve();
        java.lang.Object obj17 = charSequenceMultiKey14.readResolve();
        boolean boolean18 = charSequenceMultiKey5.equals((java.lang.Object) charSequenceMultiKey14);
        org.junit.Assert.assertEquals("'" + charSequence7 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", charSequence7, "MultiKey[null, hi!, hi!, hi!]");
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray8);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]" + "'", str15, "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]");
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]");
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        java.lang.CharSequence[] charSequenceArray0 = new java.lang.CharSequence[] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey1 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray0);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray0);
        java.lang.String str3 = charSequenceMultiKey2.toString();
        java.lang.String str4 = charSequenceMultiKey2.toString();
        java.lang.Object obj5 = charSequenceMultiKey2.readResolve();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey8 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]", (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]");
        boolean boolean9 = charSequenceMultiKey2.equals((java.lang.Object) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]");
        org.junit.Assert.assertNotNull(charSequenceArray0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "MultiKey[]" + "'", str3, "MultiKey[]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MultiKey[]" + "'", str4, "MultiKey[]");
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "MultiKey[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "MultiKey[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "MultiKey[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[]", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]");
        java.lang.Object obj4 = charSequenceMultiKey3.readResolve();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "MultiKey[MultiKey[], MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[null, hi!, hi!, hi!]]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "MultiKey[MultiKey[], MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[null, hi!, hi!, hi!]]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "MultiKey[MultiKey[], MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[null, hi!, hi!, hi!]]");
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], ]]", (java.lang.Comparable<java.lang.String>) "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[hi!, MultiKey[null, hi!, hi!, hi!], MultiKey[], MultiKey[null, hi!, hi!, hi!], ]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], ]]");
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
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
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], null, MultiKey[null, hi!, hi!, hi!]]", (java.lang.CharSequence) "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], null, MultiKey[], ]", (java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], ]", (java.lang.CharSequence) "MultiKey[null, MultiKey[MultiKey[null, hi!, hi!, hi!], MultiKey[], null], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]]");
        java.lang.Object obj5 = charSequenceMultiKey4.readResolve();
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "MultiKey[MultiKey[MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], null, MultiKey[null, hi!, hi!, hi!]], MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], null, MultiKey[], ], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], ], MultiKey[null, MultiKey[MultiKey[null, hi!, hi!, hi!], MultiKey[], null], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]]]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "MultiKey[MultiKey[MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], null, MultiKey[null, hi!, hi!, hi!]], MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], null, MultiKey[], ], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], ], MultiKey[null, MultiKey[MultiKey[null, hi!, hi!, hi!], MultiKey[], null], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]]]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "MultiKey[MultiKey[MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], null, MultiKey[null, hi!, hi!, hi!]], MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], null, MultiKey[], ], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], ], MultiKey[null, MultiKey[MultiKey[null, hi!, hi!, hi!], MultiKey[], null], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]]]");
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        java.lang.CharSequence charSequence0 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence0, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "MultiKey[]", (java.lang.CharSequence) "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]");
        java.lang.CharSequence charSequence6 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey10 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence6, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!");
        java.lang.String str11 = charSequenceMultiKey10.toString();
        int int12 = charSequenceMultiKey10.size();
        java.lang.Class<?> wildcardClass13 = charSequenceMultiKey10.getClass();
        java.lang.reflect.Type[] typeArray14 = new java.lang.reflect.Type[] { wildcardClass13 };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type> typeMultiKey16 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type>(typeArray14, true);
        boolean boolean17 = charSequenceMultiKey5.equals((java.lang.Object) true);
        java.lang.CharSequence[] charSequenceArray18 = new java.lang.CharSequence[] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey19 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray18);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey20 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray18);
        java.lang.String str21 = charSequenceMultiKey20.toString();
        boolean boolean22 = charSequenceMultiKey5.equals((java.lang.Object) charSequenceMultiKey20);
        java.lang.String str23 = charSequenceMultiKey5.toString();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str11, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(typeArray14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(charSequenceArray18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "MultiKey[]" + "'", str21, "MultiKey[]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]" + "'", str23, "MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]");
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "MultiKey[MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ], MultiKey[null, hi!, hi!, hi!], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]], , MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]]", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]");
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        java.lang.CharSequence[] charSequenceArray0 = new java.lang.CharSequence[] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey1 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray0);
        java.lang.Object obj2 = charSequenceMultiKey1.readResolve();
        java.lang.CharSequence[] charSequenceArray3 = charSequenceMultiKey1.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], ]", (java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], ]");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Object> objMultiKey7 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Object>((java.lang.Object) charSequenceMultiKey1, (java.lang.Object) charSequenceMultiKey6);
        org.junit.Assert.assertNotNull(charSequenceArray0);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "MultiKey[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "MultiKey[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "MultiKey[]");
        org.junit.Assert.assertNotNull(charSequenceArray3);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "MultiKey[MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ], MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]], null]");
        java.lang.CharSequence charSequence6 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey9 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", charSequence6, (java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]", (java.lang.CharSequence) "hi!");
        java.lang.String str10 = charSequenceMultiKey9.toString();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey16 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", (java.lang.CharSequence) "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]", (java.lang.CharSequence) "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], ]");
        java.lang.CharSequence charSequence17 = null;
        java.lang.CharSequence charSequence19 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey22 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence17, (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]", charSequence19, (java.lang.CharSequence) "MultiKey[]", (java.lang.CharSequence) "");
        java.lang.Object obj23 = charSequenceMultiKey22.readResolve();
        org.apache.commons.collections4.keyvalue.MultiKey[] multiKeyArray25 = new org.apache.commons.collections4.keyvalue.MultiKey[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[] charSequenceMultiKeyArray26 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]) multiKeyArray25;
        org.apache.commons.collections4.keyvalue.MultiKey[] multiKeyArray28 = new org.apache.commons.collections4.keyvalue.MultiKey[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[] charSequenceMultiKeyArray29 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]) multiKeyArray28;
        org.apache.commons.collections4.keyvalue.MultiKey[] multiKeyArray31 = new org.apache.commons.collections4.keyvalue.MultiKey[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[] charSequenceMultiKeyArray32 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]) multiKeyArray31;
        org.apache.commons.collections4.keyvalue.MultiKey[] multiKeyArray34 = new org.apache.commons.collections4.keyvalue.MultiKey[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[] charSequenceMultiKeyArray35 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]) multiKeyArray34;
        org.apache.commons.collections4.keyvalue.MultiKey[][] multiKeyArray37 = new org.apache.commons.collections4.keyvalue.MultiKey[4][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[][] charSequenceMultiKeyArray38 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[][]) multiKeyArray37;
        charSequenceMultiKeyArray38[0] = multiKeyArray25;
        charSequenceMultiKeyArray38[1] = charSequenceMultiKeyArray29;
        charSequenceMultiKeyArray38[2] = multiKeyArray31;
        charSequenceMultiKeyArray38[3] = multiKeyArray34;
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]> charSequenceMultiKeyArrayMultiKey47 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]>(charSequenceMultiKeyArray38);
        java.lang.Class<?> wildcardClass48 = charSequenceMultiKeyArray38.getClass();
        java.io.Serializable serializable49 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.io.Serializable> serializableMultiKey50 = new org.apache.commons.collections4.keyvalue.MultiKey<java.io.Serializable>((java.io.Serializable) str10, (java.io.Serializable) "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]", (java.io.Serializable) charSequenceMultiKey22, (java.io.Serializable) charSequenceMultiKeyArray38, serializable49);
        int int51 = charSequenceMultiKey22.size();
        java.lang.String str52 = charSequenceMultiKey22.toString();
        boolean boolean53 = charSequenceMultiKey3.equals((java.lang.Object) charSequenceMultiKey22);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]" + "'", str10, "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]");
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals(obj23.toString(), "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], null, MultiKey[], ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj23), "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], null, MultiKey[], ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj23), "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], null, MultiKey[], ]");
        org.junit.Assert.assertNotNull(multiKeyArray25);
        org.junit.Assert.assertNotNull(charSequenceMultiKeyArray26);
        org.junit.Assert.assertNotNull(multiKeyArray28);
        org.junit.Assert.assertNotNull(charSequenceMultiKeyArray29);
        org.junit.Assert.assertNotNull(multiKeyArray31);
        org.junit.Assert.assertNotNull(charSequenceMultiKeyArray32);
        org.junit.Assert.assertNotNull(multiKeyArray34);
        org.junit.Assert.assertNotNull(charSequenceMultiKeyArray35);
        org.junit.Assert.assertNotNull(multiKeyArray37);
        org.junit.Assert.assertNotNull(charSequenceMultiKeyArray38);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 5 + "'", int51 == 5);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], null, MultiKey[], ]" + "'", str52, "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], null, MultiKey[], ]");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "", (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]", (java.lang.CharSequence) "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]");
        java.lang.CharSequence[] charSequenceArray5 = null; // flaky: charSequenceMultiKey4.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey7 = null; // flaky: new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray5, false);
        int int8 = 0; // flaky: charSequenceMultiKey7.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence10 = null; // flaky: charSequenceMultiKey7.getKey((int) '4');
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray5);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", (java.lang.CharSequence) "MultiKey[MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], hi!, MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]], hi!]", (java.lang.CharSequence) "");
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], null, MultiKey[null, hi!, hi!, hi!]]", (java.lang.CharSequence) "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]", (java.lang.CharSequence) "MultiKey[hi!, MultiKey[null, hi!, hi!, hi!], MultiKey[], MultiKey[null, hi!, hi!, hi!], ]", (java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]]", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]");
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        java.lang.CharSequence charSequence2 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]", (java.lang.CharSequence) "MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]]", charSequence2);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]", (java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], ]");
        java.lang.CharSequence[] charSequenceArray4 = null; // flaky: charSequenceMultiKey3.getKeys();
        java.lang.CharSequence charSequence6 = charSequenceMultiKey3.getKey(0);
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray4);
        org.junit.Assert.assertEquals("'" + charSequence6 + "' != '" + "MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]" + "'", charSequence6, "MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]");
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        java.lang.CharSequence charSequence3 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ], MultiKey[null, hi!, hi!, hi!], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]], , MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]]", (java.lang.CharSequence) "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]", (java.lang.CharSequence) "MultiKey[null, MultiKey[MultiKey[null, hi!, hi!, hi!], MultiKey[], null], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]]", charSequence3);
        java.lang.Class<?> wildcardClass5 = charSequenceMultiKey4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        java.lang.CharSequence charSequence0 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence0, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!");
        java.lang.String str5 = charSequenceMultiKey4.toString();
        java.lang.String str6 = charSequenceMultiKey4.toString();
        java.lang.Object obj7 = null;
        boolean boolean8 = charSequenceMultiKey4.equals(obj7);
        java.lang.Object obj9 = charSequenceMultiKey4.readResolve();
        java.lang.String str10 = charSequenceMultiKey4.toString();
        java.lang.CharSequence[] charSequenceArray11 = null; // flaky: charSequenceMultiKey4.getKeys();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str5, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str6, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str10, "MultiKey[null, hi!, hi!, hi!]");
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray11);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
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
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], null, MultiKey[], ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], null, MultiKey[], ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], null, MultiKey[], ]");
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray12);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str14, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[null, MultiKey[MultiKey[null, hi!, hi!, hi!], MultiKey[], null], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]]", (java.lang.CharSequence) "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], null, MultiKey[], ]", (java.lang.CharSequence) "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]", (java.lang.CharSequence) "MultiKey[null, MultiKey[MultiKey[null, hi!, hi!, hi!], MultiKey[], null], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]]");
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        java.lang.CharSequence charSequence1 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]]", charSequence1, (java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", (java.lang.CharSequence) "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], null, MultiKey[], ]");
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ], MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]], null]", (java.lang.CharSequence) "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], null, MultiKey[], ]");
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], null, MultiKey[null, hi!, hi!, hi!]]", (java.lang.CharSequence) "MultiKey[MultiKey[null, hi!, hi!, hi!], MultiKey[], null]", (java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], ]");
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "MultiKey[]", "", "MultiKey[]", "MultiKey[null, hi!, hi!, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray5);
        java.lang.String[] strArray9 = new java.lang.String[] { "MultiKey[null, hi!, hi!, hi!]", "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]" };
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "MultiKey[]", "", "MultiKey[]", "MultiKey[null, hi!, hi!, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey16 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray15);
        java.lang.String[] strArray22 = new java.lang.String[] { "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", "hi!", "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]", "MultiKey[]", "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]> strArrayMultiKey23 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]>(strArray5, strArray9, strArray15, strArray22);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey24 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray5);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey26 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence[]) strArray5, false);
        java.lang.Class<?> wildcardClass27 = strArray5.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence4 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence0, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "MultiKey[MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!], MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]], null, hi!, null]", (java.lang.CharSequence) "", charSequence4);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] { "", "MultiKey[null, hi!, hi!, hi!]", "hi!", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey8 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4, true);
        java.lang.CharSequence charSequence10 = charSequenceMultiKey8.getKey((int) (short) 1);
        java.lang.Class<?> wildcardClass11 = charSequence10.getClass();
        org.junit.Assert.assertNotNull(charSequenceArray4);
        org.junit.Assert.assertEquals("'" + charSequence10 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", charSequence10, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        java.lang.CharSequence charSequence2 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]", (java.lang.CharSequence) "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ]", charSequence2);
        int int4 = charSequenceMultiKey3.size();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        java.lang.String[] strArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String> strMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String>(strArray0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The array of keys must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] { "", "MultiKey[null, hi!, hi!, hi!]", "hi!", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey8 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4, true);
        java.lang.CharSequence[] charSequenceArray9 = charSequenceMultiKey8.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey11 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray9, true);
        org.junit.Assert.assertNotNull(charSequenceArray4);
        org.junit.Assert.assertNotNull(charSequenceArray9);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        java.lang.CharSequence charSequence1 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", charSequence1, (java.lang.CharSequence) "MultiKey[MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[null, hi!, hi!, hi!], MultiKey[null, hi!, hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]]");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence5 = charSequenceMultiKey3.getKey((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        java.lang.CharSequence charSequence0 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence0, (java.lang.CharSequence) "MultiKey[MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ], MultiKey[null, hi!, hi!, hi!], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]], , MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]]", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "MultiKey[MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ], MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]], null]", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]");
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        java.lang.CharSequence charSequence3 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]", (java.lang.CharSequence) "", charSequence3, (java.lang.CharSequence) "MultiKey[]");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey9 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]");
        boolean boolean10 = charSequenceMultiKey5.equals((java.lang.Object) "MultiKey[null, hi!, hi!, hi!]");
        java.lang.CharSequence[] charSequenceArray11 = null; // flaky: charSequenceMultiKey5.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey12 = null; // flaky: new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray11);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray11);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        java.lang.reflect.Type[][] typeArray0 = new java.lang.reflect.Type[][] {};
        java.lang.reflect.Type[][] typeArray1 = null;
        java.lang.reflect.Type[][] typeArray2 = new java.lang.reflect.Type[][] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[][]> typeArrayMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[][]>(typeArray0, typeArray1, typeArray2);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[]> typeArrayMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[]>(typeArray1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The array of keys must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray0);
        org.junit.Assert.assertNotNull(typeArray2);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String> strMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String>("MultiKey[null, MultiKey[MultiKey[null, hi!, hi!, hi!], MultiKey[], null], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]]", "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]");
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        java.lang.String[] strArray3 = new java.lang.String[] { "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ]", "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]", "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String> strMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String>(strArray3, true);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]", (java.lang.CharSequence) "MultiKey[]", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]", (java.lang.CharSequence) "");
        java.lang.CharSequence[] charSequenceArray6 = null; // flaky: charSequenceMultiKey5.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey7 = null; // flaky: new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray6);
        java.lang.CharSequence charSequence8 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey12 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence8, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!");
        java.lang.String str13 = charSequenceMultiKey12.toString();
        java.lang.String str14 = charSequenceMultiKey12.toString();
        java.lang.Object obj15 = null;
        boolean boolean16 = charSequenceMultiKey12.equals(obj15);
        java.lang.CharSequence[] charSequenceArray17 = null; // flaky: charSequenceMultiKey12.getKeys();
        java.lang.CharSequence[] charSequenceArray20 = new java.lang.CharSequence[] { "MultiKey[null, hi!, hi!, hi!]", "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]" };
        java.lang.CharSequence[] charSequenceArray21 = new java.lang.CharSequence[] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey22 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray21);
        java.lang.CharSequence[] charSequenceArray27 = new java.lang.CharSequence[] { "", "MultiKey[null, hi!, hi!, hi!]", "hi!", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey29 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray27, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[]> charSequenceArrayMultiKey30 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[]>(charSequenceArray17, charSequenceArray20, charSequenceArray21, charSequenceArray27);
        boolean boolean31 = false; // flaky: charSequenceMultiKey7.equals((java.lang.Object) charSequenceArray21);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey33 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray21, false);
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str13, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str14, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray17);
        org.junit.Assert.assertNotNull(charSequenceArray20);
        org.junit.Assert.assertNotNull(charSequenceArray21);
        org.junit.Assert.assertNotNull(charSequenceArray27);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        java.lang.CharSequence charSequence2 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]]", (java.lang.CharSequence) "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], null, MultiKey[], ]", charSequence2);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]]", (java.lang.CharSequence) "", (java.lang.CharSequence) "MultiKey[MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ], MultiKey[null, hi!, hi!, hi!], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]], , MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]]");
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "MultiKey[]", "", "MultiKey[]", "MultiKey[null, hi!, hi!, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray5);
        java.lang.String[] strArray9 = new java.lang.String[] { "MultiKey[null, hi!, hi!, hi!]", "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]" };
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "MultiKey[]", "", "MultiKey[]", "MultiKey[null, hi!, hi!, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey16 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray15);
        java.lang.String[] strArray22 = new java.lang.String[] { "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", "hi!", "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]", "MultiKey[]", "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]> strArrayMultiKey23 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]>(strArray5, strArray9, strArray15, strArray22);
        java.lang.CharSequence charSequence26 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey30 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence26, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!");
        java.lang.String str31 = charSequenceMultiKey30.toString();
        int int32 = charSequenceMultiKey30.size();
        java.lang.Class<?> wildcardClass33 = charSequenceMultiKey30.getClass();
        java.io.Serializable[] serializableArray34 = new java.io.Serializable[] { (short) 0, (byte) 100, charSequenceMultiKey30 };
        org.apache.commons.collections4.keyvalue.MultiKey<java.io.Serializable> serializableMultiKey36 = new org.apache.commons.collections4.keyvalue.MultiKey<java.io.Serializable>(serializableArray34, true);
        java.io.Serializable[] serializableArray37 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.io.Serializable[]> serializableArrayMultiKey38 = new org.apache.commons.collections4.keyvalue.MultiKey<java.io.Serializable[]>((java.io.Serializable[]) strArray22, serializableArray34, serializableArray37);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str31, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 4 + "'", int32 == 4);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(serializableArray34);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!], MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]], null, hi!, null]", (java.lang.CharSequence) "MultiKey[MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!], MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]], null, hi!, null]", (java.lang.CharSequence) "MultiKey[MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ], MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]], null]");
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "", (java.lang.CharSequence) "MultiKey[]", (java.lang.CharSequence) "MultiKey[MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], hi!, MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]], hi!]", (java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], null, MultiKey[null, hi!, hi!, hi!]]");
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] { "", "MultiKey[null, hi!, hi!, hi!]", "hi!", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey8 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4, true);
        java.lang.String str9 = charSequenceMultiKey8.toString();
        int int10 = charSequenceMultiKey8.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence12 = charSequenceMultiKey8.getKey((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceArray4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]" + "'", str9, "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        java.lang.CharSequence charSequence2 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!], MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]], null, hi!, null]", (java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]", charSequence2, (java.lang.CharSequence) "MultiKey[null, MultiKey[MultiKey[null, hi!, hi!, hi!], MultiKey[], null], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]]", (java.lang.CharSequence) "MultiKey[MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], ]]");
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        java.lang.CharSequence charSequence2 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]", (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]", charSequence2);
        java.lang.CharSequence[] charSequenceArray4 = null; // flaky: charSequenceMultiKey3.getKeys();
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray4);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        java.lang.CharSequence charSequence2 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", charSequence2, (java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]", (java.lang.CharSequence) "hi!");
        java.lang.String str6 = charSequenceMultiKey5.toString();
        java.lang.Object obj7 = charSequenceMultiKey5.readResolve();
        java.lang.Object obj8 = charSequenceMultiKey5.readResolve();
        java.lang.CharSequence[] charSequenceArray9 = null; // flaky: charSequenceMultiKey5.getKeys();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]" + "'", str6, "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]");
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]");
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]");
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray9);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] { "", "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]", "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey7 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4);
        java.lang.String str8 = charSequenceMultiKey7.toString();
        boolean boolean10 = charSequenceMultiKey7.equals((java.lang.Object) 10L);
        java.lang.CharSequence charSequence12 = charSequenceMultiKey7.getKey(3);
        org.junit.Assert.assertNotNull(charSequenceArray4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]" + "'", str8, "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + charSequence12 + "' != '" + "hi!" + "'", charSequence12, "hi!");
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
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
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey26 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray12);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str5, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str6, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray9);
        org.junit.Assert.assertNotNull(charSequenceArray12);
        org.junit.Assert.assertNotNull(charSequenceArray13);
        org.junit.Assert.assertNotNull(charSequenceArray19);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        java.lang.CharSequence charSequence2 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]", (java.lang.CharSequence) "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]", charSequence2, (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", (java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]");
        java.lang.CharSequence charSequence7 = charSequenceMultiKey5.getKey((int) (short) 1);
        java.lang.Object obj8 = charSequenceMultiKey5.readResolve();
        org.junit.Assert.assertEquals("'" + charSequence7 + "' != '" + "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]" + "'", charSequence7, "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]");
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "MultiKey[MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!], MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!], null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "MultiKey[MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!], MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!], null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "MultiKey[MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!], MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!], null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]]");
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
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
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Object> objMultiKey24 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Object>((java.lang.Object[]) charSequenceArray13, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey26 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray13, true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence28 = charSequenceMultiKey26.getKey((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str5, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str6, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray9);
        org.junit.Assert.assertNotNull(charSequenceArray12);
        org.junit.Assert.assertNotNull(charSequenceArray13);
        org.junit.Assert.assertNotNull(charSequenceArray19);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[null, hi!, hi!, hi!], MultiKey[null, hi!, hi!, hi!]]", (java.lang.CharSequence) "MultiKey[hi!, MultiKey[null, hi!, hi!, hi!], MultiKey[], MultiKey[null, hi!, hi!, hi!], ]", (java.lang.CharSequence) "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]", (java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]]", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[][] charSequenceMultiKeyArray6 = null;
        org.apache.commons.collections4.keyvalue.MultiKey[] multiKeyArray8 = new org.apache.commons.collections4.keyvalue.MultiKey[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[] charSequenceMultiKeyArray9 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]) multiKeyArray8;
        org.apache.commons.collections4.keyvalue.MultiKey[] multiKeyArray11 = new org.apache.commons.collections4.keyvalue.MultiKey[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[] charSequenceMultiKeyArray12 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]) multiKeyArray11;
        org.apache.commons.collections4.keyvalue.MultiKey[] multiKeyArray14 = new org.apache.commons.collections4.keyvalue.MultiKey[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[] charSequenceMultiKeyArray15 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]) multiKeyArray14;
        org.apache.commons.collections4.keyvalue.MultiKey[] multiKeyArray17 = new org.apache.commons.collections4.keyvalue.MultiKey[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[] charSequenceMultiKeyArray18 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]) multiKeyArray17;
        org.apache.commons.collections4.keyvalue.MultiKey[][] multiKeyArray20 = new org.apache.commons.collections4.keyvalue.MultiKey[4][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[][] charSequenceMultiKeyArray21 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[][]) multiKeyArray20;
        charSequenceMultiKeyArray21[0] = multiKeyArray8;
        charSequenceMultiKeyArray21[1] = multiKeyArray11;
        charSequenceMultiKeyArray21[2] = charSequenceMultiKeyArray15;
        charSequenceMultiKeyArray21[3] = multiKeyArray17;
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]> charSequenceMultiKeyArrayMultiKey31 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]>(charSequenceMultiKeyArray21, true);
        org.apache.commons.collections4.keyvalue.MultiKey[] multiKeyArray33 = new org.apache.commons.collections4.keyvalue.MultiKey[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[] charSequenceMultiKeyArray34 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]) multiKeyArray33;
        org.apache.commons.collections4.keyvalue.MultiKey[] multiKeyArray36 = new org.apache.commons.collections4.keyvalue.MultiKey[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[] charSequenceMultiKeyArray37 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]) multiKeyArray36;
        org.apache.commons.collections4.keyvalue.MultiKey[] multiKeyArray39 = new org.apache.commons.collections4.keyvalue.MultiKey[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[] charSequenceMultiKeyArray40 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]) multiKeyArray39;
        org.apache.commons.collections4.keyvalue.MultiKey[] multiKeyArray42 = new org.apache.commons.collections4.keyvalue.MultiKey[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[] charSequenceMultiKeyArray43 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]) multiKeyArray42;
        org.apache.commons.collections4.keyvalue.MultiKey[][] multiKeyArray45 = new org.apache.commons.collections4.keyvalue.MultiKey[4][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[][] charSequenceMultiKeyArray46 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[][]) multiKeyArray45;
        charSequenceMultiKeyArray46[0] = multiKeyArray33;
        charSequenceMultiKeyArray46[1] = multiKeyArray36;
        charSequenceMultiKeyArray46[2] = charSequenceMultiKeyArray40;
        charSequenceMultiKeyArray46[3] = multiKeyArray42;
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]> charSequenceMultiKeyArrayMultiKey56 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]>(charSequenceMultiKeyArray46, true);
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[][]> charSequenceMultiKeyArrayMultiKey57 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[][]>(charSequenceMultiKeyArray6, charSequenceMultiKeyArray21, charSequenceMultiKeyArray46);
        java.lang.CharSequence[][] charSequenceArray58 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray59 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray60 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray61 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray62 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray63 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][][] charSequenceArray64 = new java.lang.CharSequence[][][] { charSequenceArray58, charSequenceArray59, charSequenceArray60, charSequenceArray61, charSequenceArray62, charSequenceArray63 };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[][]> charSequenceArrayMultiKey66 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[][]>(charSequenceArray64, false);
        java.lang.String[] strArray67 = new java.lang.String[] {};
        java.lang.String[] strArray68 = new java.lang.String[] {};
        java.lang.String[] strArray69 = new java.lang.String[] {};
        java.lang.String[] strArray70 = new java.lang.String[] {};
        java.lang.String[][] strArray71 = new java.lang.String[][] { strArray67, strArray68, strArray69, strArray70 };
        java.lang.String[] strArray74 = new java.lang.String[] { "MultiKey[MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], ]]", "MultiKey[MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!], MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]], null, hi!, null]" };
        java.lang.String[] strArray77 = new java.lang.String[] { "MultiKey[MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], ]]", "MultiKey[MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!], MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]], null, hi!, null]" };
        java.lang.String[][] strArray78 = new java.lang.String[][] { strArray74, strArray77 };
        java.lang.String[][] strArray79 = new java.lang.String[][] {};
        java.lang.String[][] strArray80 = new java.lang.String[][] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[][]> strArrayMultiKey81 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[][]>(strArray71, strArray78, strArray79, strArray80);
        org.apache.commons.collections4.keyvalue.MultiKey<java.io.Serializable[][]> serializableArrayMultiKey82 = new org.apache.commons.collections4.keyvalue.MultiKey<java.io.Serializable[][]>((java.io.Serializable[][]) charSequenceMultiKeyArray21, (java.io.Serializable[][]) charSequenceArray64, (java.io.Serializable[][]) strArray80);
        java.lang.Class<?> wildcardClass83 = charSequenceMultiKeyArray21.getClass();
        boolean boolean84 = charSequenceMultiKey5.equals((java.lang.Object) charSequenceMultiKeyArray21);
        org.junit.Assert.assertNotNull(multiKeyArray8);
        org.junit.Assert.assertNotNull(charSequenceMultiKeyArray9);
        org.junit.Assert.assertNotNull(multiKeyArray11);
        org.junit.Assert.assertNotNull(charSequenceMultiKeyArray12);
        org.junit.Assert.assertNotNull(multiKeyArray14);
        org.junit.Assert.assertNotNull(charSequenceMultiKeyArray15);
        org.junit.Assert.assertNotNull(multiKeyArray17);
        org.junit.Assert.assertNotNull(charSequenceMultiKeyArray18);
        org.junit.Assert.assertNotNull(multiKeyArray20);
        org.junit.Assert.assertNotNull(charSequenceMultiKeyArray21);
        org.junit.Assert.assertNotNull(multiKeyArray33);
        org.junit.Assert.assertNotNull(charSequenceMultiKeyArray34);
        org.junit.Assert.assertNotNull(multiKeyArray36);
        org.junit.Assert.assertNotNull(charSequenceMultiKeyArray37);
        org.junit.Assert.assertNotNull(multiKeyArray39);
        org.junit.Assert.assertNotNull(charSequenceMultiKeyArray40);
        org.junit.Assert.assertNotNull(multiKeyArray42);
        org.junit.Assert.assertNotNull(charSequenceMultiKeyArray43);
        org.junit.Assert.assertNotNull(multiKeyArray45);
        org.junit.Assert.assertNotNull(charSequenceMultiKeyArray46);
        org.junit.Assert.assertNotNull(charSequenceArray58);
        org.junit.Assert.assertNotNull(charSequenceArray59);
        org.junit.Assert.assertNotNull(charSequenceArray60);
        org.junit.Assert.assertNotNull(charSequenceArray61);
        org.junit.Assert.assertNotNull(charSequenceArray62);
        org.junit.Assert.assertNotNull(charSequenceArray63);
        org.junit.Assert.assertNotNull(charSequenceArray64);
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertNotNull(wildcardClass83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!], MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]], null, hi!, null]", (java.lang.CharSequence) "MultiKey[MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[null, hi!, hi!, hi!], MultiKey[null, hi!, hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]]", (java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]");
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]", (java.lang.CharSequence) "MultiKey[MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], ]]");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence4 = charSequenceMultiKey2.getKey(3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "MultiKey[MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], ]]", (java.lang.CharSequence) "MultiKey[MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ], MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]], null]", (java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], ]");
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], ]", (java.lang.CharSequence) "MultiKey[null, MultiKey[MultiKey[null, hi!, hi!, hi!], MultiKey[], null], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]]");
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ]", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]", (java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]", (java.lang.CharSequence) "", (java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]");
        java.lang.CharSequence[] charSequenceArray6 = null; // flaky: charSequenceMultiKey5.getKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence8 = charSequenceMultiKey5.getKey((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray6);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String[] strArray1 = new java.lang.String[] {};
        java.lang.String[] strArray2 = new java.lang.String[] {};
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String[][] strArray4 = new java.lang.String[][] { strArray0, strArray1, strArray2, strArray3 };
        java.lang.String[] strArray7 = new java.lang.String[] { "MultiKey[MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], ]]", "MultiKey[MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!], MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]], null, hi!, null]" };
        java.lang.String[] strArray10 = new java.lang.String[] { "MultiKey[MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], ]]", "MultiKey[MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!], MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]], null, hi!, null]" };
        java.lang.String[][] strArray11 = new java.lang.String[][] { strArray7, strArray10 };
        java.lang.String[][] strArray12 = new java.lang.String[][] {};
        java.lang.String[][] strArray13 = new java.lang.String[][] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[][]> strArrayMultiKey14 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[][]>(strArray4, strArray11, strArray12, strArray13);
        java.lang.String[] strArray20 = new java.lang.String[] { "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[null, hi!, hi!, hi!], MultiKey[null, hi!, hi!, hi!]]", "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ]", "hi!", "", "MultiKey[null, hi!, hi!, hi!]" };
        java.lang.String[] strArray26 = new java.lang.String[] { "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[null, hi!, hi!, hi!], MultiKey[null, hi!, hi!, hi!]]", "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ]", "hi!", "", "MultiKey[null, hi!, hi!, hi!]" };
        java.lang.String[] strArray32 = new java.lang.String[] { "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[null, hi!, hi!, hi!], MultiKey[null, hi!, hi!, hi!]]", "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ]", "hi!", "", "MultiKey[null, hi!, hi!, hi!]" };
        java.lang.String[] strArray38 = new java.lang.String[] { "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[null, hi!, hi!, hi!], MultiKey[null, hi!, hi!, hi!]]", "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ]", "hi!", "", "MultiKey[null, hi!, hi!, hi!]" };
        java.lang.String[] strArray44 = new java.lang.String[] { "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[null, hi!, hi!, hi!], MultiKey[null, hi!, hi!, hi!]]", "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ]", "hi!", "", "MultiKey[null, hi!, hi!, hi!]" };
        java.lang.String[] strArray50 = new java.lang.String[] { "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[null, hi!, hi!, hi!], MultiKey[null, hi!, hi!, hi!]]", "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ]", "hi!", "", "MultiKey[null, hi!, hi!, hi!]" };
        java.lang.String[][] strArray51 = new java.lang.String[][] { strArray20, strArray26, strArray32, strArray38, strArray44, strArray50 };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]> strArrayMultiKey53 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]>(strArray51, false);
        java.lang.String[][] strArray54 = null;
        java.lang.String[][] strArray55 = null;
        java.lang.String[] strArray56 = new java.lang.String[] {};
        java.lang.String[] strArray57 = new java.lang.String[] {};
        java.lang.String[] strArray58 = new java.lang.String[] {};
        java.lang.String[] strArray59 = new java.lang.String[] {};
        java.lang.String[][] strArray60 = new java.lang.String[][] { strArray56, strArray57, strArray58, strArray59 };
        java.lang.String[] strArray63 = new java.lang.String[] { "MultiKey[MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], ]]", "MultiKey[MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!], MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]], null, hi!, null]" };
        java.lang.String[] strArray66 = new java.lang.String[] { "MultiKey[MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], ]]", "MultiKey[MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!], MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]], null, hi!, null]" };
        java.lang.String[][] strArray67 = new java.lang.String[][] { strArray63, strArray66 };
        java.lang.String[][] strArray68 = new java.lang.String[][] {};
        java.lang.String[][] strArray69 = new java.lang.String[][] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[][]> strArrayMultiKey70 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[][]>(strArray60, strArray67, strArray68, strArray69);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[][]> strArrayMultiKey71 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[][]>(strArray12, strArray51, strArray54, strArray55, strArray67);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertNotNull(strArray69);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ], MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]], null]", (java.lang.CharSequence) "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], null, MultiKey[], ]", (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]", (java.lang.CharSequence) "MultiKey[MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], ]]", (java.lang.CharSequence) "MultiKey[]");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey9 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[hi!, MultiKey[null, hi!, hi!, hi!], MultiKey[], MultiKey[null, hi!, hi!, hi!], ]", (java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]", (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]");
        boolean boolean10 = charSequenceMultiKey5.equals((java.lang.Object) "MultiKey[hi!, MultiKey[null, hi!, hi!, hi!], MultiKey[], MultiKey[null, hi!, hi!, hi!], ]");
        java.lang.String str11 = charSequenceMultiKey5.toString();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MultiKey[MultiKey[MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ], MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]], null], MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], null, MultiKey[], ], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], MultiKey[MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], ]], MultiKey[]]" + "'", str11, "MultiKey[MultiKey[MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ], MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]], null], MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], null, MultiKey[], ], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], MultiKey[MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], ]], MultiKey[]]");
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "", (java.lang.CharSequence) "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]", (java.lang.CharSequence) "MultiKey[MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!], MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]], null, hi!, null]");
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        java.lang.CharSequence charSequence0 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence0, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!");
        java.lang.String str5 = charSequenceMultiKey4.toString();
        java.lang.String str6 = charSequenceMultiKey4.toString();
        java.lang.Object obj7 = charSequenceMultiKey4.readResolve();
        int int8 = charSequenceMultiKey4.size();
        java.lang.Object obj9 = charSequenceMultiKey4.readResolve();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str5, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str6, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "MultiKey[null, hi!, hi!, hi!]");
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        java.lang.CharSequence charSequence0 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence0, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence[] charSequenceArray5 = null; // flaky: charSequenceMultiKey4.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey6 = null; // flaky: new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray5);
        java.lang.Object obj7 = null; // flaky: charSequenceMultiKey6.readResolve();
        java.lang.String str8 = null; // flaky: charSequenceMultiKey6.toString();
        java.lang.String str9 = null; // flaky: charSequenceMultiKey6.toString();
        java.lang.String str10 = null; // flaky: charSequenceMultiKey6.toString();
        int int11 = 0; // flaky: charSequenceMultiKey6.size();
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray5);
// flaky:         org.junit.Assert.assertNotNull(obj7);
// flaky:         org.junit.Assert.assertEquals(obj7.toString(), "MultiKey[null, hi!, hi!, hi!]");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "MultiKey[null, hi!, hi!, hi!]");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "MultiKey[null, hi!, hi!, hi!]");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str8, "MultiKey[null, hi!, hi!, hi!]");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str9, "MultiKey[null, hi!, hi!, hi!]");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str10, "MultiKey[null, hi!, hi!, hi!]");
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]");
        int int3 = charSequenceMultiKey2.size();
        java.lang.String str4 = charSequenceMultiKey2.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MultiKey[hi!, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]" + "'", str4, "MultiKey[hi!, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]");
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]", (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]");
        java.lang.CharSequence[] charSequenceArray4 = null; // flaky: charSequenceMultiKey3.getKeys();
        java.lang.CharSequence charSequence6 = charSequenceMultiKey3.getKey(0);
        int int7 = charSequenceMultiKey3.size();
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray4);
        org.junit.Assert.assertEquals("'" + charSequence6 + "' != '" + "hi!" + "'", charSequence6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        java.lang.CharSequence charSequence3 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ]", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", (java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]", charSequence3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence6 = charSequenceMultiKey4.getKey((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]", (java.lang.CharSequence) "MultiKey[null, MultiKey[MultiKey[null, hi!, hi!, hi!], MultiKey[], null], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]]", (java.lang.CharSequence) "", (java.lang.CharSequence) "MultiKey[MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], ]]");
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray1 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray2 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray3 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray4 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray5 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][][] charSequenceArray6 = new java.lang.CharSequence[][][] { charSequenceArray0, charSequenceArray1, charSequenceArray2, charSequenceArray3, charSequenceArray4, charSequenceArray5 };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[][]> charSequenceArrayMultiKey8 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[][]>(charSequenceArray6, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[][]> charSequenceArrayMultiKey9 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[][]>(charSequenceArray6);
        org.apache.commons.collections4.keyvalue.MultiKey[] multiKeyArray11 = new org.apache.commons.collections4.keyvalue.MultiKey[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[] charSequenceMultiKeyArray12 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]) multiKeyArray11;
        org.apache.commons.collections4.keyvalue.MultiKey[] multiKeyArray14 = new org.apache.commons.collections4.keyvalue.MultiKey[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[] charSequenceMultiKeyArray15 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]) multiKeyArray14;
        org.apache.commons.collections4.keyvalue.MultiKey[] multiKeyArray17 = new org.apache.commons.collections4.keyvalue.MultiKey[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[] charSequenceMultiKeyArray18 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]) multiKeyArray17;
        org.apache.commons.collections4.keyvalue.MultiKey[] multiKeyArray20 = new org.apache.commons.collections4.keyvalue.MultiKey[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[] charSequenceMultiKeyArray21 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]) multiKeyArray20;
        org.apache.commons.collections4.keyvalue.MultiKey[][] multiKeyArray23 = new org.apache.commons.collections4.keyvalue.MultiKey[4][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[][] charSequenceMultiKeyArray24 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[][]) multiKeyArray23;
        charSequenceMultiKeyArray24[0] = multiKeyArray11;
        charSequenceMultiKeyArray24[1] = multiKeyArray14;
        charSequenceMultiKeyArray24[2] = charSequenceMultiKeyArray18;
        charSequenceMultiKeyArray24[3] = multiKeyArray20;
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]> charSequenceMultiKeyArrayMultiKey34 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]>(charSequenceMultiKeyArray24, true);
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]> charSequenceMultiKeyArrayMultiKey36 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]>(charSequenceMultiKeyArray24, false);
        java.lang.CharSequence[][] charSequenceArray37 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray38 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray39 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray40 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray41 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray42 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][][] charSequenceArray43 = new java.lang.CharSequence[][][] { charSequenceArray37, charSequenceArray38, charSequenceArray39, charSequenceArray40, charSequenceArray41, charSequenceArray42 };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[][]> charSequenceArrayMultiKey45 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[][]>(charSequenceArray43, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.io.Serializable[]> serializableArrayMultiKey46 = new org.apache.commons.collections4.keyvalue.MultiKey<java.io.Serializable[]>((java.io.Serializable[]) charSequenceArray6, (java.io.Serializable[]) charSequenceMultiKeyArray24, (java.io.Serializable[]) charSequenceArray43);
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]> charSequenceMultiKeyArrayMultiKey48 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]>(charSequenceMultiKeyArray24, false);
        org.junit.Assert.assertNotNull(charSequenceArray0);
        org.junit.Assert.assertNotNull(charSequenceArray1);
        org.junit.Assert.assertNotNull(charSequenceArray2);
        org.junit.Assert.assertNotNull(charSequenceArray3);
        org.junit.Assert.assertNotNull(charSequenceArray4);
        org.junit.Assert.assertNotNull(charSequenceArray5);
        org.junit.Assert.assertNotNull(charSequenceArray6);
        org.junit.Assert.assertNotNull(multiKeyArray11);
        org.junit.Assert.assertNotNull(charSequenceMultiKeyArray12);
        org.junit.Assert.assertNotNull(multiKeyArray14);
        org.junit.Assert.assertNotNull(charSequenceMultiKeyArray15);
        org.junit.Assert.assertNotNull(multiKeyArray17);
        org.junit.Assert.assertNotNull(charSequenceMultiKeyArray18);
        org.junit.Assert.assertNotNull(multiKeyArray20);
        org.junit.Assert.assertNotNull(charSequenceMultiKeyArray21);
        org.junit.Assert.assertNotNull(multiKeyArray23);
        org.junit.Assert.assertNotNull(charSequenceMultiKeyArray24);
        org.junit.Assert.assertNotNull(charSequenceArray37);
        org.junit.Assert.assertNotNull(charSequenceArray38);
        org.junit.Assert.assertNotNull(charSequenceArray39);
        org.junit.Assert.assertNotNull(charSequenceArray40);
        org.junit.Assert.assertNotNull(charSequenceArray41);
        org.junit.Assert.assertNotNull(charSequenceArray42);
        org.junit.Assert.assertNotNull(charSequenceArray43);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        java.lang.CharSequence[] charSequenceArray0 = new java.lang.CharSequence[] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey1 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray0);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray0);
        java.lang.String str3 = charSequenceMultiKey2.toString();
        java.lang.String str4 = charSequenceMultiKey2.toString();
        int int5 = charSequenceMultiKey2.size();
        java.lang.Object obj6 = charSequenceMultiKey2.readResolve();
        org.junit.Assert.assertNotNull(charSequenceArray0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "MultiKey[]" + "'", str3, "MultiKey[]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MultiKey[]" + "'", str4, "MultiKey[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "MultiKey[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "MultiKey[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "MultiKey[]");
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        java.lang.CharSequence charSequence2 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]", (java.lang.CharSequence) "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]", charSequence2, (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", (java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]");
        java.lang.CharSequence charSequence7 = charSequenceMultiKey5.getKey((int) (short) 1);
        java.lang.String str8 = charSequenceMultiKey5.toString();
        org.junit.Assert.assertEquals("'" + charSequence7 + "' != '" + "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]" + "'", charSequence7, "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MultiKey[MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!], MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!], null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]]" + "'", str8, "MultiKey[MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!], MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!], null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]]");
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[null, hi!, hi!, hi!], MultiKey[null, hi!, hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], ]]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!], MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]], null, hi!, null]");
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "MultiKey[]", "", "MultiKey[]", "MultiKey[null, hi!, hi!, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray5);
        java.lang.String[] strArray9 = new java.lang.String[] { "MultiKey[null, hi!, hi!, hi!]", "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]" };
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "MultiKey[]", "", "MultiKey[]", "MultiKey[null, hi!, hi!, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey16 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray15);
        java.lang.String[] strArray22 = new java.lang.String[] { "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", "hi!", "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]", "MultiKey[]", "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]> strArrayMultiKey23 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]>(strArray5, strArray9, strArray15, strArray22);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey24 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray9);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray22);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]]");
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]", (java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], ]");
        java.lang.CharSequence[] charSequenceArray4 = null; // flaky: charSequenceMultiKey3.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = null; // flaky: new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4);
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray4);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], hi!, MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]], hi!]", (java.lang.CharSequence) "MultiKey[MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], ]]");
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String[] strArray1 = new java.lang.String[] {};
        java.lang.String[] strArray2 = new java.lang.String[] {};
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String[][] strArray4 = new java.lang.String[][] { strArray0, strArray1, strArray2, strArray3 };
        java.lang.String[] strArray7 = new java.lang.String[] { "MultiKey[MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], ]]", "MultiKey[MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!], MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]], null, hi!, null]" };
        java.lang.String[] strArray10 = new java.lang.String[] { "MultiKey[MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], ]]", "MultiKey[MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!], MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]], null, hi!, null]" };
        java.lang.String[][] strArray11 = new java.lang.String[][] { strArray7, strArray10 };
        java.lang.String[][] strArray12 = new java.lang.String[][] {};
        java.lang.String[][] strArray13 = new java.lang.String[][] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[][]> strArrayMultiKey14 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[][]>(strArray4, strArray11, strArray12, strArray13);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[]> charSequenceArrayMultiKey15 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[]>((java.lang.CharSequence[][]) strArray13);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        java.lang.CharSequence charSequence3 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", (java.lang.CharSequence) "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ]", (java.lang.CharSequence) "MultiKey[hi!, MultiKey[null, hi!, hi!, hi!], MultiKey[], MultiKey[null, hi!, hi!, hi!], ]", charSequence3, (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]");
        java.lang.Class<?> wildcardClass6 = charSequenceMultiKey5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        java.lang.CharSequence[] charSequenceArray0 = new java.lang.CharSequence[] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey1 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray0);
        java.lang.CharSequence[] charSequenceArray2 = charSequenceMultiKey1.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray2);
        java.lang.Class<?> wildcardClass4 = charSequenceArray2.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey7 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "", (java.lang.CharSequence) "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]");
        java.lang.String str8 = charSequenceMultiKey7.toString();
        java.lang.String str9 = charSequenceMultiKey7.toString();
        java.lang.Object obj10 = charSequenceMultiKey7.readResolve();
        java.lang.Class<?> wildcardClass11 = charSequenceMultiKey7.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.AnnotatedElement> annotatedElementMultiKey12 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.AnnotatedElement>((java.lang.reflect.AnnotatedElement) wildcardClass4, (java.lang.reflect.AnnotatedElement) wildcardClass11);
        org.junit.Assert.assertNotNull(charSequenceArray0);
        org.junit.Assert.assertNotNull(charSequenceArray2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]" + "'", str8, "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]" + "'", str9, "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]");
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence[] charSequenceArray6 = new java.lang.CharSequence[] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey7 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray6);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey8 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray6);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey10 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray6, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey11 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray6);
        boolean boolean12 = charSequenceMultiKey5.equals((java.lang.Object) charSequenceArray6);
        java.lang.String str13 = charSequenceMultiKey5.toString();
        java.lang.String str14 = charSequenceMultiKey5.toString();
        org.junit.Assert.assertNotNull(charSequenceArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "MultiKey[MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], hi!, MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]], hi!]" + "'", str13, "MultiKey[MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], hi!, MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]], hi!]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MultiKey[MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], hi!, MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]], hi!]" + "'", str14, "MultiKey[MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], hi!, MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]], hi!]");
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        java.lang.CharSequence[] charSequenceArray0 = new java.lang.CharSequence[] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey1 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray0);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray0);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray0, false);
        int int5 = charSequenceMultiKey4.size();
        org.junit.Assert.assertNotNull(charSequenceArray0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[null, hi!, hi!, hi!], MultiKey[null, hi!, hi!, hi!]]", (java.lang.CharSequence) "MultiKey[hi!, MultiKey[null, hi!, hi!, hi!], MultiKey[], MultiKey[null, hi!, hi!, hi!], ]", (java.lang.CharSequence) "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]", (java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]]", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]");
        java.lang.Class<?> wildcardClass6 = charSequenceMultiKey5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
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
        java.lang.CharSequence charSequence86 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey90 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence86, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence[] charSequenceArray91 = null; // flaky: charSequenceMultiKey90.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey92 = null; // flaky: new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray91);
        java.lang.Object obj93 = null; // flaky: charSequenceMultiKey92.readResolve();
        java.lang.String str94 = null; // flaky: charSequenceMultiKey92.toString();
        java.lang.String str95 = null; // flaky: charSequenceMultiKey92.toString();
        java.lang.String str96 = null; // flaky: charSequenceMultiKey92.toString();
        boolean boolean97 = charSequenceMultiKey14.equals((java.lang.Object) str96);
        java.lang.CharSequence[] charSequenceArray98 = charSequenceMultiKey14.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey99 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray98);
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
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray91);
// flaky:         org.junit.Assert.assertNotNull(obj93);
// flaky:         org.junit.Assert.assertEquals(obj93.toString(), "MultiKey[null, hi!, hi!, hi!]");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj93), "MultiKey[null, hi!, hi!, hi!]");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj93), "MultiKey[null, hi!, hi!, hi!]");
// flaky:         org.junit.Assert.assertEquals("'" + str94 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str94, "MultiKey[null, hi!, hi!, hi!]");
// flaky:         org.junit.Assert.assertEquals("'" + str95 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str95, "MultiKey[null, hi!, hi!, hi!]");
// flaky:         org.junit.Assert.assertEquals("'" + str96 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str96, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
        org.junit.Assert.assertNotNull(charSequenceArray98);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
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
        java.lang.CharSequence[] charSequenceArray30 = new java.lang.CharSequence[] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey31 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray30);
        java.lang.String[] strArray37 = new java.lang.String[] { "hi!", "MultiKey[]", "", "MultiKey[]", "MultiKey[null, hi!, hi!, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey38 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray37);
        java.lang.String[] strArray41 = new java.lang.String[] { "MultiKey[null, hi!, hi!, hi!]", "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]" };
        java.lang.String[] strArray47 = new java.lang.String[] { "hi!", "MultiKey[]", "", "MultiKey[]", "MultiKey[null, hi!, hi!, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey48 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray47);
        java.lang.String[] strArray54 = new java.lang.String[] { "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", "hi!", "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]", "MultiKey[]", "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]> strArrayMultiKey55 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]>(strArray37, strArray41, strArray47, strArray54);
        boolean boolean56 = charSequenceMultiKey31.equals((java.lang.Object) strArray41);
        java.lang.String[] strArray57 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]> strArrayMultiKey58 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]>(strArray26, strArray41, strArray57);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey60 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray57, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The array of keys must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(charSequenceArray30);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]", (java.lang.CharSequence) "MultiKey[]", (java.lang.CharSequence) "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]", (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]");
        java.lang.CharSequence charSequence7 = charSequenceMultiKey5.getKey(4);
        java.lang.CharSequence[] charSequenceArray8 = null; // flaky: charSequenceMultiKey5.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey9 = null; // flaky: new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray8);
        int int10 = 0; // flaky: charSequenceMultiKey9.size();
        org.junit.Assert.assertEquals("'" + charSequence7 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", charSequence7, "MultiKey[null, hi!, hi!, hi!]");
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray8);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]", (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]");
        boolean boolean5 = charSequenceMultiKey3.equals((java.lang.Object) (short) 1);
        java.lang.CharSequence[] charSequenceArray10 = new java.lang.CharSequence[] { "", "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]", "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey12 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray10, false);
        boolean boolean13 = charSequenceMultiKey3.equals((java.lang.Object) false);
        java.lang.Object obj14 = charSequenceMultiKey3.readResolve();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(charSequenceArray10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "MultiKey[hi!, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "MultiKey[hi!, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "MultiKey[hi!, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]");
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        java.lang.CharSequence charSequence2 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", charSequence2, (java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]", (java.lang.CharSequence) "hi!");
        java.lang.String str6 = charSequenceMultiKey5.toString();
        java.lang.Object obj7 = charSequenceMultiKey5.readResolve();
        java.lang.Object obj8 = charSequenceMultiKey5.readResolve();
        java.lang.String str9 = charSequenceMultiKey5.toString();
        java.lang.String str10 = charSequenceMultiKey5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]" + "'", str6, "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]");
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]");
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]" + "'", str9, "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]" + "'", str10, "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]");
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "MultiKey[]", "", "MultiKey[]", "MultiKey[null, hi!, hi!, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray5);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey8 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence[]) strArray5, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey10 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence[]) strArray5, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey12 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence[]) strArray5, true);
        java.lang.CharSequence[] charSequenceArray13 = charSequenceMultiKey12.getKeys();
        int int14 = charSequenceMultiKey12.size();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(charSequenceArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "MultiKey[]", "", "MultiKey[]", "MultiKey[null, hi!, hi!, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray5);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey8 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence[]) strArray5, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey10 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence[]) strArray5, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey12 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence[]) strArray5, true);
        java.lang.CharSequence[] charSequenceArray13 = charSequenceMultiKey12.getKeys();
        java.lang.CharSequence[] charSequenceArray14 = charSequenceMultiKey12.getKeys();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(charSequenceArray13);
        org.junit.Assert.assertNotNull(charSequenceArray14);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[null, hi!, hi!, hi!], MultiKey[null, hi!, hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]]", (java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]]");
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[]> charSequenceArrayMultiKey1 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[]>(charSequenceArray0);
        org.apache.commons.collections4.keyvalue.MultiKey<java.io.Serializable> serializableMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.io.Serializable>((java.io.Serializable[]) charSequenceArray0);
        org.junit.Assert.assertNotNull(charSequenceArray0);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        java.lang.CharSequence charSequence2 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], null, MultiKey[], ]", (java.lang.CharSequence) "MultiKey[hi!, MultiKey[null, hi!, hi!, hi!], MultiKey[], MultiKey[null, hi!, hi!, hi!], ]", charSequence2, (java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]");
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
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
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Object> objMultiKey24 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Object>((java.lang.Object[]) charSequenceArray13, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey26 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray13, false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str5, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str6, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray9);
        org.junit.Assert.assertNotNull(charSequenceArray12);
        org.junit.Assert.assertNotNull(charSequenceArray13);
        org.junit.Assert.assertNotNull(charSequenceArray19);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], null, MultiKey[], ]", (java.lang.CharSequence) "MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]]", (java.lang.CharSequence) "MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]]", (java.lang.CharSequence) "MultiKey[MultiKey[MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ], MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]], null], MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], null, MultiKey[], ], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], MultiKey[MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], ]], MultiKey[]]");
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        java.lang.CharSequence charSequence0 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence0, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!");
        java.lang.String str5 = charSequenceMultiKey4.toString();
        java.lang.String str6 = charSequenceMultiKey4.toString();
        java.lang.Object obj7 = null;
        boolean boolean8 = charSequenceMultiKey4.equals(obj7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence10 = charSequenceMultiKey4.getKey((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str5, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str6, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        java.lang.CharSequence[] charSequenceArray0 = new java.lang.CharSequence[] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey1 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray0);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray0);
        java.lang.String str3 = charSequenceMultiKey2.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence5 = charSequenceMultiKey2.getKey((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceArray0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "MultiKey[]" + "'", str3, "MultiKey[]");
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], ]", (java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], ]");
        java.lang.Class<?> wildcardClass3 = charSequenceMultiKey2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], ]]", (java.lang.CharSequence) "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ]");
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", (java.lang.CharSequence) "MultiKey[MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], hi!, MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]], hi!]", (java.lang.CharSequence) "MultiKey[MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[null, hi!, hi!, hi!], MultiKey[null, hi!, hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]]", (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", (java.lang.CharSequence) "MultiKey[MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ], MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]], null]");
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        java.lang.CharSequence[] charSequenceArray0 = new java.lang.CharSequence[] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey1 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray0);
        java.lang.Object obj2 = charSequenceMultiKey1.readResolve();
        java.lang.CharSequence[] charSequenceArray3 = charSequenceMultiKey1.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray3, true);
        org.junit.Assert.assertNotNull(charSequenceArray0);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "MultiKey[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "MultiKey[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "MultiKey[]");
        org.junit.Assert.assertNotNull(charSequenceArray3);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        java.lang.CharSequence[] charSequenceArray0 = new java.lang.CharSequence[] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey1 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray0);
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "MultiKey[]", "", "MultiKey[]", "MultiKey[null, hi!, hi!, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey8 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray7);
        java.lang.String[] strArray11 = new java.lang.String[] { "MultiKey[null, hi!, hi!, hi!]", "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]" };
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "MultiKey[]", "", "MultiKey[]", "MultiKey[null, hi!, hi!, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey18 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray17);
        java.lang.String[] strArray24 = new java.lang.String[] { "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", "hi!", "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]", "MultiKey[]", "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]> strArrayMultiKey25 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]>(strArray7, strArray11, strArray17, strArray24);
        boolean boolean26 = charSequenceMultiKey1.equals((java.lang.Object) strArray11);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey28 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence[]) strArray11, true);
        org.junit.Assert.assertNotNull(charSequenceArray0);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], hi!, MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]], hi!]", (java.lang.CharSequence) "MultiKey[MultiKey[MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ], MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]], null], MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], null, MultiKey[], ], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], MultiKey[MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], ]], MultiKey[]]", (java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], null, MultiKey[null, hi!, hi!, hi!]]");
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], null, MultiKey[null, hi!, hi!, hi!]]", (java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]", (java.lang.CharSequence) "MultiKey[null, MultiKey[MultiKey[null, hi!, hi!, hi!], MultiKey[], null], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]]");
        java.lang.String str4 = charSequenceMultiKey3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MultiKey[MultiKey[MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], null, MultiKey[null, hi!, hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]], MultiKey[null, MultiKey[MultiKey[null, hi!, hi!, hi!], MultiKey[], null], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]]]" + "'", str4, "MultiKey[MultiKey[MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], null, MultiKey[null, hi!, hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]], MultiKey[null, MultiKey[MultiKey[null, hi!, hi!, hi!], MultiKey[], null], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]]]");
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!], MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]], null, hi!, null]", (java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]");
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ], MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]], null]", (java.lang.CharSequence) "");
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
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
        java.lang.CharSequence[] charSequenceArray27 = charSequenceMultiKey25.getKeys();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str5, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str6, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray9);
        org.junit.Assert.assertNotNull(charSequenceArray12);
        org.junit.Assert.assertNotNull(charSequenceArray13);
        org.junit.Assert.assertNotNull(charSequenceArray19);
        org.junit.Assert.assertNotNull(charSequenceArray26);
        org.junit.Assert.assertNotNull(charSequenceArray27);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        java.lang.CharSequence charSequence0 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence0, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!");
        java.lang.String str5 = charSequenceMultiKey4.toString();
        java.lang.String str6 = charSequenceMultiKey4.toString();
        java.lang.Object obj7 = null;
        boolean boolean8 = charSequenceMultiKey4.equals(obj7);
        java.lang.Object obj9 = charSequenceMultiKey4.readResolve();
        java.lang.Class<?> wildcardClass10 = charSequenceMultiKey4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str5, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str6, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "MultiKey[MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ], MultiKey[null, hi!, hi!, hi!], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]], , MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]]");
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        java.lang.CharSequence charSequence2 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]", (java.lang.CharSequence) "MultiKey[]", charSequence2);
        java.lang.Object obj4 = charSequenceMultiKey3.readResolve();
        java.lang.CharSequence[] charSequenceArray5 = null; // flaky: charSequenceMultiKey3.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey7 = null; // flaky: new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray5, true);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "MultiKey[MultiKey[null, hi!, hi!, hi!], MultiKey[], null]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "MultiKey[MultiKey[null, hi!, hi!, hi!], MultiKey[], null]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "MultiKey[MultiKey[null, hi!, hi!, hi!], MultiKey[], null]");
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray5);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]]", (java.lang.CharSequence) "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "MultiKey[hi!, MultiKey[null, hi!, hi!, hi!], MultiKey[], MultiKey[null, hi!, hi!, hi!], ]", (java.lang.CharSequence) "MultiKey[]");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey11 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[]", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", (java.lang.CharSequence) "MultiKey[MultiKey[null, hi!, hi!, hi!], MultiKey[], null]", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", (java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]");
        boolean boolean12 = charSequenceMultiKey5.equals((java.lang.Object) "MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]");
        java.lang.CharSequence charSequence14 = charSequenceMultiKey5.getKey(1);
        java.lang.CharSequence charSequence16 = charSequenceMultiKey5.getKey((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + charSequence14 + "' != '" + "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]" + "'", charSequence14, "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]");
        org.junit.Assert.assertEquals("'" + charSequence16 + "' != '" + "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]" + "'", charSequence16, "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]");
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        java.lang.CharSequence charSequence0 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence0, (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]", (java.lang.CharSequence) "", (java.lang.CharSequence) "MultiKey[]", (java.lang.CharSequence) "");
        java.lang.CharSequence[] charSequenceArray10 = new java.lang.CharSequence[] { "", "MultiKey[null, hi!, hi!, hi!]", "hi!", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey12 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray10, false);
        boolean boolean14 = charSequenceMultiKey12.equals((java.lang.Object) '4');
        java.lang.CharSequence charSequence15 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey19 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence15, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!");
        java.lang.String str20 = charSequenceMultiKey19.toString();
        java.lang.String str21 = charSequenceMultiKey19.toString();
        boolean boolean22 = charSequenceMultiKey12.equals((java.lang.Object) charSequenceMultiKey19);
        boolean boolean23 = charSequenceMultiKey5.equals((java.lang.Object) boolean22);
        java.lang.CharSequence charSequence25 = charSequenceMultiKey5.getKey(0);
        org.junit.Assert.assertNotNull(charSequenceArray10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str20, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str21, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(charSequence25);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], ]]", (java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[null, hi!, hi!, hi!], MultiKey[null, hi!, hi!, hi!]]", (java.lang.CharSequence) "MultiKey[null, MultiKey[MultiKey[null, hi!, hi!, hi!], MultiKey[], null], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]]");
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        java.lang.CharSequence charSequence0 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence0, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!");
        java.lang.String str5 = charSequenceMultiKey4.toString();
        java.lang.String str6 = charSequenceMultiKey4.toString();
        java.lang.Object obj7 = null;
        boolean boolean8 = charSequenceMultiKey4.equals(obj7);
        java.lang.CharSequence[] charSequenceArray9 = null; // flaky: charSequenceMultiKey4.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey10 = null; // flaky: new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray9);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str5, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str6, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray9);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[hi!, MultiKey[null, hi!, hi!, hi!], MultiKey[], MultiKey[null, hi!, hi!, hi!], ]", (java.lang.CharSequence) "MultiKey[hi!, MultiKey[null, hi!, hi!, hi!], MultiKey[], MultiKey[null, hi!, hi!, hi!], ]");
        java.lang.String str3 = charSequenceMultiKey2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "MultiKey[MultiKey[hi!, MultiKey[null, hi!, hi!, hi!], MultiKey[], MultiKey[null, hi!, hi!, hi!], ], MultiKey[hi!, MultiKey[null, hi!, hi!, hi!], MultiKey[], MultiKey[null, hi!, hi!, hi!], ]]" + "'", str3, "MultiKey[MultiKey[hi!, MultiKey[null, hi!, hi!, hi!], MultiKey[], MultiKey[null, hi!, hi!, hi!], ], MultiKey[hi!, MultiKey[null, hi!, hi!, hi!], MultiKey[], MultiKey[null, hi!, hi!, hi!], ]]");
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], ]]", (java.lang.CharSequence) "MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]]");
        java.lang.String str3 = charSequenceMultiKey2.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence5 = charSequenceMultiKey2.getKey(5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "MultiKey[MultiKey[MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], ]], MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]]]" + "'", str3, "MultiKey[MultiKey[MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], ]], MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]]]");
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        java.lang.CharSequence charSequence0 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence0, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence[] charSequenceArray5 = null; // flaky: charSequenceMultiKey4.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey7 = null; // flaky: new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray5, false);
        java.lang.CharSequence charSequence9 = null; // flaky: charSequenceMultiKey7.getKey(0);
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray5);
        org.junit.Assert.assertNull(charSequence9);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], null, MultiKey[null, hi!, hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]], MultiKey[null, MultiKey[MultiKey[null, hi!, hi!, hi!], MultiKey[], null], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]]]", (java.lang.Comparable<java.lang.String>) "MultiKey[null, hi!, hi!, hi!]");
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        java.lang.CharSequence[] charSequenceArray0 = new java.lang.CharSequence[] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey1 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray0);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray0);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray0, false);
        java.lang.CharSequence[] charSequenceArray5 = charSequenceMultiKey4.getKeys();
        java.lang.String str6 = charSequenceMultiKey4.toString();
        int int7 = charSequenceMultiKey4.size();
        java.lang.String str8 = charSequenceMultiKey4.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence10 = charSequenceMultiKey4.getKey(5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceArray0);
        org.junit.Assert.assertNotNull(charSequenceArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiKey[]" + "'", str6, "MultiKey[]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MultiKey[]" + "'", str8, "MultiKey[]");
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        java.lang.reflect.Type[][] typeArray0 = null;
        java.lang.reflect.Type[][] typeArray1 = new java.lang.reflect.Type[][] {};
        java.lang.reflect.Type[][] typeArray2 = null;
        java.lang.reflect.Type[][] typeArray3 = new java.lang.reflect.Type[][] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[][]> typeArrayMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[][]>(typeArray1, typeArray2, typeArray3);
        java.lang.reflect.Type[][] typeArray5 = new java.lang.reflect.Type[][] {};
        java.lang.reflect.Type[][] typeArray6 = null;
        java.lang.reflect.Type[][] typeArray7 = new java.lang.reflect.Type[][] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[][]> typeArrayMultiKey8 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[][]>(typeArray5, typeArray6, typeArray7);
        java.lang.reflect.Type[][] typeArray9 = new java.lang.reflect.Type[][] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[][]> typeArrayMultiKey10 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[][]>(typeArray0, typeArray2, typeArray6, typeArray9);
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(typeArray3);
        org.junit.Assert.assertNotNull(typeArray5);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(typeArray9);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        java.lang.String[][] strArray0 = new java.lang.String[][] {};
        java.lang.String[][] strArray1 = new java.lang.String[][] {};
        java.lang.String[][][] strArray2 = new java.lang.String[][][] { strArray0, strArray1 };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[][]> strArrayMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[][]>(strArray2, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[][]> charSequenceArrayMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[][]>((java.lang.CharSequence[][][]) strArray2, false);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[hi!, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]", (java.lang.CharSequence) "", (java.lang.CharSequence) "MultiKey[MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!], MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]], null, hi!, null]", (java.lang.CharSequence) "MultiKey[hi!, MultiKey[null, hi!, hi!, hi!], MultiKey[], MultiKey[null, hi!, hi!, hi!], ]", (java.lang.CharSequence) "MultiKey[MultiKey[MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], null, MultiKey[null, hi!, hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]], MultiKey[null, MultiKey[MultiKey[null, hi!, hi!, hi!], MultiKey[], null], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]]]");
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
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
        int int30 = charSequenceMultiKey29.size();
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 5 + "'", int30 == 5);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]", (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]");
        java.lang.CharSequence[] charSequenceArray4 = null; // flaky: charSequenceMultiKey3.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = null; // flaky: new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4);
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray4);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]");
        java.lang.CharSequence[] charSequenceArray3 = new java.lang.CharSequence[] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray3);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray3);
        java.lang.CharSequence charSequence6 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey10 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence6, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence[] charSequenceArray11 = null; // flaky: charSequenceMultiKey10.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey12 = null; // flaky: new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray11);
        int int13 = 0; // flaky: charSequenceMultiKey12.size();
        boolean boolean14 = charSequenceMultiKey5.equals((java.lang.Object) charSequenceMultiKey12);
        java.lang.Object obj15 = null; // flaky: charSequenceMultiKey12.readResolve();
        boolean boolean16 = charSequenceMultiKey2.equals((java.lang.Object) charSequenceMultiKey12);
        java.lang.CharSequence[] charSequenceArray17 = null; // flaky: charSequenceMultiKey2.getKeys();
        org.junit.Assert.assertNotNull(charSequenceArray3);
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
// flaky:         org.junit.Assert.assertNotNull(obj15);
// flaky:         org.junit.Assert.assertEquals(obj15.toString(), "MultiKey[null, hi!, hi!, hi!]");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "MultiKey[null, hi!, hi!, hi!]");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray17);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", (java.lang.CharSequence) "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]");
        java.lang.Object obj3 = charSequenceMultiKey2.readResolve();
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "MultiKey[MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "MultiKey[MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "MultiKey[MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]]");
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[hi!, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]", (java.lang.CharSequence) "MultiKey[null, MultiKey[MultiKey[null, hi!, hi!, hi!], MultiKey[], null], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]]", (java.lang.CharSequence) "MultiKey[MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ], MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]], null]");
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        java.lang.reflect.Type[][][] typeArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[][]> typeArrayMultiKey1 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[][]>(typeArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The array of keys must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        java.lang.CharSequence[] charSequenceArray0 = new java.lang.CharSequence[] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey1 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray0);
        java.lang.Object obj2 = charSequenceMultiKey1.readResolve();
        java.lang.Object obj3 = charSequenceMultiKey1.readResolve();
        java.lang.Object obj4 = charSequenceMultiKey1.readResolve();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        org.junit.Assert.assertNotNull(charSequenceArray0);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "MultiKey[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "MultiKey[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "MultiKey[]");
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "MultiKey[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "MultiKey[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "MultiKey[]");
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "MultiKey[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "MultiKey[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "MultiKey[]");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        java.lang.CharSequence charSequence0 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence0, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence[] charSequenceArray5 = null; // flaky: charSequenceMultiKey4.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey7 = null; // flaky: new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray5, false);
        java.lang.Object obj8 = null; // flaky: charSequenceMultiKey7.readResolve();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence10 = null; // flaky: charSequenceMultiKey7.getKey(100);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray5);
// flaky:         org.junit.Assert.assertNotNull(obj8);
// flaky:         org.junit.Assert.assertEquals(obj8.toString(), "MultiKey[null, hi!, hi!, hi!]");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "MultiKey[null, hi!, hi!, hi!]");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "MultiKey[null, hi!, hi!, hi!]");
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!], MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!], null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]]", (java.lang.CharSequence) "", (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]");
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence2 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence0, (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]", charSequence2, (java.lang.CharSequence) "MultiKey[]", (java.lang.CharSequence) "");
        java.lang.CharSequence[] charSequenceArray6 = null; // flaky: charSequenceMultiKey5.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey8 = null; // flaky: new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray6, true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence10 = null; // flaky: charSequenceMultiKey8.getKey((int) (short) 100);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray6);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        java.lang.reflect.Type[][] typeArray0 = new java.lang.reflect.Type[][] {};
        java.lang.reflect.Type[][] typeArray1 = null;
        java.lang.reflect.Type[][] typeArray2 = new java.lang.reflect.Type[][] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[][]> typeArrayMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[][]>(typeArray0, typeArray1, typeArray2);
        java.lang.reflect.Type[][] typeArray4 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[][]> typeArrayMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[][]>(typeArray1, typeArray4);
        org.junit.Assert.assertNotNull(typeArray0);
        org.junit.Assert.assertNotNull(typeArray2);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        java.lang.CharSequence charSequence3 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[null, MultiKey[MultiKey[null, hi!, hi!, hi!], MultiKey[], null], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]]", (java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]]", (java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]]", charSequence3);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "", (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]", (java.lang.CharSequence) "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]");
        java.lang.CharSequence[] charSequenceArray5 = null; // flaky: charSequenceMultiKey4.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey7 = null; // flaky: new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray5, false);
        int int8 = 0; // flaky: charSequenceMultiKey7.size();
        java.lang.CharSequence[] charSequenceArray9 = null; // flaky: charSequenceMultiKey7.getKeys();
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray5);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray9);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        java.lang.CharSequence charSequence0 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence0, (java.lang.CharSequence) "MultiKey[MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[null, hi!, hi!, hi!], MultiKey[null, hi!, hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]]", (java.lang.CharSequence) "MultiKey[]");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence5 = charSequenceMultiKey3.getKey(5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[null, hi!, hi!, hi!], MultiKey[null, hi!, hi!, hi!]]", (java.lang.CharSequence) "MultiKey[MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ], MultiKey[null, hi!, hi!, hi!], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]], , MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]]");
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        java.lang.CharSequence charSequence2 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]", (java.lang.CharSequence) "MultiKey[]", charSequence2);
        java.lang.Object obj4 = charSequenceMultiKey3.readResolve();
        java.lang.CharSequence charSequence5 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey9 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence5, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!");
        java.lang.String str10 = charSequenceMultiKey9.toString();
        int int11 = charSequenceMultiKey9.size();
        java.lang.Class<?> wildcardClass12 = charSequenceMultiKey9.getClass();
        java.lang.reflect.Type[] typeArray13 = new java.lang.reflect.Type[] { wildcardClass12 };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type> typeMultiKey15 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type>(typeArray13, true);
        boolean boolean16 = charSequenceMultiKey3.equals((java.lang.Object) true);
        java.lang.String str17 = charSequenceMultiKey3.toString();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "MultiKey[MultiKey[null, hi!, hi!, hi!], MultiKey[], null]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "MultiKey[MultiKey[null, hi!, hi!, hi!], MultiKey[], null]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "MultiKey[MultiKey[null, hi!, hi!, hi!], MultiKey[], null]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str10, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(typeArray13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "MultiKey[MultiKey[null, hi!, hi!, hi!], MultiKey[], null]" + "'", str17, "MultiKey[MultiKey[null, hi!, hi!, hi!], MultiKey[], null]");
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], ]", (java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[null, hi!, hi!, hi!], MultiKey[null, hi!, hi!, hi!]]", (java.lang.CharSequence) "MultiKey[MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[null, hi!, hi!, hi!], MultiKey[null, hi!, hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]]");
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        java.lang.CharSequence charSequence4 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], null, MultiKey[null, hi!, hi!, hi!]]", (java.lang.CharSequence) "MultiKey[hi!, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]", (java.lang.CharSequence) "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]", (java.lang.CharSequence) "MultiKey[MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ], MultiKey[null, hi!, hi!, hi!], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]], , MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]]", charSequence4);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        org.apache.commons.collections4.keyvalue.MultiKey[] multiKeyArray1 = new org.apache.commons.collections4.keyvalue.MultiKey[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[] charSequenceMultiKeyArray2 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]) multiKeyArray1;
        org.apache.commons.collections4.keyvalue.MultiKey[] multiKeyArray4 = new org.apache.commons.collections4.keyvalue.MultiKey[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[] charSequenceMultiKeyArray5 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]) multiKeyArray4;
        org.apache.commons.collections4.keyvalue.MultiKey[] multiKeyArray7 = new org.apache.commons.collections4.keyvalue.MultiKey[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[] charSequenceMultiKeyArray8 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]) multiKeyArray7;
        org.apache.commons.collections4.keyvalue.MultiKey[] multiKeyArray10 = new org.apache.commons.collections4.keyvalue.MultiKey[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[] charSequenceMultiKeyArray11 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]) multiKeyArray10;
        org.apache.commons.collections4.keyvalue.MultiKey[][] multiKeyArray13 = new org.apache.commons.collections4.keyvalue.MultiKey[4][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[][] charSequenceMultiKeyArray14 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[][]) multiKeyArray13;
        charSequenceMultiKeyArray14[0] = multiKeyArray1;
        charSequenceMultiKeyArray14[1] = charSequenceMultiKeyArray5;
        charSequenceMultiKeyArray14[2] = multiKeyArray7;
        charSequenceMultiKeyArray14[3] = multiKeyArray10;
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]> charSequenceMultiKeyArrayMultiKey23 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]>(charSequenceMultiKeyArray14);
        java.lang.Class<?> wildcardClass24 = charSequenceMultiKeyArray14.getClass();
        java.lang.CharSequence[][] charSequenceArray25 = new java.lang.CharSequence[][] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[]> charSequenceArrayMultiKey26 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[]>(charSequenceArray25);
        java.lang.Class<?> wildcardClass27 = charSequenceArrayMultiKey26.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey30 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]", (java.lang.CharSequence) "");
        java.lang.CharSequence[] charSequenceArray35 = new java.lang.CharSequence[] { "", "MultiKey[null, hi!, hi!, hi!]", "hi!", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey37 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray35, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey39 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray35, true);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey40 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray35);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey42 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray35, true);
        java.lang.Class<?> wildcardClass43 = charSequenceMultiKey42.getClass();
        boolean boolean44 = charSequenceMultiKey30.equals((java.lang.Object) wildcardClass43);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey47 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "", (java.lang.CharSequence) "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]");
        java.lang.Class<?> wildcardClass48 = charSequenceMultiKey47.getClass();
        java.lang.CharSequence charSequence51 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey55 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence51, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence[] charSequenceArray56 = null; // flaky: charSequenceMultiKey55.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey57 = null; // flaky: new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray56);
        org.apache.commons.collections4.keyvalue.MultiKey<java.io.Serializable> serializableMultiKey58 = new org.apache.commons.collections4.keyvalue.MultiKey<java.io.Serializable>((java.io.Serializable) false, (java.io.Serializable) (byte) 10, (java.io.Serializable) charSequenceArray56);
        java.lang.Class<?> wildcardClass59 = null; // flaky: charSequenceArray56.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type> typeMultiKey60 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type>((java.lang.reflect.Type) wildcardClass24, (java.lang.reflect.Type) wildcardClass27, (java.lang.reflect.Type) wildcardClass43, (java.lang.reflect.Type) wildcardClass48, (java.lang.reflect.Type) wildcardClass59);
        org.junit.Assert.assertNotNull(multiKeyArray1);
        org.junit.Assert.assertNotNull(charSequenceMultiKeyArray2);
        org.junit.Assert.assertNotNull(multiKeyArray4);
        org.junit.Assert.assertNotNull(charSequenceMultiKeyArray5);
        org.junit.Assert.assertNotNull(multiKeyArray7);
        org.junit.Assert.assertNotNull(charSequenceMultiKeyArray8);
        org.junit.Assert.assertNotNull(multiKeyArray10);
        org.junit.Assert.assertNotNull(charSequenceMultiKeyArray11);
        org.junit.Assert.assertNotNull(multiKeyArray13);
        org.junit.Assert.assertNotNull(charSequenceMultiKeyArray14);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(charSequenceArray25);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(charSequenceArray35);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(wildcardClass48);
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray56);
// flaky:         org.junit.Assert.assertNotNull(wildcardClass59);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        java.lang.String[] strArray1 = new java.lang.String[] { "MultiKey[MultiKey[null, hi!, hi!, hi!], MultiKey[], null]" };
        java.lang.String[] strArray3 = new java.lang.String[] { "MultiKey[MultiKey[null, hi!, hi!, hi!], MultiKey[], null]" };
        java.lang.String[] strArray5 = new java.lang.String[] { "MultiKey[MultiKey[null, hi!, hi!, hi!], MultiKey[], null]" };
        java.lang.String[] strArray7 = new java.lang.String[] { "MultiKey[MultiKey[null, hi!, hi!, hi!], MultiKey[], null]" };
        java.lang.String[] strArray9 = new java.lang.String[] { "MultiKey[MultiKey[null, hi!, hi!, hi!], MultiKey[], null]" };
        java.lang.String[][] strArray10 = new java.lang.String[][] { strArray1, strArray3, strArray5, strArray7, strArray9 };
        java.lang.String[] strArray12 = new java.lang.String[] { "MultiKey[MultiKey[null, hi!, hi!, hi!], MultiKey[], null]" };
        java.lang.String[] strArray14 = new java.lang.String[] { "MultiKey[MultiKey[null, hi!, hi!, hi!], MultiKey[], null]" };
        java.lang.String[] strArray16 = new java.lang.String[] { "MultiKey[MultiKey[null, hi!, hi!, hi!], MultiKey[], null]" };
        java.lang.String[] strArray18 = new java.lang.String[] { "MultiKey[MultiKey[null, hi!, hi!, hi!], MultiKey[], null]" };
        java.lang.String[] strArray20 = new java.lang.String[] { "MultiKey[MultiKey[null, hi!, hi!, hi!], MultiKey[], null]" };
        java.lang.String[][] strArray21 = new java.lang.String[][] { strArray12, strArray14, strArray16, strArray18, strArray20 };
        java.lang.String[] strArray23 = new java.lang.String[] { "MultiKey[MultiKey[null, hi!, hi!, hi!], MultiKey[], null]" };
        java.lang.String[] strArray25 = new java.lang.String[] { "MultiKey[MultiKey[null, hi!, hi!, hi!], MultiKey[], null]" };
        java.lang.String[] strArray27 = new java.lang.String[] { "MultiKey[MultiKey[null, hi!, hi!, hi!], MultiKey[], null]" };
        java.lang.String[] strArray29 = new java.lang.String[] { "MultiKey[MultiKey[null, hi!, hi!, hi!], MultiKey[], null]" };
        java.lang.String[] strArray31 = new java.lang.String[] { "MultiKey[MultiKey[null, hi!, hi!, hi!], MultiKey[], null]" };
        java.lang.String[][] strArray32 = new java.lang.String[][] { strArray23, strArray25, strArray27, strArray29, strArray31 };
        java.lang.String[] strArray34 = new java.lang.String[] { "MultiKey[MultiKey[null, hi!, hi!, hi!], MultiKey[], null]" };
        java.lang.String[] strArray36 = new java.lang.String[] { "MultiKey[MultiKey[null, hi!, hi!, hi!], MultiKey[], null]" };
        java.lang.String[] strArray38 = new java.lang.String[] { "MultiKey[MultiKey[null, hi!, hi!, hi!], MultiKey[], null]" };
        java.lang.String[] strArray40 = new java.lang.String[] { "MultiKey[MultiKey[null, hi!, hi!, hi!], MultiKey[], null]" };
        java.lang.String[] strArray42 = new java.lang.String[] { "MultiKey[MultiKey[null, hi!, hi!, hi!], MultiKey[], null]" };
        java.lang.String[][] strArray43 = new java.lang.String[][] { strArray34, strArray36, strArray38, strArray40, strArray42 };
        java.lang.String[][][] strArray44 = new java.lang.String[][][] { strArray10, strArray21, strArray32, strArray43 };
        java.lang.String[][][][] strArray45 = new java.lang.String[][][][] { strArray44 };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[][][]> strArrayMultiKey46 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[][][]>(strArray45);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertNotNull(strArray45);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        java.lang.CharSequence charSequence3 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "", (java.lang.CharSequence) "MultiKey[MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!], MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]], null, hi!, null]", (java.lang.CharSequence) "MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]]", charSequence3);
        java.lang.CharSequence[] charSequenceArray5 = null; // flaky: charSequenceMultiKey4.getKeys();
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray5);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
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
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ]", (java.lang.CharSequence) "MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]]", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]", (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]");
        int int6 = charSequenceMultiKey5.size();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[hi!, MultiKey[null, hi!, hi!, hi!], MultiKey[], MultiKey[null, hi!, hi!, hi!], ]", (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]", (java.lang.CharSequence) "MultiKey[hi!, MultiKey[null, hi!, hi!, hi!], MultiKey[], MultiKey[null, hi!, hi!, hi!], ]", (java.lang.CharSequence) "");
        java.lang.CharSequence[] charSequenceArray6 = null; // flaky: charSequenceMultiKey5.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey7 = null; // flaky: new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray6);
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray6);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        java.lang.CharSequence charSequence0 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence0, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!");
        java.lang.String str5 = charSequenceMultiKey4.toString();
        int int6 = charSequenceMultiKey4.size();
        int int7 = charSequenceMultiKey4.size();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str5, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[hi!, MultiKey[null, hi!, hi!, hi!], MultiKey[], MultiKey[null, hi!, hi!, hi!], ]", (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]", (java.lang.CharSequence) "MultiKey[hi!, MultiKey[null, hi!, hi!, hi!], MultiKey[], MultiKey[null, hi!, hi!, hi!], ]", (java.lang.CharSequence) "");
        java.lang.CharSequence[] charSequenceArray6 = null; // flaky: charSequenceMultiKey5.getKeys();
        java.lang.Class<?> wildcardClass7 = charSequenceMultiKey5.getClass();
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[MultiKey[MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], ]], MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]]]", (java.lang.CharSequence) "MultiKey[MultiKey[hi!, MultiKey[null, hi!, hi!, hi!], MultiKey[], MultiKey[null, hi!, hi!, hi!], ], MultiKey[hi!, MultiKey[null, hi!, hi!, hi!], MultiKey[], MultiKey[null, hi!, hi!, hi!], ]]", (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]");
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        java.lang.CharSequence[] charSequenceArray0 = new java.lang.CharSequence[] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey1 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray0);
        java.lang.Object obj2 = charSequenceMultiKey1.readResolve();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        org.junit.Assert.assertNotNull(charSequenceArray0);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "MultiKey[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "MultiKey[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "MultiKey[]");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]", (java.lang.CharSequence) "", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", (java.lang.CharSequence) "MultiKey[MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ], MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]], null]", (java.lang.CharSequence) "MultiKey[hi!, MultiKey[null, hi!, hi!, hi!], MultiKey[], MultiKey[null, hi!, hi!, hi!], ]");
        int int6 = charSequenceMultiKey5.size();
        java.lang.String str7 = charSequenceMultiKey5.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "MultiKey[MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!], , MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ], MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]], null], MultiKey[hi!, MultiKey[null, hi!, hi!, hi!], MultiKey[], MultiKey[null, hi!, hi!, hi!], ]]" + "'", str7, "MultiKey[MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!], , MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ], MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]], null], MultiKey[hi!, MultiKey[null, hi!, hi!, hi!], MultiKey[], MultiKey[null, hi!, hi!, hi!], ]]");
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "", (java.lang.CharSequence) "MultiKey[MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!], MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]], null, hi!, null]");
        java.lang.CharSequence charSequence4 = charSequenceMultiKey2.getKey(0);
        org.junit.Assert.assertEquals("'" + charSequence4 + "' != '" + "" + "'", charSequence4, "");
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        java.lang.CharSequence[] charSequenceArray0 = new java.lang.CharSequence[] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey1 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray0);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "", (java.lang.CharSequence) "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey7 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]");
        java.lang.CharSequence[] charSequenceArray12 = new java.lang.CharSequence[] { "", "MultiKey[null, hi!, hi!, hi!]", "hi!", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey14 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray12, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey16 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray12, true);
        java.lang.CharSequence[] charSequenceArray17 = charSequenceMultiKey16.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey[] multiKeyArray19 = new org.apache.commons.collections4.keyvalue.MultiKey[4];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[] charSequenceMultiKeyArray20 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]) multiKeyArray19;
        charSequenceMultiKeyArray20[0] = charSequenceMultiKey1;
        charSequenceMultiKeyArray20[1] = charSequenceMultiKey4;
        charSequenceMultiKeyArray20[2] = charSequenceMultiKey7;
        charSequenceMultiKeyArray20[3] = charSequenceMultiKey16;
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>> charSequenceMultiKeyMultiKey30 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>>(charSequenceMultiKeyArray20, false);
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>> charSequenceMultiKeyMultiKey31 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>>(charSequenceMultiKeyArray20);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[] charSequenceMultiKeyArray32 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]> charSequenceMultiKeyArrayMultiKey33 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]>(charSequenceMultiKeyArray20, charSequenceMultiKeyArray32);
        org.junit.Assert.assertNotNull(charSequenceArray0);
        org.junit.Assert.assertNotNull(charSequenceArray12);
        org.junit.Assert.assertNotNull(charSequenceArray17);
        org.junit.Assert.assertNotNull(multiKeyArray19);
        org.junit.Assert.assertNotNull(charSequenceMultiKeyArray20);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[hi!, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]", (java.lang.CharSequence) "MultiKey[MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!], MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]], null, hi!, null]", (java.lang.CharSequence) "MultiKey[MultiKey[null, hi!, hi!, hi!], MultiKey[], null]", (java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[null, hi!, hi!, hi!], MultiKey[null, hi!, hi!, hi!]]");
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        java.lang.CharSequence charSequence1 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]", charSequence1, (java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[null, hi!, hi!, hi!], MultiKey[null, hi!, hi!, hi!]]");
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] { "", "MultiKey[null, hi!, hi!, hi!]", "hi!", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4, false);
        java.lang.CharSequence[] charSequenceArray7 = charSequenceMultiKey6.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey9 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray7, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey10 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray7);
        java.lang.Class<?> wildcardClass11 = charSequenceArray7.getClass();
        org.junit.Assert.assertNotNull(charSequenceArray4);
        org.junit.Assert.assertNotNull(charSequenceArray7);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        java.lang.CharSequence[] charSequenceArray0 = new java.lang.CharSequence[] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey1 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray0);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray0);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray0, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray0);
        java.lang.Class<?> wildcardClass6 = charSequenceArray0.getClass();
        org.junit.Assert.assertNotNull(charSequenceArray0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        java.lang.CharSequence charSequence0 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence0, (java.lang.CharSequence) "hi!");
        java.lang.Object obj3 = charSequenceMultiKey2.readResolve();
        java.lang.Object obj4 = charSequenceMultiKey2.readResolve();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey7 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]", (java.lang.CharSequence) "hi!");
        int int8 = charSequenceMultiKey7.size();
        boolean boolean9 = charSequenceMultiKey2.equals((java.lang.Object) charSequenceMultiKey7);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "MultiKey[null, hi!]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "MultiKey[null, hi!]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "MultiKey[null, hi!]");
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "MultiKey[null, hi!]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "MultiKey[null, hi!]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "MultiKey[null, hi!]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]", (java.lang.CharSequence) "MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]]");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence4 = charSequenceMultiKey2.getKey((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        java.lang.String[] strArray5 = new java.lang.String[] { "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[null, hi!, hi!, hi!], MultiKey[null, hi!, hi!, hi!]]", "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ]", "hi!", "", "MultiKey[null, hi!, hi!, hi!]" };
        java.lang.String[] strArray11 = new java.lang.String[] { "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[null, hi!, hi!, hi!], MultiKey[null, hi!, hi!, hi!]]", "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ]", "hi!", "", "MultiKey[null, hi!, hi!, hi!]" };
        java.lang.String[] strArray17 = new java.lang.String[] { "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[null, hi!, hi!, hi!], MultiKey[null, hi!, hi!, hi!]]", "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ]", "hi!", "", "MultiKey[null, hi!, hi!, hi!]" };
        java.lang.String[] strArray23 = new java.lang.String[] { "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[null, hi!, hi!, hi!], MultiKey[null, hi!, hi!, hi!]]", "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ]", "hi!", "", "MultiKey[null, hi!, hi!, hi!]" };
        java.lang.String[] strArray29 = new java.lang.String[] { "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[null, hi!, hi!, hi!], MultiKey[null, hi!, hi!, hi!]]", "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ]", "hi!", "", "MultiKey[null, hi!, hi!, hi!]" };
        java.lang.String[] strArray35 = new java.lang.String[] { "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[null, hi!, hi!, hi!], MultiKey[null, hi!, hi!, hi!]]", "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ]", "hi!", "", "MultiKey[null, hi!, hi!, hi!]" };
        java.lang.String[][] strArray36 = new java.lang.String[][] { strArray5, strArray11, strArray17, strArray23, strArray29, strArray35 };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]> strArrayMultiKey38 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]>(strArray36, false);
        java.lang.String[] strArray39 = new java.lang.String[] {};
        java.lang.String[] strArray40 = new java.lang.String[] {};
        java.lang.String[] strArray41 = new java.lang.String[] {};
        java.lang.String[] strArray42 = new java.lang.String[] {};
        java.lang.String[][] strArray43 = new java.lang.String[][] { strArray39, strArray40, strArray41, strArray42 };
        java.lang.String[] strArray46 = new java.lang.String[] { "MultiKey[MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], ]]", "MultiKey[MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!], MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]], null, hi!, null]" };
        java.lang.String[] strArray49 = new java.lang.String[] { "MultiKey[MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], ]]", "MultiKey[MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!], MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]], null, hi!, null]" };
        java.lang.String[][] strArray50 = new java.lang.String[][] { strArray46, strArray49 };
        java.lang.String[][] strArray51 = new java.lang.String[][] {};
        java.lang.String[][] strArray52 = new java.lang.String[][] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[][]> strArrayMultiKey53 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[][]>(strArray43, strArray50, strArray51, strArray52);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[][]> strArrayMultiKey54 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[][]>(strArray36, strArray52);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertNotNull(strArray52);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]]", (java.lang.CharSequence) "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "MultiKey[hi!, MultiKey[null, hi!, hi!, hi!], MultiKey[], MultiKey[null, hi!, hi!, hi!], ]", (java.lang.CharSequence) "MultiKey[]");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey11 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[]", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", (java.lang.CharSequence) "MultiKey[MultiKey[null, hi!, hi!, hi!], MultiKey[], null]", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", (java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]");
        boolean boolean12 = charSequenceMultiKey5.equals((java.lang.Object) "MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]");
        java.lang.CharSequence charSequence14 = charSequenceMultiKey5.getKey(1);
        java.lang.CharSequence[] charSequenceArray15 = null; // flaky: charSequenceMultiKey5.getKeys();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + charSequence14 + "' != '" + "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]" + "'", charSequence14, "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]");
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray15);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        java.lang.CharSequence[] charSequenceArray0 = new java.lang.CharSequence[] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey1 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray0);
        java.lang.CharSequence[] charSequenceArray2 = charSequenceMultiKey1.getKeys();
        java.lang.String str3 = charSequenceMultiKey1.toString();
        org.junit.Assert.assertNotNull(charSequenceArray0);
        org.junit.Assert.assertNotNull(charSequenceArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "MultiKey[]" + "'", str3, "MultiKey[]");
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        java.lang.String[][] strArray0 = new java.lang.String[][] {};
        java.lang.String[][][] strArray1 = new java.lang.String[][][] { strArray0 };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[][]> strArrayMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[][]>(strArray1);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] { "", "MultiKey[null, hi!, hi!, hi!]", "hi!", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey8 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4, true);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey10 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4, false);
        org.junit.Assert.assertNotNull(charSequenceArray4);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]", (java.lang.CharSequence) "hi!");
        int int3 = charSequenceMultiKey2.size();
        java.lang.CharSequence[] charSequenceArray4 = null; // flaky: charSequenceMultiKey2.getKeys();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray4);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        java.lang.CharSequence charSequence3 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]]", (java.lang.CharSequence) "MultiKey[MultiKey[null, hi!, hi!, hi!], MultiKey[], null]", (java.lang.CharSequence) "MultiKey[MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[null, hi!, hi!, hi!], MultiKey[null, hi!, hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]]", charSequence3, (java.lang.CharSequence) "MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]]");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey8 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]", (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]");
        java.lang.Object obj9 = null;
        boolean boolean10 = charSequenceMultiKey8.equals(obj9);
        java.lang.String str11 = charSequenceMultiKey8.toString();
        java.lang.String str12 = charSequenceMultiKey8.toString();
        boolean boolean13 = charSequenceMultiKey5.equals((java.lang.Object) charSequenceMultiKey8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]" + "'", str11, "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]" + "'", str12, "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        java.lang.CharSequence[] charSequenceArray0 = new java.lang.CharSequence[] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey1 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray0);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray0);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray0, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray0);
        int int6 = charSequenceMultiKey5.size();
        org.junit.Assert.assertNotNull(charSequenceArray0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        java.lang.CharSequence charSequence2 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", charSequence2, (java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]", (java.lang.CharSequence) "hi!");
        java.lang.String str6 = charSequenceMultiKey5.toString();
        java.lang.Object obj7 = charSequenceMultiKey5.readResolve();
        java.lang.Object obj8 = charSequenceMultiKey5.readResolve();
        java.lang.String str9 = charSequenceMultiKey5.toString();
        int int10 = charSequenceMultiKey5.size();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]" + "'", str6, "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]");
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]");
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]" + "'", str9, "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]", (java.lang.CharSequence) "MultiKey[hi!, MultiKey[null, hi!, hi!, hi!], MultiKey[], MultiKey[null, hi!, hi!, hi!], ]", (java.lang.CharSequence) "hi!");
        java.lang.Object obj4 = charSequenceMultiKey3.readResolve();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!, hi!], MultiKey[], MultiKey[null, hi!, hi!, hi!], ], hi!]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!, hi!], MultiKey[], MultiKey[null, hi!, hi!, hi!], ], hi!]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[hi!, MultiKey[null, hi!, hi!, hi!], MultiKey[], MultiKey[null, hi!, hi!, hi!], ], hi!]");
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        java.lang.CharSequence[] charSequenceArray0 = new java.lang.CharSequence[] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey1 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray0);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "", (java.lang.CharSequence) "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey7 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]");
        java.lang.CharSequence[] charSequenceArray12 = new java.lang.CharSequence[] { "", "MultiKey[null, hi!, hi!, hi!]", "hi!", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey14 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray12, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey16 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray12, true);
        java.lang.CharSequence[] charSequenceArray17 = charSequenceMultiKey16.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey[] multiKeyArray19 = new org.apache.commons.collections4.keyvalue.MultiKey[4];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[] charSequenceMultiKeyArray20 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]) multiKeyArray19;
        charSequenceMultiKeyArray20[0] = charSequenceMultiKey1;
        charSequenceMultiKeyArray20[1] = charSequenceMultiKey4;
        charSequenceMultiKeyArray20[2] = charSequenceMultiKey7;
        charSequenceMultiKeyArray20[3] = charSequenceMultiKey16;
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>> charSequenceMultiKeyMultiKey30 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>>(charSequenceMultiKeyArray20, false);
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>> charSequenceMultiKeyMultiKey32 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>>(charSequenceMultiKeyArray20, true);
        java.lang.CharSequence[] charSequenceArray33 = new java.lang.CharSequence[] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey34 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray33);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey37 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "", (java.lang.CharSequence) "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey40 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]");
        java.lang.CharSequence[] charSequenceArray45 = new java.lang.CharSequence[] { "", "MultiKey[null, hi!, hi!, hi!]", "hi!", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey47 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray45, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey49 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray45, true);
        java.lang.CharSequence[] charSequenceArray50 = charSequenceMultiKey49.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey[] multiKeyArray52 = new org.apache.commons.collections4.keyvalue.MultiKey[4];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[] charSequenceMultiKeyArray53 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]) multiKeyArray52;
        charSequenceMultiKeyArray53[0] = charSequenceMultiKey34;
        charSequenceMultiKeyArray53[1] = charSequenceMultiKey37;
        charSequenceMultiKeyArray53[2] = charSequenceMultiKey40;
        charSequenceMultiKeyArray53[3] = charSequenceMultiKey49;
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>> charSequenceMultiKeyMultiKey63 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>>(charSequenceMultiKeyArray53, false);
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>> charSequenceMultiKeyMultiKey64 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>>(charSequenceMultiKeyArray53);
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]> charSequenceMultiKeyArrayMultiKey65 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]>(charSequenceMultiKeyArray20, charSequenceMultiKeyArray53);
        org.junit.Assert.assertNotNull(charSequenceArray0);
        org.junit.Assert.assertNotNull(charSequenceArray12);
        org.junit.Assert.assertNotNull(charSequenceArray17);
        org.junit.Assert.assertNotNull(multiKeyArray19);
        org.junit.Assert.assertNotNull(charSequenceMultiKeyArray20);
        org.junit.Assert.assertNotNull(charSequenceArray33);
        org.junit.Assert.assertNotNull(charSequenceArray45);
        org.junit.Assert.assertNotNull(charSequenceArray50);
        org.junit.Assert.assertNotNull(multiKeyArray52);
        org.junit.Assert.assertNotNull(charSequenceMultiKeyArray53);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]", (java.lang.CharSequence) "MultiKey[]", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]", (java.lang.CharSequence) "");
        java.lang.CharSequence[] charSequenceArray6 = null; // flaky: charSequenceMultiKey5.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey8 = null; // flaky: new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray6, false);
        java.lang.Object obj9 = null; // flaky: charSequenceMultiKey8.readResolve();
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray6);
// flaky:         org.junit.Assert.assertNotNull(obj9);
// flaky:         org.junit.Assert.assertEquals(obj9.toString(), "MultiKey[hi!, MultiKey[null, hi!, hi!, hi!], MultiKey[], MultiKey[null, hi!, hi!, hi!], ]");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "MultiKey[hi!, MultiKey[null, hi!, hi!, hi!], MultiKey[], MultiKey[null, hi!, hi!, hi!], ]");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "MultiKey[hi!, MultiKey[null, hi!, hi!, hi!], MultiKey[], MultiKey[null, hi!, hi!, hi!], ]");
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]", (java.lang.CharSequence) "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ]", (java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]", (java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]", (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]");
        java.lang.Object obj6 = charSequenceMultiKey5.readResolve();
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "MultiKey[MultiKey[null, hi!, hi!, hi!], MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "MultiKey[MultiKey[null, hi!, hi!, hi!], MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "MultiKey[MultiKey[null, hi!, hi!, hi!], MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]]");
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]", (java.lang.CharSequence) "MultiKey[]", (java.lang.CharSequence) "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]", (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]");
        java.lang.CharSequence charSequence7 = charSequenceMultiKey5.getKey(4);
        java.lang.CharSequence[] charSequenceArray8 = null; // flaky: charSequenceMultiKey5.getKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence10 = charSequenceMultiKey5.getKey((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + charSequence7 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", charSequence7, "MultiKey[null, hi!, hi!, hi!]");
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray8);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]");
        int int3 = charSequenceMultiKey2.size();
        int int4 = charSequenceMultiKey2.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], null, MultiKey[null, hi!, hi!, hi!]]", (java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]", (java.lang.CharSequence) "MultiKey[MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ], MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]], null]", (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]", (java.lang.CharSequence) "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ]");
        java.lang.String str6 = charSequenceMultiKey5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiKey[MultiKey[MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], null, MultiKey[null, hi!, hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]], MultiKey[MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ], MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]], null], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ]]" + "'", str6, "MultiKey[MultiKey[MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], null, MultiKey[null, hi!, hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]], MultiKey[MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ], MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]], null], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ]]");
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        java.lang.CharSequence charSequence2 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]", (java.lang.CharSequence) "MultiKey[]", charSequence2);
        java.lang.Object obj4 = charSequenceMultiKey3.readResolve();
        int int5 = charSequenceMultiKey3.size();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "MultiKey[MultiKey[null, hi!, hi!, hi!], MultiKey[], null]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "MultiKey[MultiKey[null, hi!, hi!, hi!], MultiKey[], null]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "MultiKey[MultiKey[null, hi!, hi!, hi!], MultiKey[], null]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]");
        java.lang.Object obj4 = charSequenceMultiKey3.readResolve();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[null, hi!, hi!, hi!], MultiKey[null, hi!, hi!, hi!]]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[null, hi!, hi!, hi!], MultiKey[null, hi!, hi!, hi!]]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[null, hi!, hi!, hi!], MultiKey[null, hi!, hi!, hi!]]");
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[hi!, MultiKey[null, hi!, hi!, hi!], MultiKey[], MultiKey[null, hi!, hi!, hi!], ]", (java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]", (java.lang.CharSequence) "MultiKey[hi!, MultiKey[null, hi!, hi!, hi!], MultiKey[], MultiKey[null, hi!, hi!, hi!], ]");
        java.lang.CharSequence[] charSequenceArray4 = null; // flaky: charSequenceMultiKey3.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey6 = null; // flaky: new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4, false);
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray4);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        java.lang.CharSequence charSequence1 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!], , MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ], MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]], null], MultiKey[hi!, MultiKey[null, hi!, hi!, hi!], MultiKey[], MultiKey[null, hi!, hi!, hi!], ]]", charSequence1);
        java.lang.CharSequence[] charSequenceArray3 = null; // flaky: charSequenceMultiKey2.getKeys();
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray3);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        java.lang.CharSequence[] charSequenceArray0 = new java.lang.CharSequence[] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey1 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray0);
        java.lang.Object obj2 = charSequenceMultiKey1.readResolve();
        java.lang.CharSequence[] charSequenceArray3 = charSequenceMultiKey1.getKeys();
        java.lang.String str4 = charSequenceMultiKey1.toString();
        org.junit.Assert.assertNotNull(charSequenceArray0);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "MultiKey[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "MultiKey[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "MultiKey[]");
        org.junit.Assert.assertNotNull(charSequenceArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MultiKey[]" + "'", str4, "MultiKey[]");
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "MultiKey[]", "", "MultiKey[]", "MultiKey[null, hi!, hi!, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray5);
        java.lang.String[] strArray9 = new java.lang.String[] { "MultiKey[null, hi!, hi!, hi!]", "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]" };
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "MultiKey[]", "", "MultiKey[]", "MultiKey[null, hi!, hi!, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey16 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray15);
        java.lang.String[] strArray22 = new java.lang.String[] { "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", "hi!", "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]", "MultiKey[]", "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]> strArrayMultiKey23 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]>(strArray5, strArray9, strArray15, strArray22);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey25 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence[]) strArray22, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey27 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence[]) strArray22, false);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray22);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "", (java.lang.CharSequence) "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]");
        java.lang.CharSequence charSequence4 = charSequenceMultiKey2.getKey((int) (byte) 1);
        int int5 = charSequenceMultiKey2.size();
        int int6 = charSequenceMultiKey2.size();
        java.lang.String str7 = charSequenceMultiKey2.toString();
        org.junit.Assert.assertEquals("'" + charSequence4 + "' != '" + "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]" + "'", charSequence4, "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]" + "'", str7, "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]");
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
        java.lang.CharSequence charSequence1 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], null, MultiKey[], ]", charSequence1, (java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], null, MultiKey[null, hi!, hi!, hi!]]", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]");
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[MultiKey[MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], null, MultiKey[null, hi!, hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]], MultiKey[MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ], MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]], null], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ]]", (java.lang.CharSequence) "MultiKey[MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], ]]", (java.lang.CharSequence) "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]", (java.lang.CharSequence) "MultiKey[hi!, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]");
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]", (java.lang.CharSequence) "MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]]");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence4 = charSequenceMultiKey2.getKey(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
        java.lang.CharSequence charSequence1 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ]", charSequence1, (java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]", (java.lang.CharSequence) "MultiKey[MultiKey[MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], null, MultiKey[null, hi!, hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]], MultiKey[null, MultiKey[MultiKey[null, hi!, hi!, hi!], MultiKey[], null], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]]]");
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
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
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
        org.apache.commons.collections4.keyvalue.MultiKey[] multiKeyArray1 = new org.apache.commons.collections4.keyvalue.MultiKey[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[] charSequenceMultiKeyArray2 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]) multiKeyArray1;
        org.apache.commons.collections4.keyvalue.MultiKey[] multiKeyArray4 = new org.apache.commons.collections4.keyvalue.MultiKey[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[] charSequenceMultiKeyArray5 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]) multiKeyArray4;
        org.apache.commons.collections4.keyvalue.MultiKey[] multiKeyArray7 = new org.apache.commons.collections4.keyvalue.MultiKey[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[] charSequenceMultiKeyArray8 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]) multiKeyArray7;
        org.apache.commons.collections4.keyvalue.MultiKey[] multiKeyArray10 = new org.apache.commons.collections4.keyvalue.MultiKey[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[] charSequenceMultiKeyArray11 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]) multiKeyArray10;
        org.apache.commons.collections4.keyvalue.MultiKey[][] multiKeyArray13 = new org.apache.commons.collections4.keyvalue.MultiKey[4][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[][] charSequenceMultiKeyArray14 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[][]) multiKeyArray13;
        charSequenceMultiKeyArray14[0] = multiKeyArray1;
        charSequenceMultiKeyArray14[1] = multiKeyArray4;
        charSequenceMultiKeyArray14[2] = charSequenceMultiKeyArray8;
        charSequenceMultiKeyArray14[3] = multiKeyArray10;
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]> charSequenceMultiKeyArrayMultiKey24 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]>(charSequenceMultiKeyArray14, true);
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]> charSequenceMultiKeyArrayMultiKey26 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]>(charSequenceMultiKeyArray14, false);
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]> charSequenceMultiKeyArrayMultiKey27 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]>(charSequenceMultiKeyArray14);
        org.junit.Assert.assertNotNull(multiKeyArray1);
        org.junit.Assert.assertNotNull(charSequenceMultiKeyArray2);
        org.junit.Assert.assertNotNull(multiKeyArray4);
        org.junit.Assert.assertNotNull(charSequenceMultiKeyArray5);
        org.junit.Assert.assertNotNull(multiKeyArray7);
        org.junit.Assert.assertNotNull(charSequenceMultiKeyArray8);
        org.junit.Assert.assertNotNull(multiKeyArray10);
        org.junit.Assert.assertNotNull(charSequenceMultiKeyArray11);
        org.junit.Assert.assertNotNull(multiKeyArray13);
        org.junit.Assert.assertNotNull(charSequenceMultiKeyArray14);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], ]]", (java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], ]", (java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]]", (java.lang.CharSequence) "MultiKey[]", (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]");
        java.lang.Object obj6 = charSequenceMultiKey5.readResolve();
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "MultiKey[MultiKey[MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], ]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], ], MultiKey[MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]], MultiKey[], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "MultiKey[MultiKey[MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], ]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], ], MultiKey[MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]], MultiKey[], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "MultiKey[MultiKey[MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], ]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], ], MultiKey[MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]], MultiKey[], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]]");
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]", (java.lang.CharSequence) "");
        java.lang.CharSequence[] charSequenceArray5 = null; // flaky: charSequenceMultiKey4.getKeys();
        boolean boolean7 = charSequenceMultiKey4.equals((java.lang.Object) (byte) 1);
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] { "", "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]", "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey7 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey8 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey10 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4, false);
        org.junit.Assert.assertNotNull(charSequenceArray4);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] { "", "MultiKey[null, hi!, hi!, hi!]", "hi!", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey8 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4, true);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey9 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey11 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4, true);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey12 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4);
        java.lang.Object obj13 = charSequenceMultiKey12.readResolve();
        int int14 = charSequenceMultiKey12.size();
        org.junit.Assert.assertNotNull(charSequenceArray4);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence2 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence0, (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]", charSequence2, (java.lang.CharSequence) "MultiKey[]", (java.lang.CharSequence) "");
        java.lang.CharSequence[] charSequenceArray6 = null; // flaky: charSequenceMultiKey5.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey8 = null; // flaky: new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray6, true);
        java.lang.CharSequence charSequence9 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey13 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence9, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!");
        java.lang.String str14 = charSequenceMultiKey13.toString();
        java.lang.String str15 = charSequenceMultiKey13.toString();
        java.lang.Object obj16 = null;
        boolean boolean17 = charSequenceMultiKey13.equals(obj16);
        java.lang.CharSequence[] charSequenceArray18 = null; // flaky: charSequenceMultiKey13.getKeys();
        java.lang.CharSequence[] charSequenceArray21 = new java.lang.CharSequence[] { "MultiKey[null, hi!, hi!, hi!]", "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]" };
        java.lang.CharSequence[] charSequenceArray22 = new java.lang.CharSequence[] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey23 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray22);
        java.lang.CharSequence[] charSequenceArray28 = new java.lang.CharSequence[] { "", "MultiKey[null, hi!, hi!, hi!]", "hi!", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey30 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray28, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[]> charSequenceArrayMultiKey31 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[]>(charSequenceArray18, charSequenceArray21, charSequenceArray22, charSequenceArray28);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey33 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray22, true);
        boolean boolean34 = false; // flaky: charSequenceMultiKey8.equals((java.lang.Object) charSequenceArray22);
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray6);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str14, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str15, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray18);
        org.junit.Assert.assertNotNull(charSequenceArray21);
        org.junit.Assert.assertNotNull(charSequenceArray22);
        org.junit.Assert.assertNotNull(charSequenceArray28);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray1 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray2 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray3 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray4 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][][] charSequenceArray5 = new java.lang.CharSequence[][][] { charSequenceArray0, charSequenceArray1, charSequenceArray2, charSequenceArray3, charSequenceArray4 };
        java.lang.CharSequence[][] charSequenceArray6 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray7 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray8 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray9 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray10 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray11 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][][] charSequenceArray12 = new java.lang.CharSequence[][][] { charSequenceArray6, charSequenceArray7, charSequenceArray8, charSequenceArray9, charSequenceArray10, charSequenceArray11 };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[][]> charSequenceArrayMultiKey14 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[][]>(charSequenceArray12, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[][]> charSequenceArrayMultiKey15 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[][]>(charSequenceArray12);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[][][]> charSequenceArrayMultiKey16 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[][][]>(charSequenceArray5, charSequenceArray12);
        java.lang.Class<?> wildcardClass17 = charSequenceArray12.getClass();
        org.junit.Assert.assertNotNull(charSequenceArray0);
        org.junit.Assert.assertNotNull(charSequenceArray1);
        org.junit.Assert.assertNotNull(charSequenceArray2);
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
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[null, hi!, hi!, hi!], MultiKey[null, hi!, hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]]", (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", (java.lang.CharSequence) "MultiKey[MultiKey[MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], ]], MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]]]");
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
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

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]", (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]");
        java.lang.CharSequence[] charSequenceArray4 = null; // flaky: charSequenceMultiKey3.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = null; // flaky: new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4);
        java.lang.CharSequence charSequence6 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey10 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence6, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!");
        java.lang.String str11 = charSequenceMultiKey10.toString();
        java.lang.String str12 = charSequenceMultiKey10.toString();
        java.lang.Object obj13 = null;
        boolean boolean14 = charSequenceMultiKey10.equals(obj13);
        java.lang.Object obj15 = charSequenceMultiKey10.readResolve();
        java.lang.String str16 = charSequenceMultiKey10.toString();
        java.lang.Object obj17 = charSequenceMultiKey10.readResolve();
        java.lang.CharSequence[][] charSequenceArray18 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray19 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray20 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray21 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray22 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray23 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][][] charSequenceArray24 = new java.lang.CharSequence[][][] { charSequenceArray18, charSequenceArray19, charSequenceArray20, charSequenceArray21, charSequenceArray22, charSequenceArray23 };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[][]> charSequenceArrayMultiKey26 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[][]>(charSequenceArray24, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[][]> charSequenceArrayMultiKey27 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[][]>(charSequenceArray24);
        org.apache.commons.collections4.keyvalue.MultiKey[] multiKeyArray29 = new org.apache.commons.collections4.keyvalue.MultiKey[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[] charSequenceMultiKeyArray30 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]) multiKeyArray29;
        org.apache.commons.collections4.keyvalue.MultiKey[] multiKeyArray32 = new org.apache.commons.collections4.keyvalue.MultiKey[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[] charSequenceMultiKeyArray33 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]) multiKeyArray32;
        org.apache.commons.collections4.keyvalue.MultiKey[] multiKeyArray35 = new org.apache.commons.collections4.keyvalue.MultiKey[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[] charSequenceMultiKeyArray36 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]) multiKeyArray35;
        org.apache.commons.collections4.keyvalue.MultiKey[] multiKeyArray38 = new org.apache.commons.collections4.keyvalue.MultiKey[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[] charSequenceMultiKeyArray39 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]) multiKeyArray38;
        org.apache.commons.collections4.keyvalue.MultiKey[][] multiKeyArray41 = new org.apache.commons.collections4.keyvalue.MultiKey[4][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[][] charSequenceMultiKeyArray42 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[][]) multiKeyArray41;
        charSequenceMultiKeyArray42[0] = multiKeyArray29;
        charSequenceMultiKeyArray42[1] = multiKeyArray32;
        charSequenceMultiKeyArray42[2] = charSequenceMultiKeyArray36;
        charSequenceMultiKeyArray42[3] = multiKeyArray38;
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]> charSequenceMultiKeyArrayMultiKey52 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]>(charSequenceMultiKeyArray42, true);
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]> charSequenceMultiKeyArrayMultiKey54 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]>(charSequenceMultiKeyArray42, false);
        java.lang.CharSequence[][] charSequenceArray55 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray56 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray57 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray58 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray59 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray60 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][][] charSequenceArray61 = new java.lang.CharSequence[][][] { charSequenceArray55, charSequenceArray56, charSequenceArray57, charSequenceArray58, charSequenceArray59, charSequenceArray60 };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[][]> charSequenceArrayMultiKey63 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[][]>(charSequenceArray61, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.io.Serializable[]> serializableArrayMultiKey64 = new org.apache.commons.collections4.keyvalue.MultiKey<java.io.Serializable[]>((java.io.Serializable[]) charSequenceArray24, (java.io.Serializable[]) charSequenceMultiKeyArray42, (java.io.Serializable[]) charSequenceArray61);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Object> objMultiKey65 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Object>((java.lang.Object) charSequenceMultiKey5, obj17, (java.lang.Object) charSequenceMultiKeyArray42);
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str11, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str12, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str16, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertNotNull(charSequenceArray18);
        org.junit.Assert.assertNotNull(charSequenceArray19);
        org.junit.Assert.assertNotNull(charSequenceArray20);
        org.junit.Assert.assertNotNull(charSequenceArray21);
        org.junit.Assert.assertNotNull(charSequenceArray22);
        org.junit.Assert.assertNotNull(charSequenceArray23);
        org.junit.Assert.assertNotNull(charSequenceArray24);
        org.junit.Assert.assertNotNull(multiKeyArray29);
        org.junit.Assert.assertNotNull(charSequenceMultiKeyArray30);
        org.junit.Assert.assertNotNull(multiKeyArray32);
        org.junit.Assert.assertNotNull(charSequenceMultiKeyArray33);
        org.junit.Assert.assertNotNull(multiKeyArray35);
        org.junit.Assert.assertNotNull(charSequenceMultiKeyArray36);
        org.junit.Assert.assertNotNull(multiKeyArray38);
        org.junit.Assert.assertNotNull(charSequenceMultiKeyArray39);
        org.junit.Assert.assertNotNull(multiKeyArray41);
        org.junit.Assert.assertNotNull(charSequenceMultiKeyArray42);
        org.junit.Assert.assertNotNull(charSequenceArray55);
        org.junit.Assert.assertNotNull(charSequenceArray56);
        org.junit.Assert.assertNotNull(charSequenceArray57);
        org.junit.Assert.assertNotNull(charSequenceArray58);
        org.junit.Assert.assertNotNull(charSequenceArray59);
        org.junit.Assert.assertNotNull(charSequenceArray60);
        org.junit.Assert.assertNotNull(charSequenceArray61);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
        java.lang.CharSequence charSequence0 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence0, (java.lang.CharSequence) "MultiKey[MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[null, hi!, hi!, hi!], MultiKey[null, hi!, hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]]", (java.lang.CharSequence) "MultiKey[]");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence5 = charSequenceMultiKey3.getKey((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]", (java.lang.CharSequence) "MultiKey[MultiKey[null, hi!, hi!, hi!], MultiKey[], null]", (java.lang.CharSequence) "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ]", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]", (java.lang.CharSequence) "MultiKey[MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ], MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]], null]");
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test420");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]", (java.lang.CharSequence) "MultiKey[]", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]", (java.lang.CharSequence) "");
        java.lang.CharSequence[] charSequenceArray6 = null; // flaky: charSequenceMultiKey5.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey8 = null; // flaky: new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray6, false);
        java.lang.CharSequence[] charSequenceArray9 = null; // flaky: charSequenceMultiKey8.getKeys();
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray6);
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray9);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence[] charSequenceArray6 = new java.lang.CharSequence[] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey7 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray6);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey8 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray6);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey10 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray6, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey11 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray6);
        boolean boolean12 = charSequenceMultiKey5.equals((java.lang.Object) charSequenceArray6);
        java.lang.String str13 = charSequenceMultiKey5.toString();
        java.lang.CharSequence charSequence15 = charSequenceMultiKey5.getKey(3);
        org.junit.Assert.assertNotNull(charSequenceArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "MultiKey[MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], hi!, MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]], hi!]" + "'", str13, "MultiKey[MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], hi!, MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]], hi!]");
        org.junit.Assert.assertEquals("'" + charSequence15 + "' != '" + "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]" + "'", charSequence15, "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]");
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[MultiKey[MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ], MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]], null], MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], null, MultiKey[], ], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], MultiKey[MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], ]], MultiKey[]]", (java.lang.CharSequence) "MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]]");
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test423");
        java.lang.String[] strArray5 = new java.lang.String[] { "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[null, hi!, hi!, hi!], MultiKey[null, hi!, hi!, hi!]]", "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ]", "hi!", "", "MultiKey[null, hi!, hi!, hi!]" };
        java.lang.String[] strArray11 = new java.lang.String[] { "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[null, hi!, hi!, hi!], MultiKey[null, hi!, hi!, hi!]]", "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ]", "hi!", "", "MultiKey[null, hi!, hi!, hi!]" };
        java.lang.String[] strArray17 = new java.lang.String[] { "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[null, hi!, hi!, hi!], MultiKey[null, hi!, hi!, hi!]]", "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ]", "hi!", "", "MultiKey[null, hi!, hi!, hi!]" };
        java.lang.String[] strArray23 = new java.lang.String[] { "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[null, hi!, hi!, hi!], MultiKey[null, hi!, hi!, hi!]]", "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ]", "hi!", "", "MultiKey[null, hi!, hi!, hi!]" };
        java.lang.String[] strArray29 = new java.lang.String[] { "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[null, hi!, hi!, hi!], MultiKey[null, hi!, hi!, hi!]]", "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ]", "hi!", "", "MultiKey[null, hi!, hi!, hi!]" };
        java.lang.String[] strArray35 = new java.lang.String[] { "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[null, hi!, hi!, hi!], MultiKey[null, hi!, hi!, hi!]]", "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ]", "hi!", "", "MultiKey[null, hi!, hi!, hi!]" };
        java.lang.String[][] strArray36 = new java.lang.String[][] { strArray5, strArray11, strArray17, strArray23, strArray29, strArray35 };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]> strArrayMultiKey38 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]>(strArray36, false);
        java.lang.String[] strArray39 = new java.lang.String[] {};
        java.lang.String[] strArray40 = new java.lang.String[] {};
        java.lang.String[] strArray41 = new java.lang.String[] {};
        java.lang.String[] strArray42 = new java.lang.String[] {};
        java.lang.String[][] strArray43 = new java.lang.String[][] { strArray39, strArray40, strArray41, strArray42 };
        java.lang.String[] strArray46 = new java.lang.String[] { "MultiKey[MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], ]]", "MultiKey[MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!], MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]], null, hi!, null]" };
        java.lang.String[] strArray49 = new java.lang.String[] { "MultiKey[MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], ]]", "MultiKey[MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!], MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]], null, hi!, null]" };
        java.lang.String[][] strArray50 = new java.lang.String[][] { strArray46, strArray49 };
        java.lang.String[][] strArray51 = new java.lang.String[][] {};
        java.lang.String[][] strArray52 = new java.lang.String[][] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[][]> strArrayMultiKey53 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[][]>(strArray43, strArray50, strArray51, strArray52);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]> strArrayMultiKey55 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]>(strArray43, false);
        java.lang.CharSequence[][] charSequenceArray56 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[][]> charSequenceArrayMultiKey57 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[][]>((java.lang.CharSequence[][]) strArray36, (java.lang.CharSequence[][]) strArray43, charSequenceArray56);
        java.lang.String[][] strArray58 = null;
        java.lang.String[] strArray59 = new java.lang.String[] {};
        java.lang.String[] strArray60 = new java.lang.String[] {};
        java.lang.String[] strArray61 = new java.lang.String[] {};
        java.lang.String[] strArray62 = new java.lang.String[] {};
        java.lang.String[][] strArray63 = new java.lang.String[][] { strArray59, strArray60, strArray61, strArray62 };
        java.lang.String[] strArray66 = new java.lang.String[] { "MultiKey[MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], ]]", "MultiKey[MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!], MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]], null, hi!, null]" };
        java.lang.String[] strArray69 = new java.lang.String[] { "MultiKey[MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], ]]", "MultiKey[MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!], MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]], null, hi!, null]" };
        java.lang.String[][] strArray70 = new java.lang.String[][] { strArray66, strArray69 };
        java.lang.String[][] strArray71 = new java.lang.String[][] {};
        java.lang.String[][] strArray72 = new java.lang.String[][] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[][]> strArrayMultiKey73 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[][]>(strArray63, strArray70, strArray71, strArray72);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[][]> strArrayMultiKey74 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[][]>(strArray36, strArray58, strArray71);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertNotNull(strArray72);
    }
}
