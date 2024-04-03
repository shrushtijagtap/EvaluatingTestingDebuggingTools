package org.apache.commons.lang3;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RandoopRegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test01");
        java.util.Locale locale0 = null;
        boolean boolean1 = org.apache.commons.lang3.LocaleUtils.isAvailableLocale(locale0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test02");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = org.apache.commons.lang3.LocaleUtils.toLocale("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test03");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = org.apache.commons.lang3.LocaleUtils.toLocale("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test04");
        org.apache.commons.lang3.LocaleUtils localeUtils0 = new org.apache.commons.lang3.LocaleUtils();
        java.lang.Class<?> wildcardClass1 = localeUtils0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test05");
        java.util.Set<java.util.Locale> localeSet0 = org.apache.commons.lang3.LocaleUtils.availableLocaleSet();
        java.lang.Class<?> wildcardClass1 = localeSet0.getClass();
        org.junit.Assert.assertNotNull(localeSet0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test06");
        java.util.Locale locale0 = null;
        java.util.Locale locale1 = null;
        java.util.List<java.util.Locale> localeList2 = org.apache.commons.lang3.LocaleUtils.localeLookupList(locale0, locale1);
        java.lang.Class<?> wildcardClass3 = localeList2.getClass();
        org.junit.Assert.assertNotNull(localeList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test07");
        java.util.List<java.util.Locale> localeList0 = org.apache.commons.lang3.LocaleUtils.availableLocaleList();
        java.lang.Class<?> wildcardClass1 = localeList0.getClass();
        org.junit.Assert.assertNotNull(localeList0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test08");
        java.util.List<java.util.Locale> localeList1 = org.apache.commons.lang3.LocaleUtils.countriesByLanguage("");
        java.lang.Class<?> wildcardClass2 = localeList1.getClass();
        org.junit.Assert.assertNotNull(localeList1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test09");
        java.util.List<java.util.Locale> localeList1 = org.apache.commons.lang3.LocaleUtils.languagesByCountry("");
        java.lang.Class<?> wildcardClass2 = localeList1.getClass();
        org.junit.Assert.assertNotNull(localeList1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test10");
        java.util.List<java.util.Locale> localeList1 = org.apache.commons.lang3.LocaleUtils.languagesByCountry("hi!");
        java.lang.Class<?> wildcardClass2 = localeList1.getClass();
        org.junit.Assert.assertNotNull(localeList1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test11");
        java.util.List<java.util.Locale> localeList1 = org.apache.commons.lang3.LocaleUtils.countriesByLanguage("hi!");
        java.lang.Class<?> wildcardClass2 = localeList1.getClass();
        org.junit.Assert.assertNotNull(localeList1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test12");
        java.util.Locale locale0 = null;
        java.util.List<java.util.Locale> localeList1 = org.apache.commons.lang3.LocaleUtils.localeLookupList(locale0);
        java.lang.Class<?> wildcardClass2 = localeList1.getClass();
        org.junit.Assert.assertNotNull(localeList1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }
}

