package edu.harvard.h2ms;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RandoopRegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        edu.harvard.h2ms.domain.core.User user0 = new edu.harvard.h2ms.domain.core.User();
        String str1 = user0.getType();
        java.util.Date date2 = user0.getCreatedOn();
        String str3 = user0.toString();
        boolean boolean4 = user0.isEnabled();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null" + "'", str3, "User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        edu.harvard.h2ms.domain.core.User user0 = new edu.harvard.h2ms.domain.core.User();
        String str1 = user0.getType();
        String str2 = user0.getFirstName();
        Class<?> wildcardClass3 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        edu.harvard.h2ms.domain.core.User user0 = new edu.harvard.h2ms.domain.core.User();
        String str1 = user0.getType();
        java.util.Date date2 = user0.getCreatedOn();
        String str3 = user0.toString();
        user0.setId((Long) 0L);
        java.util.Collection<? extends org.springframework.security.core.GrantedAuthority> wildcardCollection6 = user0.getAuthorities();
        String str7 = user0.getResetToken();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null" + "'", str3, "User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null");
        org.junit.Assert.assertNotNull(wildcardCollection6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        edu.harvard.h2ms.domain.core.User user0 = new edu.harvard.h2ms.domain.core.User();
        String str1 = user0.getType();
        user0.setEnabled(true);
        String str4 = user0.getPassword();
        Class<?> wildcardClass5 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        edu.harvard.h2ms.domain.core.User user6 = new edu.harvard.h2ms.domain.core.User("", "", "hi!", "", "hi!", "");
        user6.setPassword("User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null");
        String str9 = user6.getResetToken();
        java.util.Date date10 = user6.getCreatedOn();
        // The following exception was thrown during execution in test generation
        try {
            Class<?> wildcardClass11 = date10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(date10);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        edu.harvard.h2ms.domain.core.User user6 = new edu.harvard.h2ms.domain.core.User("", "", "hi!", "", "hi!", "");
        user6.setPassword("User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null");
        String str9 = user6.getResetToken();
        java.util.Date date10 = null;
        user6.setCreatedOn(date10);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        edu.harvard.h2ms.domain.core.User user6 = new edu.harvard.h2ms.domain.core.User("", "", "hi!", "", "hi!", "");
        user6.setPassword("User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null");
        String str9 = user6.getResetToken();
        user6.setMiddleName("hi!");
        java.util.Date date12 = user6.getLastLogin();
        user6.setNotificationFrequency("");
        String str15 = user6.getResetToken();
        boolean boolean16 = user6.isAccountNonLocked();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(date12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        edu.harvard.h2ms.domain.core.User user0 = new edu.harvard.h2ms.domain.core.User();
        String str1 = user0.getType();
        String str2 = user0.getFirstName();
        String str3 = user0.getLastName();
        Long long4 = user0.getId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(long4);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        edu.harvard.h2ms.domain.core.User user6 = new edu.harvard.h2ms.domain.core.User("", "", "hi!", "", "hi!", "");
        String str7 = user6.getEmail();
        user6.setFirstName("User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        edu.harvard.h2ms.domain.core.User user6 = new edu.harvard.h2ms.domain.core.User("", "", "hi!", "User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null", "hi!", "User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null");
        user6.setEmail("");
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        edu.harvard.h2ms.domain.core.User user6 = new edu.harvard.h2ms.domain.core.User("", "", "hi!", "User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null", "hi!", "User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null");
        java.util.Date date7 = null;
        user6.setLastLogin(date7);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        edu.harvard.h2ms.domain.core.User user0 = new edu.harvard.h2ms.domain.core.User();
        String str1 = user0.getType();
        String str2 = user0.getFirstName();
        String str3 = user0.getLastName();
        String str4 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        edu.harvard.h2ms.domain.core.User user6 = new edu.harvard.h2ms.domain.core.User("", "", "hi!", "", "hi!", "");
        user6.setPassword("User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null");
        String str9 = user6.toString();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User [id=null, firstName=, middleName=, lastName=hi!, email=, type, notificationFrequency=null" + "'", str9, "User [id=null, firstName=, middleName=, lastName=hi!, email=, type, notificationFrequency=null");
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        edu.harvard.h2ms.domain.core.User user6 = new edu.harvard.h2ms.domain.core.User("", "", "hi!", "", "hi!", "");
        user6.setPassword("User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null");
        String str9 = user6.getResetToken();
        user6.setMiddleName("hi!");
        user6.setPassword("hi!");
        boolean boolean14 = user6.isEnabled();
        String str15 = user6.getNotificationFrequency();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        edu.harvard.h2ms.domain.core.User user0 = new edu.harvard.h2ms.domain.core.User();
        String str1 = user0.getType();
        java.util.Date date2 = user0.getCreatedOn();
        String str3 = user0.toString();
        user0.setId((Long) 0L);
        String str6 = user0.getEmail();
        user0.setId((Long) 1L);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null" + "'", str3, "User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        edu.harvard.h2ms.domain.core.User user6 = new edu.harvard.h2ms.domain.core.User("", "", "hi!", "", "hi!", "");
        user6.setPassword("User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null");
        java.util.Date date9 = null;
        user6.setLastLogin(date9);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        edu.harvard.h2ms.domain.core.User user0 = new edu.harvard.h2ms.domain.core.User();
        String str1 = user0.getType();
        java.util.Date date2 = user0.getCreatedOn();
        String str3 = user0.toString();
        user0.setId((Long) 0L);
        String str6 = user0.getFirstName();
        Class<?> wildcardClass7 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null" + "'", str3, "User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        edu.harvard.h2ms.domain.core.User user6 = new edu.harvard.h2ms.domain.core.User("", "", "hi!", "", "hi!", "");
        user6.setPassword("User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null");
        String str9 = user6.getResetToken();
        user6.setMiddleName("hi!");
        user6.setMiddleName("hi!");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        edu.harvard.h2ms.domain.core.User user6 = new edu.harvard.h2ms.domain.core.User("", "", "hi!", "", "hi!", "");
        String str7 = user6.getUsername();
        boolean boolean8 = user6.isAccountNonLocked();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        edu.harvard.h2ms.domain.core.User user0 = new edu.harvard.h2ms.domain.core.User();
        String str1 = user0.getType();
        java.util.Date date2 = user0.getCreatedOn();
        String str3 = user0.toString();
        java.util.Date date4 = null;
        user0.setLastLogin(date4);
        user0.setEmail("");
        Class<?> wildcardClass8 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null" + "'", str3, "User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        edu.harvard.h2ms.domain.core.User user0 = new edu.harvard.h2ms.domain.core.User();
        String str1 = user0.getType();
        java.util.Date date2 = user0.getCreatedOn();
        String str3 = user0.toString();
        java.util.Date date4 = null;
        user0.setLastLogin(date4);
        boolean boolean6 = user0.isAccountNonLocked();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null" + "'", str3, "User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        edu.harvard.h2ms.domain.core.User user0 = new edu.harvard.h2ms.domain.core.User();
        String str1 = user0.getType();
        String str2 = user0.getFirstName();
        String str3 = user0.getLastName();
        user0.setType("User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null");
        user0.setMiddleName("User [id=null, firstName=, middleName=, lastName=hi!, email=, type, notificationFrequency=null");
        String str8 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        edu.harvard.h2ms.domain.core.User user0 = new edu.harvard.h2ms.domain.core.User();
        java.util.Date date1 = null;
        user0.setLastLogin(date1);
        user0.setEnabled(false);
        user0.setFirstName("hi!");
        String str7 = user0.getLastName();
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        edu.harvard.h2ms.domain.core.User user0 = new edu.harvard.h2ms.domain.core.User();
        String str1 = user0.getType();
        java.util.Date date2 = user0.getCreatedOn();
        String str3 = user0.toString();
        user0.setId((Long) 0L);
        String str6 = user0.getUsername();
        edu.harvard.h2ms.domain.core.Role[] roleArray7 = new edu.harvard.h2ms.domain.core.Role[] {};
        java.util.LinkedHashSet<edu.harvard.h2ms.domain.core.Role> roleSet8 = new java.util.LinkedHashSet<edu.harvard.h2ms.domain.core.Role>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<edu.harvard.h2ms.domain.core.Role>) roleSet8, roleArray7);
        user0.setRoles((java.util.Set<edu.harvard.h2ms.domain.core.Role>) roleSet8);
        user0.setNotificationFrequency("");
        java.util.Collection<? extends org.springframework.security.core.GrantedAuthority> wildcardCollection13 = user0.getAuthorities();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null" + "'", str3, "User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(roleArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardCollection13);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        edu.harvard.h2ms.domain.core.User user0 = new edu.harvard.h2ms.domain.core.User();
        java.util.Date date1 = null;
        user0.setLastLogin(date1);
        user0.setLastName("User [id=0, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null");
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        edu.harvard.h2ms.domain.core.User user6 = new edu.harvard.h2ms.domain.core.User("", "", "hi!", "", "hi!", "");
        user6.setPassword("User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null");
        String str9 = user6.getResetToken();
        user6.setMiddleName("hi!");
        java.util.Date date12 = user6.getLastLogin();
        user6.setNotificationFrequency("");
        String str15 = user6.getResetToken();
        String str16 = user6.getFirstName();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(date12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        edu.harvard.h2ms.domain.core.User user0 = new edu.harvard.h2ms.domain.core.User();
        String str1 = user0.getType();
        java.util.Date date2 = user0.getCreatedOn();
        String str3 = user0.toString();
        user0.setId((Long) 0L);
        String str6 = user0.getEmail();
        String str7 = user0.toString();
        boolean boolean8 = user0.isAccountNonLocked();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null" + "'", str3, "User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User [id=0, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null" + "'", str7, "User [id=0, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        edu.harvard.h2ms.domain.core.User user0 = new edu.harvard.h2ms.domain.core.User();
        java.util.Date date1 = user0.getLastLogin();
        user0.setNotificationFrequency("hi!");
        String str4 = user0.getMiddleName();
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        edu.harvard.h2ms.domain.core.User user0 = new edu.harvard.h2ms.domain.core.User();
        String str1 = user0.getType();
        java.util.Date date2 = user0.getCreatedOn();
        String str3 = user0.toString();
        user0.setId((Long) 0L);
        String str6 = user0.getType();
        java.util.Date date7 = null;
        user0.setCreatedOn(date7);
        java.util.Date date9 = user0.getLastLogin();
        user0.setMiddleName("hi!");
        user0.setLastName("User [id=0, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null" + "'", str3, "User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(date9);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        edu.harvard.h2ms.domain.core.User user6 = new edu.harvard.h2ms.domain.core.User("User [id=0, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null", "User [id=0, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null", "User [id=null, firstName=, middleName=, lastName=hi!, email=, type, notificationFrequency=null", "hi!", "", "");
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        edu.harvard.h2ms.domain.core.User user0 = new edu.harvard.h2ms.domain.core.User();
        String str1 = user0.getType();
        java.util.Date date2 = user0.getCreatedOn();
        String str3 = user0.toString();
        user0.setId((Long) 0L);
        String str6 = user0.getUsername();
        edu.harvard.h2ms.domain.core.Role[] roleArray7 = new edu.harvard.h2ms.domain.core.Role[] {};
        java.util.LinkedHashSet<edu.harvard.h2ms.domain.core.Role> roleSet8 = new java.util.LinkedHashSet<edu.harvard.h2ms.domain.core.Role>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<edu.harvard.h2ms.domain.core.Role>) roleSet8, roleArray7);
        user0.setRoles((java.util.Set<edu.harvard.h2ms.domain.core.Role>) roleSet8);
        String str11 = user0.getType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null" + "'", str3, "User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(roleArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        edu.harvard.h2ms.domain.core.User user0 = new edu.harvard.h2ms.domain.core.User();
        String str1 = user0.getType();
        String str2 = user0.getType();
        user0.setId((Long) 1L);
        java.util.Date date5 = user0.getLastLogin();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(date5);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        edu.harvard.h2ms.domain.core.User user6 = new edu.harvard.h2ms.domain.core.User("hi!", "", "", "User [id=0, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null", "", "");
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        edu.harvard.h2ms.domain.core.User user6 = new edu.harvard.h2ms.domain.core.User("hi!", "", "User [id=0, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null", "User [id=0, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null", "User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null", "User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null");
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        edu.harvard.h2ms.domain.core.User user0 = new edu.harvard.h2ms.domain.core.User();
        String str1 = user0.getType();
        String str2 = user0.getFirstName();
        String str3 = user0.getLastName();
        user0.setType("User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null");
        user0.setMiddleName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        edu.harvard.h2ms.domain.core.User user0 = new edu.harvard.h2ms.domain.core.User();
        String str1 = user0.getType();
        String str2 = user0.getFirstName();
        String str3 = user0.getLastName();
        boolean boolean4 = user0.isAccountNonExpired();
        user0.setResetToken("User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        edu.harvard.h2ms.domain.core.User user6 = new edu.harvard.h2ms.domain.core.User("", "", "", "User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null", "hi!", "");
        edu.harvard.h2ms.domain.core.User user7 = new edu.harvard.h2ms.domain.core.User();
        String str8 = user7.getType();
        java.util.Date date9 = user7.getCreatedOn();
        String str10 = user7.toString();
        user7.setId((Long) 0L);
        user7.setType("hi!");
        edu.harvard.h2ms.domain.core.User user21 = new edu.harvard.h2ms.domain.core.User("", "", "hi!", "", "hi!", "");
        user21.setPassword("User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null");
        String str24 = user21.getResetToken();
        java.util.Date date25 = user21.getLastLogin();
        edu.harvard.h2ms.domain.core.Role[] roleArray26 = new edu.harvard.h2ms.domain.core.Role[] {};
        java.util.LinkedHashSet<edu.harvard.h2ms.domain.core.Role> roleSet27 = new java.util.LinkedHashSet<edu.harvard.h2ms.domain.core.Role>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<edu.harvard.h2ms.domain.core.Role>) roleSet27, roleArray26);
        user21.setRoles((java.util.Set<edu.harvard.h2ms.domain.core.Role>) roleSet27);
        user7.setRoles((java.util.Set<edu.harvard.h2ms.domain.core.Role>) roleSet27);
        user6.setRoles((java.util.Set<edu.harvard.h2ms.domain.core.Role>) roleSet27);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(date9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null" + "'", str10, "User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null");
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(date25);
        org.junit.Assert.assertNotNull(roleArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        edu.harvard.h2ms.domain.core.User user0 = new edu.harvard.h2ms.domain.core.User();
        String str1 = user0.getType();
        java.util.Date date2 = user0.getCreatedOn();
        String str3 = user0.toString();
        java.util.Date date4 = null;
        user0.setLastLogin(date4);
        user0.setEmail("");
        String str8 = user0.getUsername();
        user0.setMiddleName("User [id=0, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null" + "'", str3, "User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        edu.harvard.h2ms.domain.core.User user6 = new edu.harvard.h2ms.domain.core.User("", "", "hi!", "", "hi!", "");
        String str7 = user6.getEmail();
        user6.setEmail("hi!");
        java.util.Date date10 = null;
        user6.setCreatedOn(date10);
        user6.setType("User [id=0, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null");
        String str14 = user6.getPassword();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "$2a$10$Czo3AXsg2th3PUHKU6rNmeLk5yFWS0ZQ5Cx4q1JTyzMO/xdkhSHkK" + "'", str14, "$2a$10$Czo3AXsg2th3PUHKU6rNmeLk5yFWS0ZQ5Cx4q1JTyzMO/xdkhSHkK");
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        edu.harvard.h2ms.domain.core.User user0 = new edu.harvard.h2ms.domain.core.User();
        String str1 = user0.getType();
        boolean boolean2 = user0.isAccountNonLocked();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        edu.harvard.h2ms.domain.core.User user0 = new edu.harvard.h2ms.domain.core.User();
        String str1 = user0.getType();
        String str2 = user0.getType();
        user0.setId((Long) 1L);
        java.util.Collection<? extends org.springframework.security.core.GrantedAuthority> wildcardCollection5 = user0.getAuthorities();
        user0.setType("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(wildcardCollection5);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        edu.harvard.h2ms.domain.core.User user0 = new edu.harvard.h2ms.domain.core.User();
        String str1 = user0.getType();
        String str2 = user0.getType();
        user0.setId((Long) 1L);
        java.util.Collection<? extends org.springframework.security.core.GrantedAuthority> wildcardCollection5 = user0.getAuthorities();
        user0.setResetToken("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(wildcardCollection5);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        edu.harvard.h2ms.domain.core.User user6 = new edu.harvard.h2ms.domain.core.User("", "", "hi!", "", "hi!", "");
        user6.setPassword("User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null");
        String str9 = user6.getResetToken();
        java.util.Date date10 = user6.getLastLogin();
        user6.setPassword("User [id=null, firstName=, middleName=, lastName=hi!, email=, type, notificationFrequency=null");
        user6.setNotificationFrequency("User [id=0, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(date10);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        edu.harvard.h2ms.domain.core.User user0 = new edu.harvard.h2ms.domain.core.User();
        String str1 = user0.getType();
        java.util.Date date2 = user0.getCreatedOn();
        String str3 = user0.toString();
        user0.setId((Long) 0L);
        java.util.Collection<? extends org.springframework.security.core.GrantedAuthority> wildcardCollection6 = user0.getAuthorities();
        java.util.Date date7 = null;
        user0.setCreatedOn(date7);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null" + "'", str3, "User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null");
        org.junit.Assert.assertNotNull(wildcardCollection6);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        edu.harvard.h2ms.domain.core.User user6 = new edu.harvard.h2ms.domain.core.User("", "", "hi!", "", "hi!", "");
        String str7 = user6.getEmail();
        user6.setEmail("hi!");
        java.util.Date date10 = null;
        user6.setCreatedOn(date10);
        user6.setType("User [id=0, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null");
        boolean boolean14 = user6.isAccountNonLocked();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        edu.harvard.h2ms.domain.core.User user0 = new edu.harvard.h2ms.domain.core.User();
        String str1 = user0.getType();
        java.util.Date date2 = user0.getCreatedOn();
        String str3 = user0.toString();
        user0.setId((Long) 0L);
        String str6 = user0.getEmail();
        java.util.Set<edu.harvard.h2ms.domain.core.Role> roleSet7 = user0.getRoles();
        boolean boolean8 = user0.isAccountNonLocked();
        String str9 = user0.getResetToken();
        user0.setNotificationFrequency("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null" + "'", str3, "User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(roleSet7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        edu.harvard.h2ms.domain.core.User user0 = new edu.harvard.h2ms.domain.core.User();
        String str1 = user0.getType();
        user0.setEnabled(true);
        String str4 = user0.getPassword();
        String str5 = user0.getResetToken();
        java.util.Date date6 = user0.getLastLogin();
        user0.setFirstName("");
        user0.setFirstName("$2a$10$Czo3AXsg2th3PUHKU6rNmeLk5yFWS0ZQ5Cx4q1JTyzMO/xdkhSHkK");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(date6);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        edu.harvard.h2ms.domain.core.User user0 = new edu.harvard.h2ms.domain.core.User();
        String str1 = user0.getType();
        String str2 = user0.getFirstName();
        String str3 = user0.getLastName();
        user0.setType("User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null");
        user0.setMiddleName("User [id=null, firstName=, middleName=, lastName=hi!, email=, type, notificationFrequency=null");
        user0.setLastName("User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        edu.harvard.h2ms.domain.core.User user6 = new edu.harvard.h2ms.domain.core.User("", "", "hi!", "", "hi!", "");
        String str7 = user6.getEmail();
        user6.setEmail("hi!");
        String str10 = user6.getMiddleName();
        user6.setFirstName("User [id=null, firstName=, middleName=, lastName=hi!, email=, type, notificationFrequency=null");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        edu.harvard.h2ms.domain.core.User user0 = new edu.harvard.h2ms.domain.core.User();
        java.util.Date date1 = null;
        user0.setLastLogin(date1);
        user0.setEnabled(false);
        String str5 = user0.getType();
        String str6 = user0.getPassword();
        String str7 = user0.getLastName();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        edu.harvard.h2ms.domain.core.User user0 = new edu.harvard.h2ms.domain.core.User();
        String str1 = user0.getType();
        java.util.Date date2 = user0.getCreatedOn();
        String str3 = user0.toString();
        user0.setId((Long) 0L);
        String str6 = user0.getUsername();
        edu.harvard.h2ms.domain.core.Role[] roleArray7 = new edu.harvard.h2ms.domain.core.Role[] {};
        java.util.LinkedHashSet<edu.harvard.h2ms.domain.core.Role> roleSet8 = new java.util.LinkedHashSet<edu.harvard.h2ms.domain.core.Role>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<edu.harvard.h2ms.domain.core.Role>) roleSet8, roleArray7);
        user0.setRoles((java.util.Set<edu.harvard.h2ms.domain.core.Role>) roleSet8);
        user0.setNotificationFrequency("");
        String str13 = user0.getUsername();
        user0.setPassword("User [id=null, firstName=, middleName=, lastName=hi!, email=, type, notificationFrequency=null");
        String str16 = user0.getType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null" + "'", str3, "User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(roleArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        edu.harvard.h2ms.domain.core.User user0 = new edu.harvard.h2ms.domain.core.User();
        java.util.Collection<? extends org.springframework.security.core.GrantedAuthority> wildcardCollection1 = user0.getAuthorities();
        org.junit.Assert.assertNotNull(wildcardCollection1);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        edu.harvard.h2ms.domain.core.User user0 = new edu.harvard.h2ms.domain.core.User();
        String str1 = user0.getType();
        java.util.Date date2 = user0.getCreatedOn();
        String str3 = user0.toString();
        String str4 = user0.getMiddleName();
        String str5 = user0.getMiddleName();
        user0.setEnabled(true);
        user0.setEnabled(false);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null" + "'", str3, "User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        edu.harvard.h2ms.domain.core.User user0 = new edu.harvard.h2ms.domain.core.User();
        String str1 = user0.getType();
        java.util.Date date2 = user0.getCreatedOn();
        String str3 = user0.toString();
        java.util.Date date4 = null;
        user0.setLastLogin(date4);
        String str6 = user0.toString();
        user0.setLastName("");
        String str9 = user0.getResetToken();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null" + "'", str3, "User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null" + "'", str6, "User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        edu.harvard.h2ms.domain.core.User user6 = new edu.harvard.h2ms.domain.core.User("", "", "hi!", "User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null", "hi!", "User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null");
        String str7 = user6.getFirstName();
        user6.setEmail("");
        String str10 = user6.getNotificationFrequency();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        edu.harvard.h2ms.domain.core.User user6 = new edu.harvard.h2ms.domain.core.User("User [id=null, firstName=, middleName=, lastName=hi!, email=, type, notificationFrequency=null", "User [id=0, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null", "", "User [id=0, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null", "", "User [id=null, firstName=, middleName=, lastName=hi!, email=, type, notificationFrequency=null");
        user6.setResetToken("");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        edu.harvard.h2ms.domain.core.User user0 = new edu.harvard.h2ms.domain.core.User();
        String str1 = user0.getType();
        java.util.Date date2 = user0.getCreatedOn();
        String str3 = user0.toString();
        user0.setId((Long) 0L);
        String str6 = user0.getEmail();
        user0.setPassword("User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null");
        String str9 = user0.getEmail();
        java.util.Date date10 = user0.getLastLogin();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null" + "'", str3, "User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(date10);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        edu.harvard.h2ms.domain.core.User user0 = new edu.harvard.h2ms.domain.core.User();
        String str1 = user0.getType();
        user0.setEnabled(true);
        String str4 = user0.getFirstName();
        boolean boolean5 = user0.isEnabled();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        edu.harvard.h2ms.domain.core.User user0 = new edu.harvard.h2ms.domain.core.User();
        String str1 = user0.getType();
        String str2 = user0.getType();
        Long long3 = user0.getId();
        java.util.Date date4 = null;
        user0.setCreatedOn(date4);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(long3);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        edu.harvard.h2ms.domain.core.User user0 = new edu.harvard.h2ms.domain.core.User();
        String str1 = user0.getType();
        String str2 = user0.getType();
        Long long3 = user0.getId();
        user0.setLastName("");
        java.util.Collection<? extends org.springframework.security.core.GrantedAuthority> wildcardCollection6 = user0.getAuthorities();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNotNull(wildcardCollection6);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        edu.harvard.h2ms.domain.core.User user6 = new edu.harvard.h2ms.domain.core.User("", "", "hi!", "", "hi!", "");
        user6.setPassword("User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null");
        String str9 = user6.getResetToken();
        user6.setMiddleName("hi!");
        java.util.Date date12 = user6.getLastLogin();
        user6.setNotificationFrequency("");
        String str15 = user6.getNotificationFrequency();
        user6.setId((Long) 0L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(date12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        edu.harvard.h2ms.domain.core.User user0 = new edu.harvard.h2ms.domain.core.User();
        String str1 = user0.getType();
        java.util.Date date2 = user0.getCreatedOn();
        String str3 = user0.getResetToken();
        String str4 = user0.getType();
        String str5 = user0.getType();
        user0.setEmail("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        edu.harvard.h2ms.domain.core.User user0 = new edu.harvard.h2ms.domain.core.User();
        String str1 = user0.getType();
        java.util.Date date2 = user0.getCreatedOn();
        String str3 = user0.toString();
        user0.setId((Long) 0L);
        String str6 = user0.getEmail();
        user0.setPassword("User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null");
        String str9 = user0.getEmail();
        java.util.Date date10 = user0.getCreatedOn();
        user0.setEnabled(true);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null" + "'", str3, "User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(date10);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        edu.harvard.h2ms.domain.core.User user6 = new edu.harvard.h2ms.domain.core.User("User [id=0, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null", "hi!", "hi!", "User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null", "User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null", "User [id=0, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null");
        user6.setEnabled(true);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        edu.harvard.h2ms.domain.core.User user6 = new edu.harvard.h2ms.domain.core.User("", "", "hi!", "", "hi!", "");
        user6.setPassword("User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null");
        String str9 = user6.getResetToken();
        java.util.Date date10 = user6.getLastLogin();
        user6.setPassword("User [id=null, firstName=, middleName=, lastName=hi!, email=, type, notificationFrequency=null");
        String str13 = user6.getMiddleName();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(date10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        edu.harvard.h2ms.domain.core.User user6 = new edu.harvard.h2ms.domain.core.User("", "User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null", "", "User [id=0, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null", "hi!", "User [id=0, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null");
        user6.setPassword("User [id=0, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null");
        String str9 = user6.getMiddleName();
        java.util.Date date10 = null;
        user6.setCreatedOn(date10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null" + "'", str9, "User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null");
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        edu.harvard.h2ms.domain.core.User user0 = new edu.harvard.h2ms.domain.core.User();
        String str1 = user0.getType();
        String str2 = user0.getFirstName();
        String str3 = user0.getLastName();
        boolean boolean4 = user0.isEnabled();
        String str5 = user0.getNotificationFrequency();
        boolean boolean6 = user0.isCredentialsNonExpired();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        edu.harvard.h2ms.domain.core.User user6 = new edu.harvard.h2ms.domain.core.User("", "", "hi!", "User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null", "hi!", "User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null");
        String str7 = user6.getFirstName();
        user6.setEmail("");
        String str10 = user6.getType();
        java.util.Set<edu.harvard.h2ms.domain.core.Role> roleSet11 = user6.getRoles();
        Long long12 = user6.getId();
        user6.setMiddleName("");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null" + "'", str10, "User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null");
        org.junit.Assert.assertNull(roleSet11);
        org.junit.Assert.assertNull(long12);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        edu.harvard.h2ms.domain.core.User user6 = new edu.harvard.h2ms.domain.core.User("", "", "hi!", "", "hi!", "");
        user6.setPassword("User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null");
        String str9 = user6.getResetToken();
        java.util.Date date10 = user6.getLastLogin();
        edu.harvard.h2ms.domain.core.Role[] roleArray11 = new edu.harvard.h2ms.domain.core.Role[] {};
        java.util.LinkedHashSet<edu.harvard.h2ms.domain.core.Role> roleSet12 = new java.util.LinkedHashSet<edu.harvard.h2ms.domain.core.Role>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<edu.harvard.h2ms.domain.core.Role>) roleSet12, roleArray11);
        user6.setRoles((java.util.Set<edu.harvard.h2ms.domain.core.Role>) roleSet12);
        user6.setEnabled(true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(date10);
        org.junit.Assert.assertNotNull(roleArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        edu.harvard.h2ms.domain.core.User user6 = new edu.harvard.h2ms.domain.core.User("", "", "", "User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null", "hi!", "");
        boolean boolean7 = user6.isAccountNonLocked();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        edu.harvard.h2ms.domain.core.User user6 = new edu.harvard.h2ms.domain.core.User("", "", "hi!", "User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null", "hi!", "User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null");
        String str7 = user6.getFirstName();
        java.util.Date date8 = null;
        user6.setLastLogin(date8);
        user6.setMiddleName("");
        String str12 = user6.getLastName();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        edu.harvard.h2ms.domain.core.User user0 = new edu.harvard.h2ms.domain.core.User();
        String str1 = user0.getType();
        java.util.Date date2 = user0.getCreatedOn();
        String str3 = user0.getResetToken();
        String str4 = user0.getType();
        String str5 = user0.getType();
        String str6 = user0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        edu.harvard.h2ms.domain.core.User user6 = new edu.harvard.h2ms.domain.core.User("", "", "hi!", "", "hi!", "");
        user6.setPassword("User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null");
        String str9 = user6.getResetToken();
        user6.setMiddleName("hi!");
        java.util.Date date12 = user6.getLastLogin();
        user6.setNotificationFrequency("");
        boolean boolean15 = user6.isAccountNonLocked();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(date12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        edu.harvard.h2ms.domain.core.User user0 = new edu.harvard.h2ms.domain.core.User();
        String str1 = user0.getType();
        java.util.Date date2 = user0.getCreatedOn();
        String str3 = user0.toString();
        user0.setId((Long) 0L);
        String str6 = user0.getType();
        user0.setNotificationFrequency("User [id=0, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null");
        String str9 = user0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null" + "'", str3, "User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        edu.harvard.h2ms.domain.core.User user0 = new edu.harvard.h2ms.domain.core.User();
        String str1 = user0.getType();
        java.util.Date date2 = user0.getCreatedOn();
        String str3 = user0.getResetToken();
        String str4 = user0.getType();
        user0.setResetToken("User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null");
        boolean boolean7 = user0.isAccountNonExpired();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        edu.harvard.h2ms.domain.core.User user0 = new edu.harvard.h2ms.domain.core.User();
        String str1 = user0.getType();
        java.util.Date date2 = user0.getCreatedOn();
        String str3 = user0.toString();
        user0.setId((Long) 0L);
        String str6 = user0.getLastName();
        user0.setLastName("User [id=null, firstName=, middleName=, lastName=hi!, email=, type, notificationFrequency=null");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null" + "'", str3, "User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        edu.harvard.h2ms.domain.core.User user6 = new edu.harvard.h2ms.domain.core.User("", "", "hi!", "User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null", "hi!", "User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null");
        String str7 = user6.getFirstName();
        user6.setEmail("");
        user6.setNotificationFrequency("");
        String str12 = user6.getMiddleName();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        edu.harvard.h2ms.domain.core.User user0 = new edu.harvard.h2ms.domain.core.User();
        String str1 = user0.getType();
        java.util.Date date2 = user0.getCreatedOn();
        String str3 = user0.toString();
        user0.setId((Long) 0L);
        String str6 = user0.getUsername();
        edu.harvard.h2ms.domain.core.Role[] roleArray7 = new edu.harvard.h2ms.domain.core.Role[] {};
        java.util.LinkedHashSet<edu.harvard.h2ms.domain.core.Role> roleSet8 = new java.util.LinkedHashSet<edu.harvard.h2ms.domain.core.Role>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<edu.harvard.h2ms.domain.core.Role>) roleSet8, roleArray7);
        user0.setRoles((java.util.Set<edu.harvard.h2ms.domain.core.Role>) roleSet8);
        user0.setNotificationFrequency("");
        String str13 = user0.getUsername();
        user0.setPassword("User [id=null, firstName=, middleName=, lastName=hi!, email=, type, notificationFrequency=null");
        String str16 = user0.toString();
        user0.setEmail("User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null" + "'", str3, "User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(roleArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "User [id=0, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=" + "'", str16, "User [id=0, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=");
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        edu.harvard.h2ms.domain.core.User user6 = new edu.harvard.h2ms.domain.core.User("", "", "hi!", "", "hi!", "");
        user6.setPassword("User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null");
        String str9 = user6.getResetToken();
        user6.setMiddleName("hi!");
        user6.setPassword("hi!");
        String str14 = user6.getUsername();
        user6.setType("");
        java.util.Set<edu.harvard.h2ms.domain.core.Role> roleSet17 = user6.getRoles();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(roleSet17);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        edu.harvard.h2ms.domain.core.User user6 = new edu.harvard.h2ms.domain.core.User("", "", "hi!", "", "hi!", "");
        user6.setPassword("User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null");
        String str9 = user6.getResetToken();
        user6.setMiddleName("hi!");
        java.util.Date date12 = user6.getLastLogin();
        boolean boolean13 = user6.isAccountNonExpired();
        String str14 = user6.toString();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(date12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "User [id=null, firstName=, middleName=hi!, lastName=hi!, email=, type, notificationFrequency=null" + "'", str14, "User [id=null, firstName=, middleName=hi!, lastName=hi!, email=, type, notificationFrequency=null");
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        edu.harvard.h2ms.domain.core.User user6 = new edu.harvard.h2ms.domain.core.User("User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null", "", "User [id=0, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null", "User [id=0, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null", "User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null", "hi!");
        java.util.Date date7 = null;
        user6.setLastLogin(date7);
        boolean boolean9 = user6.isAccountNonLocked();
        boolean boolean10 = user6.isEnabled();
        String str11 = user6.getMiddleName();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        edu.harvard.h2ms.domain.core.User user6 = new edu.harvard.h2ms.domain.core.User("", "", "hi!", "", "hi!", "");
        String str7 = user6.getEmail();
        user6.setEmail("hi!");
        java.util.Date date10 = null;
        user6.setCreatedOn(date10);
        boolean boolean12 = user6.isAccountNonExpired();
        String str13 = user6.getResetToken();
        boolean boolean14 = user6.isCredentialsNonExpired();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        edu.harvard.h2ms.domain.core.User user6 = new edu.harvard.h2ms.domain.core.User("User [id=null, firstName=, middleName=, lastName=hi!, email=, type, notificationFrequency=null", "User [id=0, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null", "", "User [id=0, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null", "", "User [id=null, firstName=, middleName=, lastName=hi!, email=, type, notificationFrequency=null");
        java.util.Date date7 = user6.getLastLogin();
        user6.setPassword("");
        java.util.Date date10 = user6.getLastLogin();
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertNull(date10);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        edu.harvard.h2ms.domain.core.User user0 = new edu.harvard.h2ms.domain.core.User();
        java.util.Date date1 = user0.getLastLogin();
        user0.setNotificationFrequency("hi!");
        boolean boolean4 = user0.isAccountNonExpired();
        user0.setLastName("");
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        edu.harvard.h2ms.domain.core.User user0 = new edu.harvard.h2ms.domain.core.User();
        String str1 = user0.getType();
        user0.setEnabled(true);
        String str4 = user0.getFirstName();
        user0.setPassword("User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null");
        String str7 = user0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        edu.harvard.h2ms.domain.core.User user6 = new edu.harvard.h2ms.domain.core.User("", "", "", "User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null", "hi!", "");
        java.util.Date date7 = user6.getLastLogin();
        org.junit.Assert.assertNull(date7);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        edu.harvard.h2ms.domain.core.User user0 = new edu.harvard.h2ms.domain.core.User();
        java.util.Date date1 = user0.getLastLogin();
        user0.setNotificationFrequency("hi!");
        user0.setEmail("hi!");
        java.util.Date date6 = user0.getCreatedOn();
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertNull(date6);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        edu.harvard.h2ms.domain.core.User user6 = new edu.harvard.h2ms.domain.core.User("", "", "hi!", "", "hi!", "");
        user6.setPassword("User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null");
        String str9 = user6.getResetToken();
        user6.setMiddleName("hi!");
        java.util.Date date12 = user6.getLastLogin();
        user6.setNotificationFrequency("");
        String str15 = user6.getResetToken();
        user6.setMiddleName("User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(date12);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        edu.harvard.h2ms.domain.core.User user0 = new edu.harvard.h2ms.domain.core.User();
        String str1 = user0.getType();
        String str2 = user0.getType();
        Long long3 = user0.getId();
        user0.setLastName("");
        String str6 = user0.getResetToken();
        String str7 = user0.getType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        edu.harvard.h2ms.domain.core.User user0 = new edu.harvard.h2ms.domain.core.User();
        String str1 = user0.getType();
        java.util.Date date2 = user0.getCreatedOn();
        String str3 = user0.toString();
        user0.setId((Long) 0L);
        String str6 = user0.getUsername();
        edu.harvard.h2ms.domain.core.Role[] roleArray7 = new edu.harvard.h2ms.domain.core.Role[] {};
        java.util.LinkedHashSet<edu.harvard.h2ms.domain.core.Role> roleSet8 = new java.util.LinkedHashSet<edu.harvard.h2ms.domain.core.Role>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<edu.harvard.h2ms.domain.core.Role>) roleSet8, roleArray7);
        user0.setRoles((java.util.Set<edu.harvard.h2ms.domain.core.Role>) roleSet8);
        String str11 = user0.getResetToken();
        String str12 = user0.getPassword();
        java.util.Date date13 = null;
        user0.setLastLogin(date13);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null" + "'", str3, "User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(roleArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        edu.harvard.h2ms.domain.core.User user6 = new edu.harvard.h2ms.domain.core.User("", "", "hi!", "", "hi!", "");
        user6.setPassword("User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null");
        String str9 = user6.getResetToken();
        user6.setMiddleName("hi!");
        java.util.Date date12 = user6.getLastLogin();
        java.util.Date date13 = user6.getLastLogin();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(date12);
        org.junit.Assert.assertNull(date13);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        edu.harvard.h2ms.domain.core.User user6 = new edu.harvard.h2ms.domain.core.User("", "", "hi!", "User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null", "hi!", "User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null");
        String str7 = user6.getFirstName();
        user6.setEmail("");
        String str10 = user6.getType();
        String str11 = user6.getMiddleName();
        user6.setId((Long) 1L);
        user6.setResetToken("User [id=null, firstName=, middleName=hi!, lastName=hi!, email=, type, notificationFrequency=null");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null" + "'", str10, "User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        edu.harvard.h2ms.domain.core.User user6 = new edu.harvard.h2ms.domain.core.User("", "", "hi!", "User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null", "hi!", "User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null");
        String str7 = user6.getFirstName();
        user6.setEmail("");
        String str10 = user6.getType();
        String str11 = user6.getMiddleName();
        user6.setId((Long) 1L);
        Class<?> wildcardClass14 = user6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null" + "'", str10, "User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        edu.harvard.h2ms.domain.core.User user0 = new edu.harvard.h2ms.domain.core.User();
        String str1 = user0.getType();
        java.util.Date date2 = user0.getCreatedOn();
        String str3 = user0.toString();
        user0.setId((Long) 0L);
        String str6 = user0.getUsername();
        edu.harvard.h2ms.domain.core.Role[] roleArray7 = new edu.harvard.h2ms.domain.core.Role[] {};
        java.util.LinkedHashSet<edu.harvard.h2ms.domain.core.Role> roleSet8 = new java.util.LinkedHashSet<edu.harvard.h2ms.domain.core.Role>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<edu.harvard.h2ms.domain.core.Role>) roleSet8, roleArray7);
        user0.setRoles((java.util.Set<edu.harvard.h2ms.domain.core.Role>) roleSet8);
        user0.setNotificationFrequency("");
        String str13 = user0.getUsername();
        String str14 = user0.getFirstName();
        String str15 = user0.getLastName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null" + "'", str3, "User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(roleArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        edu.harvard.h2ms.domain.core.User user0 = new edu.harvard.h2ms.domain.core.User();
        java.util.Date date1 = null;
        user0.setLastLogin(date1);
        user0.setEnabled(false);
        String str5 = user0.getType();
        String str6 = user0.getPassword();
        user0.setNotificationFrequency("User [id=null, firstName=, middleName=, lastName=hi!, email=, type, notificationFrequency=null");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        edu.harvard.h2ms.domain.core.User user0 = new edu.harvard.h2ms.domain.core.User();
        String str1 = user0.getType();
        java.util.Date date2 = user0.getCreatedOn();
        String str3 = user0.toString();
        String str4 = user0.getMiddleName();
        Long long5 = user0.getId();
        java.util.Date date6 = null;
        user0.setLastLogin(date6);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null" + "'", str3, "User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(long5);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        edu.harvard.h2ms.domain.core.User user6 = new edu.harvard.h2ms.domain.core.User("", "User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null", "", "User [id=0, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null", "hi!", "User [id=0, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null");
        user6.setPassword("User [id=0, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null");
        java.util.Date date9 = null;
        user6.setLastLogin(date9);
        user6.setType("$2a$10$Czo3AXsg2th3PUHKU6rNmeLk5yFWS0ZQ5Cx4q1JTyzMO/xdkhSHkK");
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        edu.harvard.h2ms.domain.core.User user0 = new edu.harvard.h2ms.domain.core.User();
        String str1 = user0.getType();
        java.util.Date date2 = user0.getCreatedOn();
        String str3 = user0.toString();
        user0.setId((Long) 0L);
        String str6 = user0.getType();
        user0.setNotificationFrequency("User [id=0, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null");
        String str9 = user0.getResetToken();
        java.util.Date date10 = user0.getLastLogin();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null" + "'", str3, "User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(date10);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        edu.harvard.h2ms.domain.core.User user0 = new edu.harvard.h2ms.domain.core.User();
        String str1 = user0.getType();
        java.util.Date date2 = user0.getCreatedOn();
        String str3 = user0.toString();
        user0.setId((Long) 0L);
        java.util.Collection<? extends org.springframework.security.core.GrantedAuthority> wildcardCollection6 = user0.getAuthorities();
        user0.setResetToken("");
        java.util.Date date9 = null;
        user0.setCreatedOn(date9);
        java.util.Set<edu.harvard.h2ms.domain.core.Role> roleSet11 = user0.getRoles();
        user0.setId((Long) 0L);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null" + "'", str3, "User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null");
        org.junit.Assert.assertNotNull(wildcardCollection6);
        org.junit.Assert.assertNull(roleSet11);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        edu.harvard.h2ms.domain.core.User user0 = new edu.harvard.h2ms.domain.core.User();
        String str1 = user0.getType();
        java.util.Date date2 = user0.getCreatedOn();
        String str3 = user0.toString();
        user0.setId((Long) 0L);
        String str6 = user0.getUsername();
        edu.harvard.h2ms.domain.core.Role[] roleArray7 = new edu.harvard.h2ms.domain.core.Role[] {};
        java.util.LinkedHashSet<edu.harvard.h2ms.domain.core.Role> roleSet8 = new java.util.LinkedHashSet<edu.harvard.h2ms.domain.core.Role>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<edu.harvard.h2ms.domain.core.Role>) roleSet8, roleArray7);
        user0.setRoles((java.util.Set<edu.harvard.h2ms.domain.core.Role>) roleSet8);
        String str11 = user0.getResetToken();
        String str12 = user0.getPassword();
        String str13 = user0.getFirstName();
        user0.setFirstName("User [id=null, firstName=, middleName=, lastName=hi!, email=, type, notificationFrequency=null");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null" + "'", str3, "User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(roleArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        edu.harvard.h2ms.domain.core.User user6 = new edu.harvard.h2ms.domain.core.User("", "", "hi!", "", "hi!", "");
        user6.setPassword("User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null");
        String str9 = user6.getResetToken();
        user6.setMiddleName("hi!");
        java.util.Date date12 = user6.getLastLogin();
        boolean boolean13 = user6.isAccountNonExpired();
        java.util.Set<edu.harvard.h2ms.domain.core.Role> roleSet14 = user6.getRoles();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(date12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(roleSet14);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        edu.harvard.h2ms.domain.core.User user0 = new edu.harvard.h2ms.domain.core.User();
        String str1 = user0.getType();
        java.util.Date date2 = user0.getCreatedOn();
        String str3 = user0.toString();
        user0.setId((Long) 0L);
        String str6 = user0.getEmail();
        java.util.Set<edu.harvard.h2ms.domain.core.Role> roleSet7 = user0.getRoles();
        user0.setNotificationFrequency("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null" + "'", str3, "User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(roleSet7);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        edu.harvard.h2ms.domain.core.User user6 = new edu.harvard.h2ms.domain.core.User("", "", "hi!", "User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null", "hi!", "User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null");
        String str7 = user6.getFirstName();
        java.util.Date date8 = null;
        user6.setLastLogin(date8);
        user6.setMiddleName("");
        java.util.Date date12 = user6.getLastLogin();
        user6.setId((Long) 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(date12);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        edu.harvard.h2ms.domain.core.User user0 = new edu.harvard.h2ms.domain.core.User();
        java.util.Date date1 = user0.getLastLogin();
        java.util.Date date2 = null;
        user0.setLastLogin(date2);
        java.util.Date date4 = user0.getCreatedOn();
        boolean boolean5 = user0.isEnabled();
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertNull(date4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        edu.harvard.h2ms.domain.core.User user6 = new edu.harvard.h2ms.domain.core.User("", "", "hi!", "", "hi!", "");
        user6.setPassword("User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null");
        String str9 = user6.getResetToken();
        user6.setMiddleName("hi!");
        java.util.Date date12 = user6.getLastLogin();
        user6.setNotificationFrequency("");
        String str15 = user6.getResetToken();
        user6.setNotificationFrequency("$2a$10$Czo3AXsg2th3PUHKU6rNmeLk5yFWS0ZQ5Cx4q1JTyzMO/xdkhSHkK");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(date12);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        edu.harvard.h2ms.domain.core.User user0 = new edu.harvard.h2ms.domain.core.User();
        String str1 = user0.getType();
        java.util.Date date2 = user0.getCreatedOn();
        String str3 = user0.toString();
        user0.setId((Long) 0L);
        String str6 = user0.getFirstName();
        boolean boolean7 = user0.isEnabled();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null" + "'", str3, "User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        edu.harvard.h2ms.domain.core.User user6 = new edu.harvard.h2ms.domain.core.User("", "", "hi!", "", "hi!", "");
        String str7 = user6.getEmail();
        user6.setEmail("hi!");
        java.util.Date date10 = null;
        user6.setCreatedOn(date10);
        user6.setPassword("");
        java.util.Set<edu.harvard.h2ms.domain.core.Role> roleSet14 = user6.getRoles();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(roleSet14);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        edu.harvard.h2ms.domain.core.User user0 = new edu.harvard.h2ms.domain.core.User();
        String str1 = user0.getType();
        String str2 = user0.getType();
        Long long3 = user0.getId();
        user0.setLastName("");
        String str6 = user0.getResetToken();
        java.util.Collection<? extends org.springframework.security.core.GrantedAuthority> wildcardCollection7 = user0.getAuthorities();
        String str8 = user0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardCollection7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        edu.harvard.h2ms.domain.core.User user6 = new edu.harvard.h2ms.domain.core.User("", "", "hi!", "", "hi!", "");
        user6.setPassword("User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null");
        String str9 = user6.getResetToken();
        user6.setMiddleName("hi!");
        user6.setPassword("hi!");
        user6.setEmail("$2a$10$Czo3AXsg2th3PUHKU6rNmeLk5yFWS0ZQ5Cx4q1JTyzMO/xdkhSHkK");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        edu.harvard.h2ms.domain.core.User user0 = new edu.harvard.h2ms.domain.core.User();
        String str1 = user0.getType();
        String str2 = user0.getResetToken();
        user0.setResetToken("User [id=0, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=");
        user0.setNotificationFrequency("$2a$10$Czo3AXsg2th3PUHKU6rNmeLk5yFWS0ZQ5Cx4q1JTyzMO/xdkhSHkK");
        Class<?> wildcardClass7 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        edu.harvard.h2ms.domain.core.User user6 = new edu.harvard.h2ms.domain.core.User("", "", "hi!", "", "hi!", "");
        user6.setPassword("User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null");
        String str9 = user6.getResetToken();
        user6.setMiddleName("hi!");
        user6.setPassword("hi!");
        boolean boolean14 = user6.isEnabled();
        String str15 = user6.getUsername();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        edu.harvard.h2ms.domain.core.User user0 = new edu.harvard.h2ms.domain.core.User();
        String str1 = user0.getType();
        java.util.Date date2 = user0.getCreatedOn();
        String str3 = user0.toString();
        user0.setId((Long) 0L);
        String str6 = user0.getEmail();
        java.util.Set<edu.harvard.h2ms.domain.core.Role> roleSet7 = user0.getRoles();
        boolean boolean8 = user0.isAccountNonLocked();
        edu.harvard.h2ms.domain.core.Role[] roleArray9 = new edu.harvard.h2ms.domain.core.Role[] {};
        java.util.LinkedHashSet<edu.harvard.h2ms.domain.core.Role> roleSet10 = new java.util.LinkedHashSet<edu.harvard.h2ms.domain.core.Role>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<edu.harvard.h2ms.domain.core.Role>) roleSet10, roleArray9);
        user0.setRoles((java.util.Set<edu.harvard.h2ms.domain.core.Role>) roleSet10);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null" + "'", str3, "User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(roleSet7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(roleArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        edu.harvard.h2ms.domain.core.User user6 = new edu.harvard.h2ms.domain.core.User("User [id=null, firstName=, middleName=, lastName=hi!, email=, type, notificationFrequency=null", "User [id=0, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null", "", "User [id=0, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null", "", "User [id=null, firstName=, middleName=, lastName=hi!, email=, type, notificationFrequency=null");
        java.util.Date date7 = user6.getLastLogin();
        java.util.Set<edu.harvard.h2ms.domain.core.Role> roleSet8 = user6.getRoles();
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertNull(roleSet8);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        edu.harvard.h2ms.domain.core.User user0 = new edu.harvard.h2ms.domain.core.User();
        String str1 = user0.getType();
        user0.setEnabled(true);
        String str4 = user0.getPassword();
        String str5 = user0.getResetToken();
        java.util.Collection<? extends org.springframework.security.core.GrantedAuthority> wildcardCollection6 = user0.getAuthorities();
        boolean boolean7 = user0.isAccountNonExpired();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardCollection6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        edu.harvard.h2ms.domain.core.User user6 = new edu.harvard.h2ms.domain.core.User("", "", "hi!", "", "hi!", "");
        String str7 = user6.getEmail();
        user6.setEmail("hi!");
        java.util.Date date10 = null;
        user6.setCreatedOn(date10);
        boolean boolean12 = user6.isAccountNonExpired();
        String str13 = user6.getResetToken();
        user6.setResetToken("User [id=null, firstName=, middleName=, lastName=hi!, email=, type, notificationFrequency=null");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        edu.harvard.h2ms.domain.core.User user0 = new edu.harvard.h2ms.domain.core.User();
        String str1 = user0.getType();
        String str2 = user0.getFirstName();
        String str3 = user0.getLastName();
        user0.setType("User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null");
        user0.setMiddleName("User [id=null, firstName=, middleName=, lastName=hi!, email=, type, notificationFrequency=null");
        String str8 = user0.getFirstName();
        String str9 = user0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        edu.harvard.h2ms.domain.core.User user0 = new edu.harvard.h2ms.domain.core.User();
        String str1 = user0.getType();
        java.util.Date date2 = user0.getCreatedOn();
        String str3 = user0.toString();
        user0.setId((Long) 0L);
        String str6 = user0.getEmail();
        user0.setPassword("User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null");
        java.util.Set<edu.harvard.h2ms.domain.core.Role> roleSet9 = user0.getRoles();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null" + "'", str3, "User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(roleSet9);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        edu.harvard.h2ms.domain.core.User user6 = new edu.harvard.h2ms.domain.core.User("$2a$10$Czo3AXsg2th3PUHKU6rNmeLk5yFWS0ZQ5Cx4q1JTyzMO/xdkhSHkK", "", "User [id=0, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=", "$2a$10$Czo3AXsg2th3PUHKU6rNmeLk5yFWS0ZQ5Cx4q1JTyzMO/xdkhSHkK", "hi!", "User [id=null, firstName=, middleName=, lastName=hi!, email=, type, notificationFrequency=null");
        String str7 = user6.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User [id=null, firstName=$2a$10$Czo3AXsg2th3PUHKU6rNmeLk5yFWS0ZQ5Cx4q1JTyzMO/xdkhSHkK, middleName=, lastName=User [id=0, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=, email=$2a$10$Czo3AXsg2th3PUHKU6rNmeLk5yFWS0ZQ5Cx4q1JTyzMO/xdkhSHkK, typeUser [id=null, firstName=, middleName=, lastName=hi!, email=, type, notificationFrequency=null, notificationFrequency=null" + "'", str7, "User [id=null, firstName=$2a$10$Czo3AXsg2th3PUHKU6rNmeLk5yFWS0ZQ5Cx4q1JTyzMO/xdkhSHkK, middleName=, lastName=User [id=0, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=, email=$2a$10$Czo3AXsg2th3PUHKU6rNmeLk5yFWS0ZQ5Cx4q1JTyzMO/xdkhSHkK, typeUser [id=null, firstName=, middleName=, lastName=hi!, email=, type, notificationFrequency=null, notificationFrequency=null");
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        edu.harvard.h2ms.domain.core.User user6 = new edu.harvard.h2ms.domain.core.User("", "", "hi!", "", "hi!", "");
        String str7 = user6.getEmail();
        user6.setEmail("hi!");
        String str10 = user6.getUsername();
        java.util.Date date11 = user6.getCreatedOn();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(date11);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        edu.harvard.h2ms.domain.core.User user0 = new edu.harvard.h2ms.domain.core.User();
        String str1 = user0.getType();
        java.util.Date date2 = user0.getCreatedOn();
        String str3 = user0.toString();
        user0.setId((Long) 0L);
        String str6 = user0.getEmail();
        java.util.Set<edu.harvard.h2ms.domain.core.Role> roleSet7 = user0.getRoles();
        user0.setPassword("User [id=0, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null");
        String str10 = user0.getNotificationFrequency();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null" + "'", str3, "User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(roleSet7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        edu.harvard.h2ms.domain.core.User user0 = new edu.harvard.h2ms.domain.core.User();
        String str1 = user0.getType();
        user0.setEnabled(true);
        String str4 = user0.getPassword();
        String str5 = user0.getResetToken();
        java.util.Date date6 = user0.getLastLogin();
        user0.setFirstName("");
        boolean boolean9 = user0.isAccountNonLocked();
        user0.setEmail("User [id=null, firstName=$2a$10$Czo3AXsg2th3PUHKU6rNmeLk5yFWS0ZQ5Cx4q1JTyzMO/xdkhSHkK, middleName=, lastName=User [id=0, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=, email=$2a$10$Czo3AXsg2th3PUHKU6rNmeLk5yFWS0ZQ5Cx4q1JTyzMO/xdkhSHkK, typeUser [id=null, firstName=, middleName=, lastName=hi!, email=, type, notificationFrequency=null, notificationFrequency=null");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        edu.harvard.h2ms.domain.core.User user6 = new edu.harvard.h2ms.domain.core.User("", "", "hi!", "", "hi!", "");
        user6.setPassword("User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null");
        String str9 = user6.getResetToken();
        java.util.Date date10 = user6.getCreatedOn();
        boolean boolean11 = user6.isCredentialsNonExpired();
        String str12 = user6.getResetToken();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(date10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        edu.harvard.h2ms.domain.core.User user0 = new edu.harvard.h2ms.domain.core.User();
        String str1 = user0.getType();
        java.util.Date date2 = user0.getCreatedOn();
        String str3 = user0.toString();
        user0.setId((Long) 0L);
        java.util.Collection<? extends org.springframework.security.core.GrantedAuthority> wildcardCollection6 = user0.getAuthorities();
        user0.setResetToken("");
        String str9 = user0.getMiddleName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null" + "'", str3, "User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null");
        org.junit.Assert.assertNotNull(wildcardCollection6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        edu.harvard.h2ms.domain.core.User user0 = new edu.harvard.h2ms.domain.core.User();
        String str1 = user0.getType();
        java.util.Date date2 = user0.getCreatedOn();
        String str3 = user0.getResetToken();
        String str4 = user0.getEmail();
        String str5 = user0.getMiddleName();
        java.util.Set<edu.harvard.h2ms.domain.core.Role> roleSet6 = user0.getRoles();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(roleSet6);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        edu.harvard.h2ms.domain.core.User user0 = new edu.harvard.h2ms.domain.core.User();
        String str1 = user0.getResetToken();
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        edu.harvard.h2ms.domain.core.User user6 = new edu.harvard.h2ms.domain.core.User("", "", "hi!", "", "hi!", "");
        user6.setPassword("User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null");
        String str9 = user6.getResetToken();
        user6.setPassword("");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        edu.harvard.h2ms.domain.core.User user0 = new edu.harvard.h2ms.domain.core.User();
        String str1 = user0.getType();
        java.util.Date date2 = user0.getCreatedOn();
        String str3 = user0.toString();
        user0.setId((Long) 0L);
        java.util.Collection<? extends org.springframework.security.core.GrantedAuthority> wildcardCollection6 = user0.getAuthorities();
        user0.setResetToken("");
        String str9 = user0.getResetToken();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null" + "'", str3, "User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null");
        org.junit.Assert.assertNotNull(wildcardCollection6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        edu.harvard.h2ms.domain.core.User user0 = new edu.harvard.h2ms.domain.core.User();
        String str1 = user0.getType();
        java.util.Date date2 = user0.getCreatedOn();
        String str3 = user0.toString();
        java.util.Date date4 = null;
        user0.setLastLogin(date4);
        String str6 = user0.toString();
        user0.setLastName("");
        Long long9 = user0.getId();
        user0.setFirstName("User [id=null, firstName=, middleName=hi!, lastName=hi!, email=, type, notificationFrequency=null");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null" + "'", str3, "User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null" + "'", str6, "User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null");
        org.junit.Assert.assertNull(long9);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        edu.harvard.h2ms.domain.core.User user0 = new edu.harvard.h2ms.domain.core.User();
        String str1 = user0.getType();
        String str2 = user0.getFirstName();
        String str3 = user0.getLastName();
        boolean boolean4 = user0.isEnabled();
        user0.setId((Long) 10L);
        boolean boolean7 = user0.isCredentialsNonExpired();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        edu.harvard.h2ms.domain.core.User user6 = new edu.harvard.h2ms.domain.core.User("", "", "hi!", "", "hi!", "");
        String str7 = user6.getUsername();
        String str8 = user6.getFirstName();
        java.util.Set<edu.harvard.h2ms.domain.core.Role> roleSet9 = user6.getRoles();
        boolean boolean10 = user6.isAccountNonLocked();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(roleSet9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        edu.harvard.h2ms.domain.core.User user0 = new edu.harvard.h2ms.domain.core.User();
        String str1 = user0.getType();
        java.util.Date date2 = user0.getCreatedOn();
        String str3 = user0.toString();
        user0.setId((Long) 0L);
        String str6 = user0.getType();
        java.util.Date date7 = user0.getLastLogin();
        String str8 = user0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null" + "'", str3, "User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        edu.harvard.h2ms.domain.core.User user6 = new edu.harvard.h2ms.domain.core.User("", "", "hi!", "", "hi!", "");
        String str7 = user6.getEmail();
        user6.setEmail("hi!");
        java.util.Set<edu.harvard.h2ms.domain.core.Role> roleSet10 = user6.getRoles();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(roleSet10);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        edu.harvard.h2ms.domain.core.User user0 = new edu.harvard.h2ms.domain.core.User();
        String str1 = user0.getType();
        user0.setEnabled(true);
        java.util.Set<edu.harvard.h2ms.domain.core.Role> roleSet4 = user0.getRoles();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(roleSet4);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        edu.harvard.h2ms.domain.core.User user0 = new edu.harvard.h2ms.domain.core.User();
        String str1 = user0.getType();
        String str2 = user0.getType();
        Long long3 = user0.getId();
        user0.setLastName("");
        String str6 = user0.getResetToken();
        java.util.Collection<? extends org.springframework.security.core.GrantedAuthority> wildcardCollection7 = user0.getAuthorities();
        user0.setPassword("User [id=0, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardCollection7);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        edu.harvard.h2ms.domain.core.User user0 = new edu.harvard.h2ms.domain.core.User();
        String str1 = user0.getType();
        java.util.Date date2 = user0.getCreatedOn();
        user0.setType("User [id=null, firstName=, middleName=, lastName=hi!, email=, type, notificationFrequency=null");
        String str5 = user0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        edu.harvard.h2ms.domain.core.User user0 = new edu.harvard.h2ms.domain.core.User();
        String str1 = user0.getType();
        java.util.Date date2 = user0.getCreatedOn();
        String str3 = user0.toString();
        user0.setId((Long) 0L);
        String str6 = user0.getUsername();
        edu.harvard.h2ms.domain.core.Role[] roleArray7 = new edu.harvard.h2ms.domain.core.Role[] {};
        java.util.LinkedHashSet<edu.harvard.h2ms.domain.core.Role> roleSet8 = new java.util.LinkedHashSet<edu.harvard.h2ms.domain.core.Role>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<edu.harvard.h2ms.domain.core.Role>) roleSet8, roleArray7);
        user0.setRoles((java.util.Set<edu.harvard.h2ms.domain.core.Role>) roleSet8);
        user0.setNotificationFrequency("");
        String str13 = user0.getUsername();
        user0.setId((Long) 100L);
        user0.setMiddleName("User [id=null, firstName=, middleName=hi!, lastName=hi!, email=, type, notificationFrequency=null");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null" + "'", str3, "User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(roleArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        edu.harvard.h2ms.domain.core.User user0 = new edu.harvard.h2ms.domain.core.User();
        String str1 = user0.getType();
        java.util.Date date2 = user0.getCreatedOn();
        String str3 = user0.toString();
        user0.setId((Long) 0L);
        String str6 = user0.getType();
        user0.setResetToken("User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null");
        java.util.Date date9 = null;
        user0.setLastLogin(date9);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null" + "'", str3, "User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        edu.harvard.h2ms.domain.core.User user0 = new edu.harvard.h2ms.domain.core.User();
        String str1 = user0.getType();
        java.util.Date date2 = user0.getCreatedOn();
        String str3 = user0.toString();
        user0.setId((Long) 0L);
        String str6 = user0.getUsername();
        String str7 = user0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null" + "'", str3, "User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        edu.harvard.h2ms.domain.core.User user0 = new edu.harvard.h2ms.domain.core.User();
        String str1 = user0.getType();
        java.util.Date date2 = user0.getCreatedOn();
        String str3 = user0.toString();
        java.util.Date date4 = null;
        user0.setLastLogin(date4);
        user0.setEmail("");
        String str8 = user0.getResetToken();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null" + "'", str3, "User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        edu.harvard.h2ms.domain.core.User user0 = new edu.harvard.h2ms.domain.core.User();
        String str1 = user0.getType();
        java.util.Date date2 = user0.getCreatedOn();
        String str3 = user0.toString();
        user0.setId((Long) 0L);
        String str6 = user0.getEmail();
        java.util.Set<edu.harvard.h2ms.domain.core.Role> roleSet7 = user0.getRoles();
        user0.setPassword("User [id=0, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null");
        user0.setNotificationFrequency("hi!");
        user0.setType("User [id=0, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null" + "'", str3, "User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(roleSet7);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        edu.harvard.h2ms.domain.core.User user6 = new edu.harvard.h2ms.domain.core.User("", "", "hi!", "", "hi!", "");
        user6.setPassword("User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null");
        String str9 = user6.getResetToken();
        String str10 = user6.getEmail();
        String str11 = user6.getEmail();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        edu.harvard.h2ms.domain.core.User user0 = new edu.harvard.h2ms.domain.core.User();
        String str1 = user0.getType();
        java.util.Date date2 = user0.getCreatedOn();
        String str3 = user0.toString();
        String str4 = user0.getMiddleName();
        Long long5 = user0.getId();
        user0.setPassword("hi!");
        user0.setId((Long) 100L);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null" + "'", str3, "User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(long5);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        edu.harvard.h2ms.domain.core.User user6 = new edu.harvard.h2ms.domain.core.User("", "", "hi!", "", "hi!", "");
        String str7 = user6.getUsername();
        String str8 = user6.getFirstName();
        java.util.Set<edu.harvard.h2ms.domain.core.Role> roleSet9 = user6.getRoles();
        String str10 = user6.getMiddleName();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(roleSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        edu.harvard.h2ms.domain.core.User user0 = new edu.harvard.h2ms.domain.core.User();
        String str1 = user0.getType();
        user0.setEnabled(true);
        String str4 = user0.getPassword();
        String str5 = user0.getResetToken();
        java.util.Date date6 = user0.getLastLogin();
        user0.setEnabled(true);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(date6);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        edu.harvard.h2ms.domain.core.User user0 = new edu.harvard.h2ms.domain.core.User();
        String str1 = user0.getType();
        java.util.Date date2 = user0.getCreatedOn();
        String str3 = user0.toString();
        java.util.Date date4 = null;
        user0.setLastLogin(date4);
        String str6 = user0.toString();
        user0.setLastName("");
        java.util.Set<edu.harvard.h2ms.domain.core.Role> roleSet9 = user0.getRoles();
        user0.setLastName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null" + "'", str3, "User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null" + "'", str6, "User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null");
        org.junit.Assert.assertNull(roleSet9);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        edu.harvard.h2ms.domain.core.User user6 = new edu.harvard.h2ms.domain.core.User("User [id=null, firstName=, middleName=, lastName=hi!, email=, type, notificationFrequency=null", "User [id=0, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null", "", "User [id=0, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null", "", "User [id=null, firstName=, middleName=, lastName=hi!, email=, type, notificationFrequency=null");
        java.util.Date date7 = user6.getLastLogin();
        user6.setPassword("");
        user6.setEmail("hi!");
        org.junit.Assert.assertNull(date7);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        edu.harvard.h2ms.domain.core.User user6 = new edu.harvard.h2ms.domain.core.User("", "", "hi!", "", "hi!", "");
        user6.setPassword("User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null");
        user6.setResetToken("hi!");
        String str11 = user6.getUsername();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        edu.harvard.h2ms.domain.core.User user6 = new edu.harvard.h2ms.domain.core.User("", "", "hi!", "User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null", "hi!", "User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null");
        String str7 = user6.getUsername();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null" + "'", str7, "User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null");
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        edu.harvard.h2ms.domain.core.User user0 = new edu.harvard.h2ms.domain.core.User();
        String str1 = user0.getType();
        java.util.Date date2 = user0.getCreatedOn();
        String str3 = user0.toString();
        user0.setId((Long) 0L);
        String str6 = user0.getUsername();
        edu.harvard.h2ms.domain.core.Role[] roleArray7 = new edu.harvard.h2ms.domain.core.Role[] {};
        java.util.LinkedHashSet<edu.harvard.h2ms.domain.core.Role> roleSet8 = new java.util.LinkedHashSet<edu.harvard.h2ms.domain.core.Role>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<edu.harvard.h2ms.domain.core.Role>) roleSet8, roleArray7);
        user0.setRoles((java.util.Set<edu.harvard.h2ms.domain.core.Role>) roleSet8);
        user0.setNotificationFrequency("");
        user0.setId((Long) 0L);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null" + "'", str3, "User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(roleArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        edu.harvard.h2ms.domain.core.User user6 = new edu.harvard.h2ms.domain.core.User("", "", "hi!", "", "hi!", "");
        user6.setPassword("User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null");
        String str9 = user6.getResetToken();
        java.util.Date date10 = user6.getCreatedOn();
        boolean boolean11 = user6.isCredentialsNonExpired();
        java.util.Set<edu.harvard.h2ms.domain.core.Role> roleSet12 = user6.getRoles();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(date10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(roleSet12);
    }
}
