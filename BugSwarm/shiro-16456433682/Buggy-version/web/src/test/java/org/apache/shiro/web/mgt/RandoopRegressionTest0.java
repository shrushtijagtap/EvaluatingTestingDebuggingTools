package org.apache.shiro.web.mgt;
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
        java.lang.String str0 = org.apache.shiro.web.mgt.CookieRememberMeManager.DEFAULT_REMEMBER_ME_COOKIE_NAME;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "rememberMe" + "'", str0, "rememberMe");
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager0 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray1 = cookieRememberMeManager0.getDecryptionCipherKey();
        org.apache.shiro.web.servlet.Cookie cookie2 = null;
        cookieRememberMeManager0.setCookie(cookie2);
        org.apache.shiro.web.servlet.Cookie cookie4 = cookieRememberMeManager0.getCookie();
        org.junit.Assert.assertNotNull(byteArray1);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[114, -91, -80, 100, -65, 59, 115, 63, -84, -101, 38, -104, -62, 48, 94, 27]");
        org.junit.Assert.assertNull(cookie4);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager0 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        org.apache.shiro.web.servlet.Cookie cookie1 = null;
        cookieRememberMeManager0.setCookie(cookie1);
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager3 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray4 = cookieRememberMeManager3.getDecryptionCipherKey();
        cookieRememberMeManager0.setDecryptionCipherKey(byteArray4);
        byte[] byteArray7 = new byte[] { (byte) -1 };
        cookieRememberMeManager0.setEncryptionCipherKey(byteArray7);
        org.apache.shiro.subject.SubjectContext subjectContext9 = null;
        org.apache.shiro.subject.PrincipalCollection principalCollection10 = cookieRememberMeManager0.getRememberedPrincipals(subjectContext9);
        org.apache.shiro.subject.SubjectContext subjectContext11 = null;
        cookieRememberMeManager0.forgetIdentity(subjectContext11);
        org.junit.Assert.assertNotNull(byteArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-30, -6, 12, 32, -110, 50, 112, 58, -75, -7, -75, 89, -117, -35, 101, -38]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1]");
        org.junit.Assert.assertNull(principalCollection10);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager0 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        org.apache.shiro.web.servlet.Cookie cookie1 = null;
        cookieRememberMeManager0.setCookie(cookie1);
        org.apache.shiro.subject.SubjectContext subjectContext3 = null;
        cookieRememberMeManager0.forgetIdentity(subjectContext3);
        byte[] byteArray5 = cookieRememberMeManager0.getEncryptionCipherKey();
        org.junit.Assert.assertNotNull(byteArray5);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[39, -108, 61, 21, -90, -80, 61, 109, 111, -42, -124, 117, 91, -71, 103, 26]");
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager0 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        org.apache.shiro.web.servlet.Cookie cookie1 = null;
        cookieRememberMeManager0.setCookie(cookie1);
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager3 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray4 = cookieRememberMeManager3.getDecryptionCipherKey();
        cookieRememberMeManager0.setDecryptionCipherKey(byteArray4);
        byte[] byteArray6 = cookieRememberMeManager0.getDecryptionCipherKey();
        org.apache.shiro.subject.SubjectContext subjectContext7 = null;
        org.apache.shiro.subject.PrincipalCollection principalCollection8 = cookieRememberMeManager0.getRememberedPrincipals(subjectContext7);
        org.junit.Assert.assertNotNull(byteArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-67, 53, 86, 47, -102, 21, 5, 16, 82, -128, -11, -67, 105, 38, -58, -108]");
        org.junit.Assert.assertNotNull(byteArray6);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-67, 53, 86, 47, -102, 21, 5, 16, 82, -128, -11, -67, 105, 38, -58, -108]");
        org.junit.Assert.assertNull(principalCollection8);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager0 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        org.apache.shiro.web.servlet.Cookie cookie1 = null;
        cookieRememberMeManager0.setCookie(cookie1);
        org.apache.shiro.subject.SubjectContext subjectContext3 = null;
        cookieRememberMeManager0.forgetIdentity(subjectContext3);
        org.apache.shiro.subject.Subject subject5 = null;
        cookieRememberMeManager0.onLogout(subject5);
        org.apache.shiro.subject.SubjectContext subjectContext7 = null;
        org.apache.shiro.subject.PrincipalCollection principalCollection8 = cookieRememberMeManager0.getRememberedPrincipals(subjectContext7);
        org.apache.shiro.subject.Subject subject9 = null;
        org.apache.shiro.authc.AuthenticationToken authenticationToken10 = null;
        org.apache.shiro.authc.AuthenticationInfo authenticationInfo11 = null;
        // The following exception was thrown during execution in test generation
        try {
            cookieRememberMeManager0.rememberIdentity(subject9, authenticationToken10, authenticationInfo11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(principalCollection8);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager0 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        org.apache.shiro.web.servlet.Cookie cookie1 = null;
        cookieRememberMeManager0.setCookie(cookie1);
        org.apache.shiro.subject.SubjectContext subjectContext3 = null;
        cookieRememberMeManager0.forgetIdentity(subjectContext3);
        org.apache.shiro.subject.Subject subject5 = null;
        cookieRememberMeManager0.onLogout(subject5);
        org.apache.shiro.web.servlet.Cookie cookie7 = cookieRememberMeManager0.getCookie();
        org.junit.Assert.assertNull(cookie7);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager0 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray1 = cookieRememberMeManager0.getDecryptionCipherKey();
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager2 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray3 = cookieRememberMeManager2.getDecryptionCipherKey();
        cookieRememberMeManager0.setDecryptionCipherKey(byteArray3);
        org.apache.shiro.subject.Subject subject5 = null;
        cookieRememberMeManager0.onLogout(subject5);
        org.apache.shiro.subject.Subject subject7 = null;
        org.apache.shiro.authc.AuthenticationToken authenticationToken8 = null;
        org.apache.shiro.authc.AuthenticationInfo authenticationInfo9 = null;
        // The following exception was thrown during execution in test generation
        try {
            cookieRememberMeManager0.rememberIdentity(subject7, authenticationToken8, authenticationInfo9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[92, -86, 38, 45, 22, 81, -1, 47, 4, 31, -109, 48, -91, 31, -67, 121]");
        org.junit.Assert.assertNotNull(byteArray3);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[-75, 4, 67, 119, 88, -48, 49, 56, -58, -64, 68, -46, 125, -27, -76, -103]");
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager0 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        org.apache.shiro.io.Serializer<org.apache.shiro.subject.PrincipalCollection> principalCollectionSerializer1 = cookieRememberMeManager0.getSerializer();
        org.apache.shiro.subject.SubjectContext subjectContext2 = null;
        cookieRememberMeManager0.forgetIdentity(subjectContext2);
        org.junit.Assert.assertNotNull(principalCollectionSerializer1);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager0 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        org.apache.shiro.subject.SubjectContext subjectContext1 = null;
        org.apache.shiro.subject.PrincipalCollection principalCollection2 = cookieRememberMeManager0.getRememberedPrincipals(subjectContext1);
        java.lang.Class<?> wildcardClass3 = cookieRememberMeManager0.getClass();
        org.junit.Assert.assertNull(principalCollection2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager0 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray1 = cookieRememberMeManager0.getDecryptionCipherKey();
        org.apache.shiro.web.servlet.Cookie cookie2 = null;
        cookieRememberMeManager0.setCookie(cookie2);
        org.apache.shiro.web.servlet.Cookie cookie4 = null;
        cookieRememberMeManager0.setCookie(cookie4);
        org.apache.shiro.subject.Subject subject6 = null;
        org.apache.shiro.authc.AuthenticationToken authenticationToken7 = null;
        org.apache.shiro.authc.AuthenticationException authenticationException8 = null;
        cookieRememberMeManager0.onFailedLogin(subject6, authenticationToken7, authenticationException8);
        org.junit.Assert.assertNotNull(byteArray1);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-120, -93, 55, -53, -35, -28, 71, 95, 23, -9, 91, -95, 61, -18, -103, -128]");
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager0 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray1 = cookieRememberMeManager0.getDecryptionCipherKey();
        org.apache.shiro.web.servlet.Cookie cookie2 = cookieRememberMeManager0.getCookie();
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager3 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray4 = cookieRememberMeManager3.getEncryptionCipherKey();
        org.apache.shiro.io.Serializer<org.apache.shiro.subject.PrincipalCollection> principalCollectionSerializer5 = cookieRememberMeManager3.getSerializer();
        cookieRememberMeManager0.setSerializer(principalCollectionSerializer5);
        org.junit.Assert.assertNotNull(byteArray1);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-124, -32, 47, -77, -105, -4, -82, 19, -6, 92, 105, 66, -9, -84, 28, -31]");
        org.junit.Assert.assertNotNull(cookie2);
        org.junit.Assert.assertNotNull(byteArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[85, 39, 61, -38, 71, 21, 75, -68, 86, -75, -45, -112, 100, -2, -100, -75]");
        org.junit.Assert.assertNotNull(principalCollectionSerializer5);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager0 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray1 = cookieRememberMeManager0.getDecryptionCipherKey();
        org.apache.shiro.web.servlet.Cookie cookie2 = cookieRememberMeManager0.getCookie();
        org.apache.shiro.subject.Subject subject3 = null;
        cookieRememberMeManager0.onLogout(subject3);
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager5 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray6 = cookieRememberMeManager5.getEncryptionCipherKey();
        org.apache.shiro.io.Serializer<org.apache.shiro.subject.PrincipalCollection> principalCollectionSerializer7 = cookieRememberMeManager5.getSerializer();
        cookieRememberMeManager0.setSerializer(principalCollectionSerializer7);
        org.junit.Assert.assertNotNull(byteArray1);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-94, 99, 98, 20, 67, 107, 66, -111, -102, -105, -21, -120, 16, 54, 0, 8]");
        org.junit.Assert.assertNotNull(cookie2);
        org.junit.Assert.assertNotNull(byteArray6);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[122, -119, -93, 69, 92, -45, -18, -101, 46, -57, 39, 14, -112, 66, -55, -8]");
        org.junit.Assert.assertNotNull(principalCollectionSerializer7);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager0 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray1 = cookieRememberMeManager0.getDecryptionCipherKey();
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager2 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray3 = cookieRememberMeManager2.getDecryptionCipherKey();
        cookieRememberMeManager0.setDecryptionCipherKey(byteArray3);
        org.apache.shiro.subject.Subject subject5 = null;
        cookieRememberMeManager0.onLogout(subject5);
        org.apache.shiro.crypto.CipherService cipherService7 = cookieRememberMeManager0.getCipherService();
        org.apache.shiro.subject.Subject subject8 = null;
        org.apache.shiro.authc.AuthenticationToken authenticationToken9 = null;
        org.apache.shiro.authc.AuthenticationInfo authenticationInfo10 = null;
        // The following exception was thrown during execution in test generation
        try {
            cookieRememberMeManager0.rememberIdentity(subject8, authenticationToken9, authenticationInfo10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-114, -41, -114, 32, -78, 109, 15, -18, 62, 108, 40, 11, -6, 103, -34, -6]");
        org.junit.Assert.assertNotNull(byteArray3);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[113, 62, 62, 86, -114, 58, 47, -14, -66, 51, 58, -100, -73, 79, -78, -45]");
        org.junit.Assert.assertNotNull(cipherService7);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager0 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        org.apache.shiro.subject.SubjectContext subjectContext1 = null;
        org.apache.shiro.subject.PrincipalCollection principalCollection2 = cookieRememberMeManager0.getRememberedPrincipals(subjectContext1);
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager3 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray4 = cookieRememberMeManager3.getDecryptionCipherKey();
        org.apache.shiro.web.servlet.Cookie cookie5 = cookieRememberMeManager3.getCookie();
        cookieRememberMeManager0.setCookie(cookie5);
        org.junit.Assert.assertNull(principalCollection2);
        org.junit.Assert.assertNotNull(byteArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-39, -81, -79, 64, 59, -118, -10, -115, -124, -62, 74, 45, 84, 98, -8, 23]");
        org.junit.Assert.assertNotNull(cookie5);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager0 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager1 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray2 = cookieRememberMeManager1.getDecryptionCipherKey();
        org.apache.shiro.web.servlet.Cookie cookie3 = cookieRememberMeManager1.getCookie();
        cookieRememberMeManager0.setCookie(cookie3);
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager5 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray6 = cookieRememberMeManager5.getDecryptionCipherKey();
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager7 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray8 = cookieRememberMeManager7.getDecryptionCipherKey();
        cookieRememberMeManager5.setDecryptionCipherKey(byteArray8);
        org.apache.shiro.subject.Subject subject10 = null;
        cookieRememberMeManager5.onLogout(subject10);
        org.apache.shiro.crypto.CipherService cipherService12 = cookieRememberMeManager5.getCipherService();
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager13 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager14 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray15 = cookieRememberMeManager14.getDecryptionCipherKey();
        org.apache.shiro.web.servlet.Cookie cookie16 = cookieRememberMeManager14.getCookie();
        cookieRememberMeManager13.setCookie(cookie16);
        cookieRememberMeManager5.setCookie(cookie16);
        cookieRememberMeManager0.setCookie(cookie16);
        org.junit.Assert.assertNotNull(byteArray2);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[91, -7, -105, 118, -47, -27, -41, -3, 24, 127, -91, -20, 29, 96, 63, 5]");
        org.junit.Assert.assertNotNull(cookie3);
        org.junit.Assert.assertNotNull(byteArray6);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[36, 9, 47, 111, -90, -110, -42, 55, -21, -49, -127, -17, 1, 95, 98, 31]");
        org.junit.Assert.assertNotNull(byteArray8);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[89, 99, -116, 62, -5, 70, -54, -79, -96, 18, 95, -43, 95, 99, -71, 51]");
        org.junit.Assert.assertNotNull(cipherService12);
        org.junit.Assert.assertNotNull(byteArray15);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[-92, 24, 104, 1, 88, -14, 124, 56, 121, 66, -34, 10, 94, -102, -10, 0]");
        org.junit.Assert.assertNotNull(cookie16);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager0 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        org.apache.shiro.web.servlet.Cookie cookie1 = null;
        cookieRememberMeManager0.setCookie(cookie1);
        org.apache.shiro.subject.SubjectContext subjectContext3 = null;
        cookieRememberMeManager0.forgetIdentity(subjectContext3);
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager5 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray6 = cookieRememberMeManager5.getEncryptionCipherKey();
        org.apache.shiro.web.servlet.Cookie cookie7 = null;
        cookieRememberMeManager5.setCookie(cookie7);
        org.apache.shiro.io.Serializer<org.apache.shiro.subject.PrincipalCollection> principalCollectionSerializer9 = cookieRememberMeManager5.getSerializer();
        cookieRememberMeManager0.setSerializer(principalCollectionSerializer9);
        org.junit.Assert.assertNotNull(byteArray6);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[6, 80, 60, 37, 55, -105, -21, -83, -24, 41, 45, -67, -52, 32, 92, 5]");
        org.junit.Assert.assertNotNull(principalCollectionSerializer9);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager0 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray1 = cookieRememberMeManager0.getEncryptionCipherKey();
        org.apache.shiro.web.servlet.Cookie cookie2 = cookieRememberMeManager0.getCookie();
        byte[] byteArray3 = cookieRememberMeManager0.getCipherKey();
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager4 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager5 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        org.apache.shiro.web.servlet.Cookie cookie6 = null;
        cookieRememberMeManager5.setCookie(cookie6);
        org.apache.shiro.subject.SubjectContext subjectContext8 = null;
        cookieRememberMeManager5.forgetIdentity(subjectContext8);
        byte[] byteArray16 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10, (byte) 0, (byte) 1 };
        cookieRememberMeManager5.setEncryptionCipherKey(byteArray16);
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager18 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray19 = cookieRememberMeManager18.getDecryptionCipherKey();
        org.apache.shiro.web.servlet.Cookie cookie20 = cookieRememberMeManager18.getCookie();
        cookieRememberMeManager5.setCookie(cookie20);
        cookieRememberMeManager4.setCookie(cookie20);
        cookieRememberMeManager0.setCookie(cookie20);
        org.junit.Assert.assertNotNull(byteArray1);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-52, 117, -20, -64, 117, -16, -28, -118, 47, -42, -66, -79, -93, 96, 42, 29]");
        org.junit.Assert.assertNotNull(cookie2);
        org.junit.Assert.assertNotNull(byteArray3);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[-52, 117, -20, -64, 117, -16, -28, -118, 47, -42, -66, -79, -93, 96, 42, 29]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[0, 10, 1, 10, 0, 1]");
        org.junit.Assert.assertNotNull(byteArray19);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[53, 56, 69, 108, -111, -89, 43, -72, 81, 8, -113, 30, -75, 125, 30, 19]");
        org.junit.Assert.assertNotNull(cookie20);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager0 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        org.apache.shiro.web.servlet.Cookie cookie1 = null;
        cookieRememberMeManager0.setCookie(cookie1);
        org.apache.shiro.subject.SubjectContext subjectContext3 = null;
        cookieRememberMeManager0.forgetIdentity(subjectContext3);
        org.apache.shiro.subject.Subject subject5 = null;
        cookieRememberMeManager0.onLogout(subject5);
        byte[] byteArray7 = null;
        cookieRememberMeManager0.setCipherKey(byteArray7);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager0 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray1 = cookieRememberMeManager0.getDecryptionCipherKey();
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager2 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray3 = cookieRememberMeManager2.getDecryptionCipherKey();
        cookieRememberMeManager0.setDecryptionCipherKey(byteArray3);
        org.apache.shiro.subject.Subject subject5 = null;
        cookieRememberMeManager0.onLogout(subject5);
        org.apache.shiro.crypto.CipherService cipherService7 = cookieRememberMeManager0.getCipherService();
        org.apache.shiro.subject.Subject subject8 = null;
        cookieRememberMeManager0.onLogout(subject8);
        org.junit.Assert.assertNotNull(byteArray1);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-113, 120, 28, -117, 72, -82, -121, 110, 104, 20, -66, -100, -9, 121, 26, -101]");
        org.junit.Assert.assertNotNull(byteArray3);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[-69, -80, 123, -100, 115, 42, 100, -44, -36, 24, -105, -55, 52, 17, -62, 88]");
        org.junit.Assert.assertNotNull(cipherService7);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager0 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        org.apache.shiro.web.servlet.Cookie cookie1 = null;
        cookieRememberMeManager0.setCookie(cookie1);
        org.apache.shiro.subject.SubjectContext subjectContext3 = null;
        cookieRememberMeManager0.forgetIdentity(subjectContext3);
        org.apache.shiro.subject.Subject subject5 = null;
        cookieRememberMeManager0.onLogout(subject5);
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager7 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray8 = cookieRememberMeManager7.getDecryptionCipherKey();
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager9 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray10 = cookieRememberMeManager9.getDecryptionCipherKey();
        cookieRememberMeManager7.setDecryptionCipherKey(byteArray10);
        cookieRememberMeManager0.setEncryptionCipherKey(byteArray10);
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager13 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray14 = cookieRememberMeManager13.getDecryptionCipherKey();
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager15 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray16 = cookieRememberMeManager15.getDecryptionCipherKey();
        cookieRememberMeManager13.setDecryptionCipherKey(byteArray16);
        cookieRememberMeManager0.setEncryptionCipherKey(byteArray16);
        org.junit.Assert.assertNotNull(byteArray8);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-21, 124, 79, -111, 86, -41, -42, -57, -110, -108, 124, 7, -37, 64, -87, 17]");
        org.junit.Assert.assertNotNull(byteArray10);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[-80, -62, 106, -96, 78, -125, -85, 115, 36, 82, -19, -122, 36, 24, 31, -1]");
        org.junit.Assert.assertNotNull(byteArray14);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[-120, 79, -15, 116, 75, -35, -8, 89, 99, -71, 11, 115, 36, 33, -32, 92]");
        org.junit.Assert.assertNotNull(byteArray16);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[56, -40, -101, 60, -72, -69, -34, 114, -7, 34, 52, 54, 92, 49, 61, 104]");
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager0 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        org.apache.shiro.web.servlet.Cookie cookie1 = null;
        cookieRememberMeManager0.setCookie(cookie1);
        org.apache.shiro.subject.SubjectContext subjectContext3 = null;
        cookieRememberMeManager0.forgetIdentity(subjectContext3);
        org.apache.shiro.subject.Subject subject5 = null;
        org.apache.shiro.authc.AuthenticationToken authenticationToken6 = null;
        org.apache.shiro.authc.AuthenticationInfo authenticationInfo7 = null;
        // The following exception was thrown during execution in test generation
        try {
            cookieRememberMeManager0.rememberIdentity(subject5, authenticationToken6, authenticationInfo7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager0 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray1 = cookieRememberMeManager0.getDecryptionCipherKey();
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager2 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray3 = cookieRememberMeManager2.getDecryptionCipherKey();
        cookieRememberMeManager0.setDecryptionCipherKey(byteArray3);
        org.apache.shiro.subject.Subject subject5 = null;
        cookieRememberMeManager0.onLogout(subject5);
        org.apache.shiro.crypto.CipherService cipherService7 = cookieRememberMeManager0.getCipherService();
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager8 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray9 = cookieRememberMeManager8.getEncryptionCipherKey();
        org.apache.shiro.web.servlet.Cookie cookie10 = cookieRememberMeManager8.getCookie();
        cookieRememberMeManager0.setCookie(cookie10);
        org.apache.shiro.subject.Subject subject12 = null;
        org.apache.shiro.authc.AuthenticationToken authenticationToken13 = null;
        org.apache.shiro.authc.AuthenticationInfo authenticationInfo14 = null;
        cookieRememberMeManager0.onSuccessfulLogin(subject12, authenticationToken13, authenticationInfo14);
        org.junit.Assert.assertNotNull(byteArray1);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-39, -124, 79, -122, 33, 108, -123, -110, 22, 63, -65, -61, 63, 15, -40, 99]");
        org.junit.Assert.assertNotNull(byteArray3);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[-72, 106, 34, 99, -15, 50, -86, -119, -19, -128, 28, -1, 78, -23, 99, -82]");
        org.junit.Assert.assertNotNull(cipherService7);
        org.junit.Assert.assertNotNull(byteArray9);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[104, -28, -53, -13, -1, 64, 55, -101, 58, 69, 34, -21, 79, -33, -21, 98]");
        org.junit.Assert.assertNotNull(cookie10);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager0 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        org.apache.shiro.web.servlet.Cookie cookie1 = null;
        cookieRememberMeManager0.setCookie(cookie1);
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager3 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray4 = cookieRememberMeManager3.getDecryptionCipherKey();
        cookieRememberMeManager0.setDecryptionCipherKey(byteArray4);
        byte[] byteArray6 = cookieRememberMeManager0.getDecryptionCipherKey();
        java.lang.Class<?> wildcardClass7 = cookieRememberMeManager0.getClass();
        org.junit.Assert.assertNotNull(byteArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-95, -116, -120, -102, -109, 114, 115, 78, -51, -88, 103, -81, -94, 1, -69, -74]");
        org.junit.Assert.assertNotNull(byteArray6);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-95, -116, -120, -102, -109, 114, 115, 78, -51, -88, 103, -81, -94, 1, -69, -74]");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager0 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray1 = cookieRememberMeManager0.getEncryptionCipherKey();
        org.apache.shiro.io.Serializer<org.apache.shiro.subject.PrincipalCollection> principalCollectionSerializer2 = cookieRememberMeManager0.getSerializer();
        byte[] byteArray3 = cookieRememberMeManager0.getCipherKey();
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager4 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray5 = cookieRememberMeManager4.getDecryptionCipherKey();
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager6 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray7 = cookieRememberMeManager6.getDecryptionCipherKey();
        cookieRememberMeManager4.setDecryptionCipherKey(byteArray7);
        cookieRememberMeManager0.setCipherKey(byteArray7);
        org.apache.shiro.subject.SubjectContext subjectContext10 = null;
        cookieRememberMeManager0.forgetIdentity(subjectContext10);
        org.junit.Assert.assertNotNull(byteArray1);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[42, 2, 33, 49, 38, 92, -117, 87, 97, -120, 57, 101, 13, -108, 26, -128]");
        org.junit.Assert.assertNotNull(principalCollectionSerializer2);
        org.junit.Assert.assertNotNull(byteArray3);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[42, 2, 33, 49, 38, 92, -117, 87, 97, -120, 57, 101, 13, -108, 26, -128]");
        org.junit.Assert.assertNotNull(byteArray5);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-34, -74, 0, 0, 71, -21, -5, -110, 32, -30, -2, -93, 83, 9, -7, -64]");
        org.junit.Assert.assertNotNull(byteArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[37, 82, -68, -114, -67, 14, 108, 75, -90, 106, -56, 14, -38, 102, -117, 66]");
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager0 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray1 = cookieRememberMeManager0.getDecryptionCipherKey();
        org.apache.shiro.web.servlet.Cookie cookie2 = cookieRememberMeManager0.getCookie();
        org.apache.shiro.subject.Subject subject3 = null;
        cookieRememberMeManager0.onLogout(subject3);
        java.lang.Class<?> wildcardClass5 = cookieRememberMeManager0.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[75, 116, -28, 15, -118, -69, -122, -61, 118, -38, 21, -89, -85, -22, -96, -57]");
        org.junit.Assert.assertNotNull(cookie2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager0 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        org.apache.shiro.web.servlet.Cookie cookie1 = null;
        cookieRememberMeManager0.setCookie(cookie1);
        org.apache.shiro.subject.SubjectContext subjectContext3 = null;
        cookieRememberMeManager0.forgetIdentity(subjectContext3);
        org.apache.shiro.subject.Subject subject5 = null;
        cookieRememberMeManager0.onLogout(subject5);
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager7 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray8 = cookieRememberMeManager7.getDecryptionCipherKey();
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager9 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray10 = cookieRememberMeManager9.getDecryptionCipherKey();
        cookieRememberMeManager7.setDecryptionCipherKey(byteArray10);
        cookieRememberMeManager0.setEncryptionCipherKey(byteArray10);
        org.apache.shiro.subject.SubjectContext subjectContext13 = null;
        org.apache.shiro.subject.PrincipalCollection principalCollection14 = cookieRememberMeManager0.getRememberedPrincipals(subjectContext13);
        org.junit.Assert.assertNotNull(byteArray8);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-26, 118, 2, 62, -19, -47, 41, -13, 32, 56, -111, 57, -123, 108, 12, 67]");
        org.junit.Assert.assertNotNull(byteArray10);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[26, 38, -118, -4, -75, 82, -28, 19, -42, -29, -56, -63, -57, -98, -103, -1]");
        org.junit.Assert.assertNull(principalCollection14);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager0 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray1 = cookieRememberMeManager0.getEncryptionCipherKey();
        org.apache.shiro.subject.Subject subject2 = null;
        cookieRememberMeManager0.onLogout(subject2);
        byte[] byteArray4 = cookieRememberMeManager0.getCipherKey();
        org.apache.shiro.subject.Subject subject5 = null;
        org.apache.shiro.authc.AuthenticationToken authenticationToken6 = null;
        org.apache.shiro.authc.AuthenticationException authenticationException7 = null;
        cookieRememberMeManager0.onFailedLogin(subject5, authenticationToken6, authenticationException7);
        byte[] byteArray9 = new byte[] {};
        cookieRememberMeManager0.setDecryptionCipherKey(byteArray9);
        org.junit.Assert.assertNotNull(byteArray1);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-44, 88, 50, 101, -14, 4, -115, 119, -58, 71, -78, 125, 14, 120, -75, 99]");
        org.junit.Assert.assertNotNull(byteArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-44, 88, 50, 101, -14, 4, -115, 119, -58, 71, -78, 125, 14, 120, -75, 99]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager0 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray1 = cookieRememberMeManager0.getEncryptionCipherKey();
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[47, 35, -99, -44, -48, -120, -14, -84, 33, 37, 20, 109, -104, 31, 10, -19]");
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager0 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager1 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        org.apache.shiro.web.servlet.Cookie cookie2 = null;
        cookieRememberMeManager1.setCookie(cookie2);
        org.apache.shiro.subject.SubjectContext subjectContext4 = null;
        cookieRememberMeManager1.forgetIdentity(subjectContext4);
        byte[] byteArray12 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10, (byte) 0, (byte) 1 };
        cookieRememberMeManager1.setEncryptionCipherKey(byteArray12);
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager14 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray15 = cookieRememberMeManager14.getDecryptionCipherKey();
        org.apache.shiro.web.servlet.Cookie cookie16 = cookieRememberMeManager14.getCookie();
        cookieRememberMeManager1.setCookie(cookie16);
        cookieRememberMeManager0.setCookie(cookie16);
        org.apache.shiro.subject.SubjectContext subjectContext19 = null;
        org.apache.shiro.subject.PrincipalCollection principalCollection20 = cookieRememberMeManager0.getRememberedPrincipals(subjectContext19);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[0, 10, 1, 10, 0, 1]");
        org.junit.Assert.assertNotNull(byteArray15);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[79, -7, -26, 74, 120, -67, -72, -74, -7, 87, 16, 122, -77, -35, -120, -47]");
        org.junit.Assert.assertNotNull(cookie16);
        org.junit.Assert.assertNull(principalCollection20);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager0 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray1 = cookieRememberMeManager0.getEncryptionCipherKey();
        org.apache.shiro.subject.Subject subject2 = null;
        cookieRememberMeManager0.onLogout(subject2);
        org.apache.shiro.subject.SubjectContext subjectContext4 = null;
        cookieRememberMeManager0.forgetIdentity(subjectContext4);
        org.junit.Assert.assertNotNull(byteArray1);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[68, 84, 65, 103, 31, 35, 40, 68, -118, 38, 118, -12, 3, 110, 87, 89]");
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager0 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray1 = cookieRememberMeManager0.getEncryptionCipherKey();
        org.apache.shiro.io.Serializer<org.apache.shiro.subject.PrincipalCollection> principalCollectionSerializer2 = cookieRememberMeManager0.getSerializer();
        org.apache.shiro.subject.SubjectContext subjectContext3 = null;
        org.apache.shiro.subject.PrincipalCollection principalCollection4 = cookieRememberMeManager0.getRememberedPrincipals(subjectContext3);
        org.apache.shiro.subject.SubjectContext subjectContext5 = null;
        org.apache.shiro.subject.PrincipalCollection principalCollection6 = cookieRememberMeManager0.getRememberedPrincipals(subjectContext5);
        org.junit.Assert.assertNotNull(byteArray1);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[99, 118, 109, 16, -104, -106, -57, -81, -45, -116, -35, -19, -34, -77, 105, -51]");
        org.junit.Assert.assertNotNull(principalCollectionSerializer2);
        org.junit.Assert.assertNull(principalCollection4);
        org.junit.Assert.assertNull(principalCollection6);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager0 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray1 = cookieRememberMeManager0.getEncryptionCipherKey();
        org.apache.shiro.web.servlet.Cookie cookie2 = cookieRememberMeManager0.getCookie();
        byte[] byteArray3 = cookieRememberMeManager0.getCipherKey();
        org.apache.shiro.subject.Subject subject4 = null;
        org.apache.shiro.authc.AuthenticationToken authenticationToken5 = null;
        org.apache.shiro.authc.AuthenticationException authenticationException6 = null;
        cookieRememberMeManager0.onFailedLogin(subject4, authenticationToken5, authenticationException6);
        org.apache.shiro.subject.Subject subject8 = null;
        cookieRememberMeManager0.onLogout(subject8);
        org.junit.Assert.assertNotNull(byteArray1);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[26, 27, 107, -92, -123, 86, 46, 109, 116, -91, 3, 106, 113, 70, 89, -70]");
        org.junit.Assert.assertNotNull(cookie2);
        org.junit.Assert.assertNotNull(byteArray3);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[26, 27, 107, -92, -123, 86, 46, 109, 116, -91, 3, 106, 113, 70, 89, -70]");
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager0 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray1 = cookieRememberMeManager0.getEncryptionCipherKey();
        org.apache.shiro.web.servlet.Cookie cookie2 = cookieRememberMeManager0.getCookie();
        byte[] byteArray3 = cookieRememberMeManager0.getCipherKey();
        org.apache.shiro.subject.SubjectContext subjectContext4 = null;
        cookieRememberMeManager0.forgetIdentity(subjectContext4);
        org.junit.Assert.assertNotNull(byteArray1);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-78, 104, -93, 43, 49, -38, 41, -54, 48, -108, 103, 74, 22, -40, -53, 117]");
        org.junit.Assert.assertNotNull(cookie2);
        org.junit.Assert.assertNotNull(byteArray3);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[-78, 104, -93, 43, 49, -38, 41, -54, 48, -108, 103, 74, 22, -40, -53, 117]");
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager0 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray1 = cookieRememberMeManager0.getDecryptionCipherKey();
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager2 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray3 = cookieRememberMeManager2.getDecryptionCipherKey();
        cookieRememberMeManager0.setDecryptionCipherKey(byteArray3);
        org.apache.shiro.subject.Subject subject5 = null;
        cookieRememberMeManager0.onLogout(subject5);
        org.apache.shiro.crypto.CipherService cipherService7 = cookieRememberMeManager0.getCipherService();
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager8 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager9 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray10 = cookieRememberMeManager9.getDecryptionCipherKey();
        org.apache.shiro.web.servlet.Cookie cookie11 = cookieRememberMeManager9.getCookie();
        cookieRememberMeManager8.setCookie(cookie11);
        cookieRememberMeManager0.setCookie(cookie11);
        org.apache.shiro.io.Serializer<org.apache.shiro.subject.PrincipalCollection> principalCollectionSerializer14 = cookieRememberMeManager0.getSerializer();
        org.junit.Assert.assertNotNull(byteArray1);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-113, 25, -79, -70, -71, 83, -31, -46, -7, 55, 85, 87, 118, -28, -98, 28]");
        org.junit.Assert.assertNotNull(byteArray3);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[14, -32, -47, -95, 53, 120, -17, 46, 85, 97, -42, 12, -66, 65, -114, -31]");
        org.junit.Assert.assertNotNull(cipherService7);
        org.junit.Assert.assertNotNull(byteArray10);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[3, -53, 118, -86, -32, 127, -54, 14, -39, -106, 2, -64, 122, -125, -84, 89]");
        org.junit.Assert.assertNotNull(cookie11);
        org.junit.Assert.assertNotNull(principalCollectionSerializer14);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager0 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray1 = cookieRememberMeManager0.getEncryptionCipherKey();
        org.apache.shiro.subject.Subject subject2 = null;
        cookieRememberMeManager0.onLogout(subject2);
        byte[] byteArray4 = cookieRememberMeManager0.getCipherKey();
        byte[] byteArray5 = cookieRememberMeManager0.getDecryptionCipherKey();
        org.junit.Assert.assertNotNull(byteArray1);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[10, 59, -45, 15, 23, -31, 11, 124, -73, 21, 52, -31, 121, -55, -24, -14]");
        org.junit.Assert.assertNotNull(byteArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[10, 59, -45, 15, 23, -31, 11, 124, -73, 21, 52, -31, 121, -55, -24, -14]");
        org.junit.Assert.assertNotNull(byteArray5);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 59, -45, 15, 23, -31, 11, 124, -73, 21, 52, -31, 121, -55, -24, -14]");
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager0 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray1 = cookieRememberMeManager0.getEncryptionCipherKey();
        org.apache.shiro.subject.Subject subject2 = null;
        cookieRememberMeManager0.onLogout(subject2);
        byte[] byteArray4 = cookieRememberMeManager0.getCipherKey();
        org.apache.shiro.subject.Subject subject5 = null;
        org.apache.shiro.authc.AuthenticationToken authenticationToken6 = null;
        org.apache.shiro.authc.AuthenticationException authenticationException7 = null;
        cookieRememberMeManager0.onFailedLogin(subject5, authenticationToken6, authenticationException7);
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager9 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray10 = cookieRememberMeManager9.getDecryptionCipherKey();
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager11 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray12 = cookieRememberMeManager11.getDecryptionCipherKey();
        cookieRememberMeManager9.setDecryptionCipherKey(byteArray12);
        org.apache.shiro.subject.Subject subject14 = null;
        cookieRememberMeManager9.onLogout(subject14);
        org.apache.shiro.crypto.CipherService cipherService16 = cookieRememberMeManager9.getCipherService();
        cookieRememberMeManager0.setCipherService(cipherService16);
        org.apache.shiro.subject.SubjectContext subjectContext18 = null;
        cookieRememberMeManager0.forgetIdentity(subjectContext18);
        org.junit.Assert.assertNotNull(byteArray1);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-102, 56, 54, -30, -73, 85, -116, 76, 122, -5, 23, -89, 107, 39, 52, -6]");
        org.junit.Assert.assertNotNull(byteArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-102, 56, 54, -30, -73, 85, -116, 76, 122, -5, 23, -89, 107, 39, 52, -6]");
        org.junit.Assert.assertNotNull(byteArray10);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[93, 121, 102, 108, 108, 0, 82, 102, 17, 15, 69, -71, 97, -91, 112, 57]");
        org.junit.Assert.assertNotNull(byteArray12);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[80, -62, 68, -81, 124, -53, -15, 6, -31, -44, 56, 106, -98, -110, -29, -85]");
        org.junit.Assert.assertNotNull(cipherService16);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager0 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        org.apache.shiro.web.servlet.Cookie cookie1 = null;
        cookieRememberMeManager0.setCookie(cookie1);
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager3 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray4 = cookieRememberMeManager3.getDecryptionCipherKey();
        cookieRememberMeManager0.setDecryptionCipherKey(byteArray4);
        byte[] byteArray6 = cookieRememberMeManager0.getDecryptionCipherKey();
        org.apache.shiro.web.servlet.Cookie cookie7 = cookieRememberMeManager0.getCookie();
        org.junit.Assert.assertNotNull(byteArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[113, 19, 50, 4, -98, -30, -13, -73, -3, -7, 18, 127, -72, 20, -104, -120]");
        org.junit.Assert.assertNotNull(byteArray6);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[113, 19, 50, 4, -98, -30, -13, -73, -3, -7, 18, 127, -72, 20, -104, -120]");
        org.junit.Assert.assertNull(cookie7);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager0 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager1 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray2 = cookieRememberMeManager1.getDecryptionCipherKey();
        org.apache.shiro.web.servlet.Cookie cookie3 = cookieRememberMeManager1.getCookie();
        cookieRememberMeManager0.setCookie(cookie3);
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager5 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray6 = cookieRememberMeManager5.getDecryptionCipherKey();
        cookieRememberMeManager0.setEncryptionCipherKey(byteArray6);
        org.junit.Assert.assertNotNull(byteArray2);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[44, -16, 40, 112, -89, -48, -47, 38, 12, 86, -96, -1, 116, -36, -65, 105]");
        org.junit.Assert.assertNotNull(cookie3);
        org.junit.Assert.assertNotNull(byteArray6);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-26, -20, -37, 54, 8, 42, 82, -120, -22, 91, -7, 85, 68, 82, 62, 104]");
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager0 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray1 = cookieRememberMeManager0.getDecryptionCipherKey();
        org.apache.shiro.web.servlet.Cookie cookie2 = null;
        cookieRememberMeManager0.setCookie(cookie2);
        byte[] byteArray4 = cookieRememberMeManager0.getEncryptionCipherKey();
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager5 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray6 = cookieRememberMeManager5.getEncryptionCipherKey();
        org.apache.shiro.io.Serializer<org.apache.shiro.subject.PrincipalCollection> principalCollectionSerializer7 = cookieRememberMeManager5.getSerializer();
        byte[] byteArray8 = cookieRememberMeManager5.getEncryptionCipherKey();
        cookieRememberMeManager0.setEncryptionCipherKey(byteArray8);
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager10 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        org.apache.shiro.web.servlet.Cookie cookie11 = null;
        cookieRememberMeManager10.setCookie(cookie11);
        org.apache.shiro.subject.SubjectContext subjectContext13 = null;
        cookieRememberMeManager10.forgetIdentity(subjectContext13);
        byte[] byteArray21 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10, (byte) 0, (byte) 1 };
        cookieRememberMeManager10.setEncryptionCipherKey(byteArray21);
        cookieRememberMeManager0.setEncryptionCipherKey(byteArray21);
        org.apache.shiro.subject.Subject subject24 = null;
        cookieRememberMeManager0.onLogout(subject24);
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager26 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray27 = cookieRememberMeManager26.getDecryptionCipherKey();
        org.apache.shiro.web.servlet.Cookie cookie28 = null;
        cookieRememberMeManager26.setCookie(cookie28);
        byte[] byteArray30 = cookieRememberMeManager26.getEncryptionCipherKey();
        cookieRememberMeManager0.setDecryptionCipherKey(byteArray30);
        org.junit.Assert.assertNotNull(byteArray1);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[101, -25, 88, 92, 41, 32, -116, -2, 14, -28, -105, 54, -4, -12, -73, -124]");
        org.junit.Assert.assertNotNull(byteArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[101, -25, 88, 92, 41, 32, -116, -2, 14, -28, -105, 54, -4, -12, -73, -124]");
        org.junit.Assert.assertNotNull(byteArray6);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-99, -34, 125, 96, -110, 15, 60, -74, -68, -125, -109, 25, -46, -7, -51, 49]");
        org.junit.Assert.assertNotNull(principalCollectionSerializer7);
        org.junit.Assert.assertNotNull(byteArray8);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-99, -34, 125, 96, -110, 15, 60, -74, -68, -125, -109, 25, -46, -7, -51, 49]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[0, 10, 1, 10, 0, 1]");
        org.junit.Assert.assertNotNull(byteArray27);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[99, -78, -103, 93, -98, 10, -53, -124, 116, -66, -124, -77, 41, 55, 24, -33]");
        org.junit.Assert.assertNotNull(byteArray30);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[99, -78, -103, 93, -98, 10, -53, -124, 116, -66, -124, -77, 41, 55, 24, -33]");
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager0 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        org.apache.shiro.web.servlet.Cookie cookie1 = null;
        cookieRememberMeManager0.setCookie(cookie1);
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager3 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray4 = cookieRememberMeManager3.getDecryptionCipherKey();
        cookieRememberMeManager0.setDecryptionCipherKey(byteArray4);
        byte[] byteArray6 = cookieRememberMeManager0.getDecryptionCipherKey();
        org.apache.shiro.subject.Subject subject7 = null;
        cookieRememberMeManager0.onLogout(subject7);
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager9 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        org.apache.shiro.web.servlet.Cookie cookie10 = null;
        cookieRememberMeManager9.setCookie(cookie10);
        org.apache.shiro.subject.SubjectContext subjectContext12 = null;
        cookieRememberMeManager9.forgetIdentity(subjectContext12);
        byte[] byteArray20 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10, (byte) 0, (byte) 1 };
        cookieRememberMeManager9.setEncryptionCipherKey(byteArray20);
        cookieRememberMeManager0.setDecryptionCipherKey(byteArray20);
        org.junit.Assert.assertNotNull(byteArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-118, 13, -52, -21, 114, -36, 108, 30, -48, -98, 108, 53, -29, 16, -103, 60]");
        org.junit.Assert.assertNotNull(byteArray6);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-118, 13, -52, -21, 114, -36, 108, 30, -48, -98, 108, 53, -29, 16, -103, 60]");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[0, 10, 1, 10, 0, 1]");
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager0 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray1 = cookieRememberMeManager0.getEncryptionCipherKey();
        org.apache.shiro.io.Serializer<org.apache.shiro.subject.PrincipalCollection> principalCollectionSerializer2 = cookieRememberMeManager0.getSerializer();
        byte[] byteArray3 = cookieRememberMeManager0.getEncryptionCipherKey();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 0 };
        cookieRememberMeManager0.setEncryptionCipherKey(byteArray6);
        byte[] byteArray8 = cookieRememberMeManager0.getCipherKey();
        org.junit.Assert.assertNotNull(byteArray1);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[121, -56, 28, 0, -97, 77, -84, 65, -31, -127, -97, 33, -51, -82, -34, -43]");
        org.junit.Assert.assertNotNull(principalCollectionSerializer2);
        org.junit.Assert.assertNotNull(byteArray3);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[121, -56, 28, 0, -97, 77, -84, 65, -31, -127, -97, 33, -51, -82, -34, -43]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 0]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[1, 0]");
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager0 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        org.apache.shiro.io.Serializer<org.apache.shiro.subject.PrincipalCollection> principalCollectionSerializer1 = cookieRememberMeManager0.getSerializer();
        byte[] byteArray2 = cookieRememberMeManager0.getDecryptionCipherKey();
        org.junit.Assert.assertNotNull(principalCollectionSerializer1);
        org.junit.Assert.assertNotNull(byteArray2);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-51, 96, 99, -67, 83, -79, -75, -80, -38, -55, 96, 108, 65, 49, -45, -34]");
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager0 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        org.apache.shiro.web.servlet.Cookie cookie1 = null;
        cookieRememberMeManager0.setCookie(cookie1);
        org.apache.shiro.subject.SubjectContext subjectContext3 = null;
        cookieRememberMeManager0.forgetIdentity(subjectContext3);
        org.apache.shiro.subject.Subject subject5 = null;
        cookieRememberMeManager0.onLogout(subject5);
        org.apache.shiro.subject.SubjectContext subjectContext7 = null;
        org.apache.shiro.subject.PrincipalCollection principalCollection8 = cookieRememberMeManager0.getRememberedPrincipals(subjectContext7);
        byte[] byteArray9 = cookieRememberMeManager0.getCipherKey();
        byte[] byteArray10 = cookieRememberMeManager0.getDecryptionCipherKey();
        org.junit.Assert.assertNull(principalCollection8);
        org.junit.Assert.assertNotNull(byteArray9);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[93, 39, -45, 62, 123, 17, -85, 0, 1, 30, -43, 0, -3, -40, -29, 73]");
        org.junit.Assert.assertNotNull(byteArray10);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[93, 39, -45, 62, 123, 17, -85, 0, 1, 30, -43, 0, -3, -40, -29, 73]");
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager0 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray1 = cookieRememberMeManager0.getEncryptionCipherKey();
        org.apache.shiro.subject.Subject subject2 = null;
        cookieRememberMeManager0.onLogout(subject2);
        byte[] byteArray4 = cookieRememberMeManager0.getCipherKey();
        byte[] byteArray5 = cookieRememberMeManager0.getEncryptionCipherKey();
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager6 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray7 = cookieRememberMeManager6.getDecryptionCipherKey();
        org.apache.shiro.web.servlet.Cookie cookie8 = null;
        cookieRememberMeManager6.setCookie(cookie8);
        byte[] byteArray10 = cookieRememberMeManager6.getEncryptionCipherKey();
        cookieRememberMeManager0.setEncryptionCipherKey(byteArray10);
        org.apache.shiro.crypto.CipherService cipherService12 = cookieRememberMeManager0.getCipherService();
        org.junit.Assert.assertNotNull(byteArray1);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-87, -21, -84, 59, -55, -71, -20, 3, 96, 108, 46, -23, 42, -100, 100, 63]");
        org.junit.Assert.assertNotNull(byteArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-87, -21, -84, 59, -55, -71, -20, 3, 96, 108, 46, -23, 42, -100, 100, 63]");
        org.junit.Assert.assertNotNull(byteArray5);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-87, -21, -84, 59, -55, -71, -20, 3, 96, 108, 46, -23, 42, -100, 100, 63]");
        org.junit.Assert.assertNotNull(byteArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[121, 30, 14, 12, 31, -14, -11, 45, -5, -36, -122, -41, 115, -56, -70, -1]");
        org.junit.Assert.assertNotNull(byteArray10);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[121, 30, 14, 12, 31, -14, -11, 45, -5, -36, -122, -41, 115, -56, -70, -1]");
        org.junit.Assert.assertNotNull(cipherService12);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager0 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        org.apache.shiro.web.servlet.Cookie cookie1 = null;
        cookieRememberMeManager0.setCookie(cookie1);
        org.apache.shiro.subject.SubjectContext subjectContext3 = null;
        cookieRememberMeManager0.forgetIdentity(subjectContext3);
        org.apache.shiro.subject.Subject subject5 = null;
        cookieRememberMeManager0.onLogout(subject5);
        org.apache.shiro.subject.SubjectContext subjectContext7 = null;
        org.apache.shiro.subject.PrincipalCollection principalCollection8 = cookieRememberMeManager0.getRememberedPrincipals(subjectContext7);
        org.apache.shiro.subject.Subject subject9 = null;
        org.apache.shiro.authc.AuthenticationToken authenticationToken10 = null;
        org.apache.shiro.authc.AuthenticationInfo authenticationInfo11 = null;
        cookieRememberMeManager0.onSuccessfulLogin(subject9, authenticationToken10, authenticationInfo11);
        byte[] byteArray13 = cookieRememberMeManager0.getCipherKey();
        org.junit.Assert.assertNull(principalCollection8);
        org.junit.Assert.assertNotNull(byteArray13);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[1, 51, 118, -70, 12, -127, -112, 32, 118, 15, 71, 3, -73, -13, -86, 49]");
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager0 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray1 = cookieRememberMeManager0.getDecryptionCipherKey();
        org.apache.shiro.web.servlet.Cookie cookie2 = null;
        cookieRememberMeManager0.setCookie(cookie2);
        byte[] byteArray4 = cookieRememberMeManager0.getEncryptionCipherKey();
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager5 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray6 = cookieRememberMeManager5.getEncryptionCipherKey();
        org.apache.shiro.io.Serializer<org.apache.shiro.subject.PrincipalCollection> principalCollectionSerializer7 = cookieRememberMeManager5.getSerializer();
        byte[] byteArray8 = cookieRememberMeManager5.getEncryptionCipherKey();
        cookieRememberMeManager0.setEncryptionCipherKey(byteArray8);
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager10 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        org.apache.shiro.web.servlet.Cookie cookie11 = null;
        cookieRememberMeManager10.setCookie(cookie11);
        org.apache.shiro.subject.SubjectContext subjectContext13 = null;
        cookieRememberMeManager10.forgetIdentity(subjectContext13);
        byte[] byteArray21 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10, (byte) 0, (byte) 1 };
        cookieRememberMeManager10.setEncryptionCipherKey(byteArray21);
        cookieRememberMeManager0.setEncryptionCipherKey(byteArray21);
        org.apache.shiro.subject.Subject subject24 = null;
        cookieRememberMeManager0.onLogout(subject24);
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager26 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        org.apache.shiro.web.servlet.Cookie cookie27 = null;
        cookieRememberMeManager26.setCookie(cookie27);
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager29 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray30 = cookieRememberMeManager29.getDecryptionCipherKey();
        cookieRememberMeManager26.setDecryptionCipherKey(byteArray30);
        cookieRememberMeManager0.setCipherKey(byteArray30);
        org.junit.Assert.assertNotNull(byteArray1);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-66, 121, 71, -5, 101, 12, -98, -32, 18, 78, 47, -59, -114, 24, -121, -38]");
        org.junit.Assert.assertNotNull(byteArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-66, 121, 71, -5, 101, 12, -98, -32, 18, 78, 47, -59, -114, 24, -121, -38]");
        org.junit.Assert.assertNotNull(byteArray6);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-47, -7, 1, 127, -100, 13, 0, -72, -86, 67, -7, 90, 9, 20, 116, 17]");
        org.junit.Assert.assertNotNull(principalCollectionSerializer7);
        org.junit.Assert.assertNotNull(byteArray8);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-47, -7, 1, 127, -100, 13, 0, -72, -86, 67, -7, 90, 9, 20, 116, 17]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[0, 10, 1, 10, 0, 1]");
        org.junit.Assert.assertNotNull(byteArray30);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[-17, 51, -104, 6, 58, -51, -114, -90, 16, -71, -52, 8, -53, 0, -127, 117]");
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager0 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray1 = cookieRememberMeManager0.getDecryptionCipherKey();
        org.apache.shiro.web.servlet.Cookie cookie2 = null;
        cookieRememberMeManager0.setCookie(cookie2);
        org.apache.shiro.web.servlet.Cookie cookie4 = null;
        cookieRememberMeManager0.setCookie(cookie4);
        org.apache.shiro.subject.Subject subject6 = null;
        org.apache.shiro.authc.AuthenticationToken authenticationToken7 = null;
        org.apache.shiro.authc.AuthenticationInfo authenticationInfo8 = null;
        cookieRememberMeManager0.onSuccessfulLogin(subject6, authenticationToken7, authenticationInfo8);
        org.junit.Assert.assertNotNull(byteArray1);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[95, -71, 31, -117, 113, 90, -35, 71, -101, -79, 88, 79, 5, -15, -19, -12]");
    }
}
