package edu.harvard.h2ms;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RandoopRegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        edu.harvard.h2ms.domain.core.User user6 = new edu.harvard.h2ms.domain.core.User("", "", "hi!", "", "hi!", "");
        user6.setVerified(true);
        String str9 = user6.getFirstName();
        user6.setPassword("hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        edu.harvard.h2ms.domain.core.User user6 = new edu.harvard.h2ms.domain.core.User("", "hi!", "", "", "hi!", "");
        boolean boolean7 = user6.isCredentialsNonExpired();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        edu.harvard.h2ms.domain.core.User user6 = new edu.harvard.h2ms.domain.core.User("", "", "hi!", "", "hi!", "");
        user6.setMiddleName("hi!");
        String str9 = user6.getMiddleName();
        boolean boolean10 = user6.isAccountNonLocked();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        edu.harvard.h2ms.domain.core.User user0 = new edu.harvard.h2ms.domain.core.User();
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        edu.harvard.h2ms.domain.core.User user6 = new edu.harvard.h2ms.domain.core.User("", "", "hi!", "", "hi!", "");
        user6.setVerified(true);
        boolean boolean9 = user6.isAccountNonExpired();
        boolean boolean10 = user6.isEnabled();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        edu.harvard.h2ms.domain.core.User user6 = new edu.harvard.h2ms.domain.core.User("", "", "hi!", "", "hi!", "");
        java.util.Date date7 = user6.getLastLogin();
        java.util.Date date8 = user6.getCreatedOn();
        user6.setNotificationFrequency("");
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertNull(date8);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        edu.harvard.h2ms.domain.core.User user6 = new edu.harvard.h2ms.domain.core.User("", "", "hi!", "", "hi!", "");
        user6.setEmail("");
        java.util.Date date9 = user6.getCreatedOn();
        org.junit.Assert.assertNull(date9);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        edu.harvard.h2ms.domain.core.User user6 = new edu.harvard.h2ms.domain.core.User("", "hi!", "", "", "hi!", "");
        java.util.Set<edu.harvard.h2ms.domain.core.Role> roleSet7 = user6.getRoles();
        edu.harvard.h2ms.domain.core.User user14 = new edu.harvard.h2ms.domain.core.User("", "", "hi!", "", "hi!", "");
        user14.setVerified(true);
        user14.setVerified(true);
        edu.harvard.h2ms.domain.core.Role[] roleArray19 = new edu.harvard.h2ms.domain.core.Role[] {};
        java.util.LinkedHashSet<edu.harvard.h2ms.domain.core.Role> roleSet20 = new java.util.LinkedHashSet<edu.harvard.h2ms.domain.core.Role>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<edu.harvard.h2ms.domain.core.Role>) roleSet20, roleArray19);
        user14.setRoles((java.util.Set<edu.harvard.h2ms.domain.core.Role>) roleSet20);
        user6.setRoles((java.util.Set<edu.harvard.h2ms.domain.core.Role>) roleSet20);
        org.junit.Assert.assertNull(roleSet7);
        org.junit.Assert.assertNotNull(roleArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        edu.harvard.h2ms.domain.core.User user6 = new edu.harvard.h2ms.domain.core.User("hi!", "hi!", "", "", "hi!", "User [id=null, firstName=, middleName=, lastName=hi!, email=, type, notificationFrequency=null");
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        edu.harvard.h2ms.domain.core.User user6 = new edu.harvard.h2ms.domain.core.User("", "", "hi!", "", "hi!", "");
        java.util.Date date7 = user6.getLastLogin();
        user6.setResetToken("hi!");
        java.util.Date date10 = null;
        user6.setCreatedOn(date10);
        user6.setId((Long) 100L);
        java.util.Set<edu.harvard.h2ms.domain.core.Role> roleSet14 = user6.getRoles();
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertNull(roleSet14);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        edu.harvard.h2ms.domain.core.User user6 = new edu.harvard.h2ms.domain.core.User("", "", "hi!", "", "hi!", "");
        boolean boolean7 = user6.isVerified();
        java.util.Date date8 = user6.getCreatedOn();
        user6.setEnabled(true);
        user6.setMiddleName("");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(date8);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        edu.harvard.h2ms.domain.core.User user6 = new edu.harvard.h2ms.domain.core.User("", "", "hi!", "", "hi!", "");
        user6.setMiddleName("hi!");
        String str9 = user6.getMiddleName();
        boolean boolean10 = user6.isEnabled();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        edu.harvard.h2ms.domain.core.User user6 = new edu.harvard.h2ms.domain.core.User("", "", "hi!", "", "hi!", "");
        boolean boolean7 = user6.isVerified();
        java.util.Date date8 = user6.getCreatedOn();
        edu.harvard.h2ms.domain.core.Role[] roleArray9 = new edu.harvard.h2ms.domain.core.Role[] {};
        java.util.LinkedHashSet<edu.harvard.h2ms.domain.core.Role> roleSet10 = new java.util.LinkedHashSet<edu.harvard.h2ms.domain.core.Role>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<edu.harvard.h2ms.domain.core.Role>) roleSet10, roleArray9);
        user6.setRoles((java.util.Set<edu.harvard.h2ms.domain.core.Role>) roleSet10);
        user6.setEmail("hi!");
        String str15 = user6.getUsername();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertNotNull(roleArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        edu.harvard.h2ms.domain.core.User user6 = new edu.harvard.h2ms.domain.core.User("", "", "hi!", "", "hi!", "");
        boolean boolean7 = user6.isVerified();
        user6.setVerified(false);
        boolean boolean10 = user6.isAccountNonExpired();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        edu.harvard.h2ms.domain.core.User user6 = new edu.harvard.h2ms.domain.core.User("", "", "hi!", "", "hi!", "");
        java.util.Date date7 = user6.getLastLogin();
        user6.setResetToken("hi!");
        java.util.Date date10 = null;
        user6.setCreatedOn(date10);
        user6.setId((Long) 100L);
        java.util.Date date14 = user6.getLastLogin();
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertNull(date14);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        edu.harvard.h2ms.domain.core.User user6 = new edu.harvard.h2ms.domain.core.User("", "", "hi!", "", "hi!", "");
        boolean boolean7 = user6.isVerified();
        java.util.Date date8 = user6.getCreatedOn();
        edu.harvard.h2ms.domain.core.Role[] roleArray9 = new edu.harvard.h2ms.domain.core.Role[] {};
        java.util.LinkedHashSet<edu.harvard.h2ms.domain.core.Role> roleSet10 = new java.util.LinkedHashSet<edu.harvard.h2ms.domain.core.Role>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<edu.harvard.h2ms.domain.core.Role>) roleSet10, roleArray9);
        user6.setRoles((java.util.Set<edu.harvard.h2ms.domain.core.Role>) roleSet10);
        String str13 = user6.getNotificationFrequency();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertNotNull(roleArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        edu.harvard.h2ms.domain.core.User user6 = new edu.harvard.h2ms.domain.core.User("", "", "hi!", "", "hi!", "");
        user6.setVerified(true);
        String str9 = user6.getFirstName();
        user6.setId((Long) 10L);
        user6.setResetToken("User [id=null, firstName=, middleName=, lastName=hi!, email=, type, notificationFrequency=null");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        edu.harvard.h2ms.domain.core.User user6 = new edu.harvard.h2ms.domain.core.User("", "", "hi!", "", "hi!", "");
        user6.setVerified(true);
        user6.setVerified(true);
        java.util.Date date11 = null;
        user6.setLastLogin(date11);
        user6.setMiddleName("");
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        edu.harvard.h2ms.domain.core.User user6 = new edu.harvard.h2ms.domain.core.User("", "", "hi!", "", "hi!", "");
        boolean boolean7 = user6.isVerified();
        java.util.Date date8 = user6.getCreatedOn();
        user6.setEnabled(true);
        boolean boolean11 = user6.isEnabled();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        edu.harvard.h2ms.domain.core.User user6 = new edu.harvard.h2ms.domain.core.User("", "", "hi!", "", "hi!", "");
        user6.setVerified(true);
        boolean boolean9 = user6.isAccountNonLocked();
        Long long10 = user6.getId();
        String str11 = user6.getType();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(long10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        edu.harvard.h2ms.domain.core.User user6 = new edu.harvard.h2ms.domain.core.User("", "", "hi!", "", "hi!", "");
        user6.setVerified(true);
        user6.setVerified(true);
        user6.setNotificationFrequency("");
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        edu.harvard.h2ms.domain.core.User user6 = new edu.harvard.h2ms.domain.core.User("", "", "hi!", "", "hi!", "");
        boolean boolean7 = user6.isVerified();
        java.util.Date date8 = user6.getCreatedOn();
        edu.harvard.h2ms.domain.core.Role[] roleArray9 = new edu.harvard.h2ms.domain.core.Role[] {};
        java.util.LinkedHashSet<edu.harvard.h2ms.domain.core.Role> roleSet10 = new java.util.LinkedHashSet<edu.harvard.h2ms.domain.core.Role>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<edu.harvard.h2ms.domain.core.Role>) roleSet10, roleArray9);
        user6.setRoles((java.util.Set<edu.harvard.h2ms.domain.core.Role>) roleSet10);
        user6.setType("hi!");
        user6.setType("");
        String str17 = user6.getPassword();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertNotNull(roleArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "$2a$10$7Xt1o9D899e7MeBQfIRQ7eU22eyJvMvcTEXbNwlOJtaLtn8wRNxQO" + "'", str17, "$2a$10$7Xt1o9D899e7MeBQfIRQ7eU22eyJvMvcTEXbNwlOJtaLtn8wRNxQO");
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        edu.harvard.h2ms.domain.core.User user6 = new edu.harvard.h2ms.domain.core.User("", "", "hi!", "", "hi!", "");
        boolean boolean7 = user6.isVerified();
        java.util.Date date8 = user6.getCreatedOn();
        user6.setEnabled(true);
        java.util.Date date11 = null;
        user6.setLastLogin(date11);
        String str13 = user6.getUsername();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        edu.harvard.h2ms.domain.core.User user6 = new edu.harvard.h2ms.domain.core.User("$2a$10$7Xt1o9D899e7MeBQfIRQ7eU22eyJvMvcTEXbNwlOJtaLtn8wRNxQO", "$2a$10$7Xt1o9D899e7MeBQfIRQ7eU22eyJvMvcTEXbNwlOJtaLtn8wRNxQO", "$2a$10$7Xt1o9D899e7MeBQfIRQ7eU22eyJvMvcTEXbNwlOJtaLtn8wRNxQO", "hi!", "User [id=null, firstName=, middleName=, lastName=hi!, email=, type, notificationFrequency=null", "User [id=null, firstName=, middleName=, lastName=hi!, email=, type, notificationFrequency=null");
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        edu.harvard.h2ms.domain.core.User user6 = new edu.harvard.h2ms.domain.core.User("", "", "hi!", "", "hi!", "");
        boolean boolean7 = user6.isVerified();
        java.util.Date date8 = user6.getCreatedOn();
        user6.setNotificationFrequency("");
        edu.harvard.h2ms.domain.core.User user17 = new edu.harvard.h2ms.domain.core.User("", "", "hi!", "", "hi!", "");
        user17.setVerified(true);
        user17.setVerified(true);
        edu.harvard.h2ms.domain.core.Role[] roleArray22 = new edu.harvard.h2ms.domain.core.Role[] {};
        java.util.LinkedHashSet<edu.harvard.h2ms.domain.core.Role> roleSet23 = new java.util.LinkedHashSet<edu.harvard.h2ms.domain.core.Role>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<edu.harvard.h2ms.domain.core.Role>) roleSet23, roleArray22);
        user17.setRoles((java.util.Set<edu.harvard.h2ms.domain.core.Role>) roleSet23);
        user6.setRoles((java.util.Set<edu.harvard.h2ms.domain.core.Role>) roleSet23);
        user6.setType("User [id=null, firstName=, middleName=, lastName=hi!, email=, type, notificationFrequency=null");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertNotNull(roleArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        edu.harvard.h2ms.domain.core.User user6 = new edu.harvard.h2ms.domain.core.User("", "", "hi!", "", "hi!", "");
        user6.setVerified(true);
        user6.setVerified(true);
        user6.setVerified(true);
        java.util.Collection<? extends org.springframework.security.core.GrantedAuthority> wildcardCollection13 = user6.getAuthorities();
        org.junit.Assert.assertNotNull(wildcardCollection13);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        edu.harvard.h2ms.domain.core.User user6 = new edu.harvard.h2ms.domain.core.User("", "", "hi!", "", "hi!", "");
        user6.setVerified(true);
        user6.setVerified(true);
        user6.setNotificationFrequency("hi!");
        boolean boolean13 = user6.isCredentialsNonExpired();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        edu.harvard.h2ms.domain.core.User user6 = new edu.harvard.h2ms.domain.core.User("", "", "hi!", "", "hi!", "");
        user6.setVerified(true);
        String str9 = user6.getFirstName();
        user6.setEmail("");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        edu.harvard.h2ms.domain.core.User user6 = new edu.harvard.h2ms.domain.core.User("", "", "hi!", "", "hi!", "");
        user6.setFirstName("");
        user6.setNotificationFrequency("");
        boolean boolean11 = user6.isEnabled();
        boolean boolean12 = user6.isAccountNonExpired();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        edu.harvard.h2ms.domain.core.User user6 = new edu.harvard.h2ms.domain.core.User("", "hi!", "User [id=null, firstName=, middleName=, lastName=hi!, email=, type, notificationFrequency=null", "hi!", "hi!", "User [id=null, firstName=, middleName=, lastName=hi!, email=, type, notificationFrequency=null");
        java.util.Date date7 = user6.getCreatedOn();
        user6.setEmail("hi!");
        org.junit.Assert.assertNull(date7);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        edu.harvard.h2ms.domain.core.User user6 = new edu.harvard.h2ms.domain.core.User("", "", "hi!", "", "hi!", "");
        boolean boolean7 = user6.isVerified();
        java.util.Date date8 = user6.getCreatedOn();
        user6.setNotificationFrequency("");
        boolean boolean11 = user6.isAccountNonLocked();
        String str12 = user6.getNotificationFrequency();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        edu.harvard.h2ms.domain.core.User user6 = new edu.harvard.h2ms.domain.core.User("", "", "hi!", "", "hi!", "");
        user6.setVerified(true);
        user6.setEnabled(true);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        edu.harvard.h2ms.domain.core.User user6 = new edu.harvard.h2ms.domain.core.User("", "", "hi!", "", "hi!", "");
        user6.setVerified(true);
        String str9 = user6.getFirstName();
        user6.setId((Long) 10L);
        user6.setVerified(false);
        Class<?> wildcardClass14 = user6.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        edu.harvard.h2ms.domain.core.User user6 = new edu.harvard.h2ms.domain.core.User("", "", "hi!", "", "hi!", "");
        boolean boolean7 = user6.isVerified();
        java.util.Date date8 = user6.getCreatedOn();
        edu.harvard.h2ms.domain.core.Role[] roleArray9 = new edu.harvard.h2ms.domain.core.Role[] {};
        java.util.LinkedHashSet<edu.harvard.h2ms.domain.core.Role> roleSet10 = new java.util.LinkedHashSet<edu.harvard.h2ms.domain.core.Role>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<edu.harvard.h2ms.domain.core.Role>) roleSet10, roleArray9);
        user6.setRoles((java.util.Set<edu.harvard.h2ms.domain.core.Role>) roleSet10);
        user6.setEmail("hi!");
        boolean boolean15 = user6.isEnabled();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertNotNull(roleArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        edu.harvard.h2ms.domain.core.User user6 = new edu.harvard.h2ms.domain.core.User("", "", "hi!", "", "hi!", "");
        user6.setMiddleName("hi!");
        user6.setMiddleName("");
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        edu.harvard.h2ms.domain.core.User user6 = new edu.harvard.h2ms.domain.core.User("", "hi!", "", "", "hi!", "");
        java.util.Date date7 = null;
        user6.setLastLogin(date7);
        String str9 = user6.toString();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User [id=null, firstName=, middleName=hi!, lastName=, email=, type, notificationFrequency=null" + "'", str9, "User [id=null, firstName=, middleName=hi!, lastName=, email=, type, notificationFrequency=null");
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        edu.harvard.h2ms.domain.core.User user6 = new edu.harvard.h2ms.domain.core.User("", "hi!", "", "", "hi!", "");
        java.util.Date date7 = null;
        user6.setLastLogin(date7);
        user6.setType("User [id=null, firstName=, middleName=, lastName=hi!, email=, type, notificationFrequency=null");
        java.util.Date date11 = user6.getCreatedOn();
        String str12 = user6.toString();
        org.junit.Assert.assertNull(date11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "User [id=null, firstName=, middleName=hi!, lastName=, email=, typeUser [id=null, firstName=, middleName=, lastName=hi!, email=, type, notificationFrequency=null, notificationFrequency=null" + "'", str12, "User [id=null, firstName=, middleName=hi!, lastName=, email=, typeUser [id=null, firstName=, middleName=, lastName=hi!, email=, type, notificationFrequency=null, notificationFrequency=null");
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        edu.harvard.h2ms.domain.core.User user6 = new edu.harvard.h2ms.domain.core.User("", "", "hi!", "", "hi!", "");
        user6.setVerified(true);
        user6.setVerified(true);
        boolean boolean11 = user6.isAccountNonExpired();
        java.util.Collection<? extends org.springframework.security.core.GrantedAuthority> wildcardCollection12 = user6.getAuthorities();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardCollection12);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        edu.harvard.h2ms.domain.core.User user6 = new edu.harvard.h2ms.domain.core.User("", "", "hi!", "", "hi!", "");
        user6.setMiddleName("hi!");
        String str9 = user6.getNotificationFrequency();
        user6.setMiddleName("hi!");
        user6.setResetToken("hi!");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        edu.harvard.h2ms.domain.core.User user6 = new edu.harvard.h2ms.domain.core.User("", "", "hi!", "", "hi!", "");
        user6.setVerified(true);
        boolean boolean9 = user6.isAccountNonExpired();
        boolean boolean10 = user6.isAccountNonLocked();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        edu.harvard.h2ms.domain.core.User user6 = new edu.harvard.h2ms.domain.core.User("", "", "hi!", "", "hi!", "");
        boolean boolean7 = user6.isVerified();
        java.util.Date date8 = user6.getCreatedOn();
        java.util.Collection<? extends org.springframework.security.core.GrantedAuthority> wildcardCollection9 = user6.getAuthorities();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertNotNull(wildcardCollection9);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        edu.harvard.h2ms.domain.core.User user6 = new edu.harvard.h2ms.domain.core.User("", "", "hi!", "", "hi!", "");
        user6.setVerified(true);
        user6.setVerified(true);
        edu.harvard.h2ms.domain.core.Role[] roleArray11 = new edu.harvard.h2ms.domain.core.Role[] {};
        java.util.LinkedHashSet<edu.harvard.h2ms.domain.core.Role> roleSet12 = new java.util.LinkedHashSet<edu.harvard.h2ms.domain.core.Role>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<edu.harvard.h2ms.domain.core.Role>) roleSet12, roleArray11);
        user6.setRoles((java.util.Set<edu.harvard.h2ms.domain.core.Role>) roleSet12);
        boolean boolean15 = user6.isEnabled();
        String str16 = user6.getNotificationFrequency();
        org.junit.Assert.assertNotNull(roleArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        edu.harvard.h2ms.domain.core.User user6 = new edu.harvard.h2ms.domain.core.User("", "", "hi!", "", "hi!", "");
        user6.setMiddleName("hi!");
        user6.setLastName("");
        user6.setLastName("");
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        edu.harvard.h2ms.domain.core.User user6 = new edu.harvard.h2ms.domain.core.User("", "", "hi!", "", "hi!", "");
        java.util.Date date7 = user6.getLastLogin();
        user6.setId((Long) 10L);
        org.junit.Assert.assertNull(date7);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        edu.harvard.h2ms.domain.core.User user6 = new edu.harvard.h2ms.domain.core.User("", "", "hi!", "", "hi!", "");
        user6.setFirstName("");
        boolean boolean9 = user6.isVerified();
        String str10 = user6.getEmail();
        String str11 = user6.getUsername();
        user6.setEmail("User [id=null, firstName=, middleName=hi!, lastName=, email=, typeUser [id=null, firstName=, middleName=, lastName=hi!, email=, type, notificationFrequency=null, notificationFrequency=null");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        edu.harvard.h2ms.domain.core.User user6 = new edu.harvard.h2ms.domain.core.User("", "", "hi!", "", "hi!", "");
        user6.setVerified(true);
        String str9 = user6.getFirstName();
        String str10 = user6.getFirstName();
        java.util.Collection<? extends org.springframework.security.core.GrantedAuthority> wildcardCollection11 = user6.getAuthorities();
        java.util.Collection<? extends org.springframework.security.core.GrantedAuthority> wildcardCollection12 = user6.getAuthorities();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardCollection11);
        org.junit.Assert.assertNotNull(wildcardCollection12);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        edu.harvard.h2ms.domain.core.User user6 = new edu.harvard.h2ms.domain.core.User("", "", "hi!", "", "hi!", "");
        user6.setVerified(true);
        user6.setPassword("hi!");
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        edu.harvard.h2ms.domain.core.User user6 = new edu.harvard.h2ms.domain.core.User("", "", "hi!", "", "hi!", "");
        user6.setEmail("");
        user6.setId((Long) 10L);
        String str11 = user6.getMiddleName();
        user6.setId((Long) 0L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        edu.harvard.h2ms.domain.core.User user6 = new edu.harvard.h2ms.domain.core.User("", "", "hi!", "", "hi!", "");
        boolean boolean7 = user6.isVerified();
        java.util.Date date8 = user6.getCreatedOn();
        user6.setEnabled(true);
        java.util.Date date11 = null;
        user6.setLastLogin(date11);
        java.util.Date date13 = user6.getLastLogin();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertNull(date13);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        edu.harvard.h2ms.domain.core.User user6 = new edu.harvard.h2ms.domain.core.User("", "", "hi!", "", "hi!", "");
        user6.setMiddleName("hi!");
        user6.setLastName("");
        Long long11 = user6.getId();
        org.junit.Assert.assertNull(long11);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        edu.harvard.h2ms.domain.core.User user6 = new edu.harvard.h2ms.domain.core.User("", "", "hi!", "", "hi!", "");
        user6.setEnabled(false);
        String str9 = user6.getUsername();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        edu.harvard.h2ms.domain.core.User user6 = new edu.harvard.h2ms.domain.core.User("$2a$10$7Xt1o9D899e7MeBQfIRQ7eU22eyJvMvcTEXbNwlOJtaLtn8wRNxQO", "hi!", "$2a$10$7Xt1o9D899e7MeBQfIRQ7eU22eyJvMvcTEXbNwlOJtaLtn8wRNxQO", "User [id=null, firstName=, middleName=, lastName=hi!, email=, type, notificationFrequency=null", "$2a$10$7Xt1o9D899e7MeBQfIRQ7eU22eyJvMvcTEXbNwlOJtaLtn8wRNxQO", "User [id=null, firstName=, middleName=hi!, lastName=, email=, type, notificationFrequency=null");
        user6.setEnabled(false);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        edu.harvard.h2ms.domain.core.User user6 = new edu.harvard.h2ms.domain.core.User("", "", "hi!", "", "hi!", "");
        java.util.Date date7 = user6.getLastLogin();
        java.util.Date date8 = user6.getCreatedOn();
        boolean boolean9 = user6.isVerified();
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
        edu.harvard.h2ms.domain.core.User user6 = new edu.harvard.h2ms.domain.core.User("", "", "hi!", "", "hi!", "");
        boolean boolean7 = user6.isVerified();
        user6.setVerified(false);
        String str10 = user6.toString();
        boolean boolean11 = user6.isCredentialsNonExpired();
        user6.setMiddleName("hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User [id=null, firstName=, middleName=, lastName=hi!, email=, type, notificationFrequency=null" + "'", str10, "User [id=null, firstName=, middleName=, lastName=hi!, email=, type, notificationFrequency=null");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test55");
        edu.harvard.h2ms.domain.core.User user6 = new edu.harvard.h2ms.domain.core.User("", "", "hi!", "", "hi!", "");
        user6.setVerified(true);
        String str9 = user6.getFirstName();
        user6.setId((Long) 10L);
        String str12 = user6.toString();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "User [id=10, firstName=, middleName=, lastName=hi!, email=, type, notificationFrequency=null" + "'", str12, "User [id=10, firstName=, middleName=, lastName=hi!, email=, type, notificationFrequency=null");
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test56");
        edu.harvard.h2ms.domain.core.User user6 = new edu.harvard.h2ms.domain.core.User("", "", "hi!", "", "hi!", "");
        boolean boolean7 = user6.isVerified();
        java.util.Date date8 = user6.getCreatedOn();
        edu.harvard.h2ms.domain.core.Role[] roleArray9 = new edu.harvard.h2ms.domain.core.Role[] {};
        java.util.LinkedHashSet<edu.harvard.h2ms.domain.core.Role> roleSet10 = new java.util.LinkedHashSet<edu.harvard.h2ms.domain.core.Role>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<edu.harvard.h2ms.domain.core.Role>) roleSet10, roleArray9);
        user6.setRoles((java.util.Set<edu.harvard.h2ms.domain.core.Role>) roleSet10);
        user6.setType("hi!");
        String str15 = user6.getNotificationFrequency();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertNotNull(roleArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test57");
        edu.harvard.h2ms.domain.core.User user6 = new edu.harvard.h2ms.domain.core.User("", "", "hi!", "", "hi!", "");
        user6.setVerified(true);
        String str9 = user6.getFirstName();
        String str10 = user6.getFirstName();
        String str11 = user6.getResetToken();
        boolean boolean12 = user6.isAccountNonExpired();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test58");
        edu.harvard.h2ms.domain.core.User user6 = new edu.harvard.h2ms.domain.core.User("", "", "hi!", "", "hi!", "");
        java.util.Date date7 = user6.getLastLogin();
        boolean boolean8 = user6.isCredentialsNonExpired();
        user6.setFirstName("User [id=10, firstName=, middleName=, lastName=hi!, email=, type, notificationFrequency=null");
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test59");
        edu.harvard.h2ms.domain.core.User user6 = new edu.harvard.h2ms.domain.core.User("", "", "hi!", "", "hi!", "");
        boolean boolean7 = user6.isVerified();
        java.util.Date date8 = user6.getCreatedOn();
        edu.harvard.h2ms.domain.core.Role[] roleArray9 = new edu.harvard.h2ms.domain.core.Role[] {};
        java.util.LinkedHashSet<edu.harvard.h2ms.domain.core.Role> roleSet10 = new java.util.LinkedHashSet<edu.harvard.h2ms.domain.core.Role>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<edu.harvard.h2ms.domain.core.Role>) roleSet10, roleArray9);
        user6.setRoles((java.util.Set<edu.harvard.h2ms.domain.core.Role>) roleSet10);
        user6.setType("hi!");
        user6.setType("");
        java.util.Set<edu.harvard.h2ms.domain.core.Role> roleSet17 = user6.getRoles();
        user6.setEmail("");
        String str20 = user6.getNotificationFrequency();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertNotNull(roleArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(roleSet17);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test60");
        edu.harvard.h2ms.domain.core.User user6 = new edu.harvard.h2ms.domain.core.User("", "hi!", "", "", "hi!", "");
        java.util.Date date7 = null;
        user6.setLastLogin(date7);
        user6.setType("User [id=null, firstName=, middleName=, lastName=hi!, email=, type, notificationFrequency=null");
        java.util.Date date11 = user6.getCreatedOn();
        boolean boolean12 = user6.isEnabled();
        org.junit.Assert.assertNull(date11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test61");
        edu.harvard.h2ms.domain.core.User user6 = new edu.harvard.h2ms.domain.core.User("", "", "hi!", "", "hi!", "");
        boolean boolean7 = user6.isVerified();
        java.util.Date date8 = user6.getCreatedOn();
        user6.setNotificationFrequency("");
        String str11 = user6.getNotificationFrequency();
        java.util.Date date12 = user6.getLastLogin();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(date12);
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test62");
        edu.harvard.h2ms.domain.core.User user6 = new edu.harvard.h2ms.domain.core.User("", "", "hi!", "", "hi!", "");
        boolean boolean7 = user6.isVerified();
        java.util.Date date8 = user6.getCreatedOn();
        user6.setNotificationFrequency("");
        edu.harvard.h2ms.domain.core.User user17 = new edu.harvard.h2ms.domain.core.User("", "", "hi!", "", "hi!", "");
        user17.setVerified(true);
        user17.setVerified(true);
        edu.harvard.h2ms.domain.core.Role[] roleArray22 = new edu.harvard.h2ms.domain.core.Role[] {};
        java.util.LinkedHashSet<edu.harvard.h2ms.domain.core.Role> roleSet23 = new java.util.LinkedHashSet<edu.harvard.h2ms.domain.core.Role>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<edu.harvard.h2ms.domain.core.Role>) roleSet23, roleArray22);
        user17.setRoles((java.util.Set<edu.harvard.h2ms.domain.core.Role>) roleSet23);
        user6.setRoles((java.util.Set<edu.harvard.h2ms.domain.core.Role>) roleSet23);
        boolean boolean27 = user6.isAccountNonLocked();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertNotNull(roleArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test63");
        edu.harvard.h2ms.domain.core.User user6 = new edu.harvard.h2ms.domain.core.User("", "", "hi!", "", "hi!", "");
        user6.setVerified(true);
        user6.setVerified(true);
        java.util.Date date11 = null;
        user6.setLastLogin(date11);
        java.util.Date date13 = null;
        user6.setCreatedOn(date13);
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test64");
        edu.harvard.h2ms.domain.core.User user6 = new edu.harvard.h2ms.domain.core.User("", "", "hi!", "", "hi!", "");
        user6.setFirstName("");
        boolean boolean9 = user6.isVerified();
        String str10 = user6.getEmail();
        user6.setId((Long) (-1L));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test65");
        edu.harvard.h2ms.domain.core.User user6 = new edu.harvard.h2ms.domain.core.User("", "", "hi!", "", "hi!", "");
        user6.setFirstName("");
        boolean boolean9 = user6.isAccountNonExpired();
        String str10 = user6.getMiddleName();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test66");
        edu.harvard.h2ms.domain.core.User user6 = new edu.harvard.h2ms.domain.core.User("", "", "hi!", "", "hi!", "");
        boolean boolean7 = user6.isVerified();
        java.util.Date date8 = user6.getCreatedOn();
        user6.setEnabled(true);
        java.util.Date date11 = null;
        user6.setLastLogin(date11);
        java.util.Set<edu.harvard.h2ms.domain.core.Role> roleSet13 = user6.getRoles();
        String str14 = user6.getResetToken();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertNull(roleSet13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test67");
        edu.harvard.h2ms.domain.core.User user6 = new edu.harvard.h2ms.domain.core.User("", "", "hi!", "", "hi!", "");
        user6.setVerified(true);
        user6.setVerified(true);
        java.util.Date date11 = null;
        user6.setLastLogin(date11);
        java.util.Set<edu.harvard.h2ms.domain.core.Role> roleSet13 = user6.getRoles();
        org.junit.Assert.assertNull(roleSet13);
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test68");
        edu.harvard.h2ms.domain.core.User user6 = new edu.harvard.h2ms.domain.core.User("", "", "hi!", "", "hi!", "");
        user6.setVerified(true);
        user6.setVerified(true);
        user6.setVerified(true);
        user6.setMiddleName("");
        String str15 = user6.getFirstName();
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test69");
        edu.harvard.h2ms.domain.core.User user6 = new edu.harvard.h2ms.domain.core.User("", "", "hi!", "", "hi!", "");
        user6.setEmail("");
        user6.setId((Long) 10L);
        String str11 = user6.getMiddleName();
        user6.setId((Long) (-1L));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test70");
        edu.harvard.h2ms.domain.core.User user6 = new edu.harvard.h2ms.domain.core.User("", "", "hi!", "", "hi!", "");
        boolean boolean7 = user6.isVerified();
        user6.setVerified(false);
        String str10 = user6.getEmail();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test71");
        edu.harvard.h2ms.domain.core.User user6 = new edu.harvard.h2ms.domain.core.User("", "", "hi!", "", "hi!", "");
        java.util.Date date7 = user6.getLastLogin();
        user6.setResetToken("hi!");
        java.util.Date date10 = null;
        user6.setLastLogin(date10);
        org.junit.Assert.assertNull(date7);
    }
}
